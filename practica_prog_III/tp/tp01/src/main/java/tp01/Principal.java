package tp01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


import comparators.ApellidoComparator;
import comparators.EdadComparator;
import comparators.LegajoComparator;
import comparators.PromedioComparator;
import generators.AlumnosGenerator;
import generators.ProfesoresGenerator;

public class Principal {

    public static void main(String[] args) {

        List<Alumno> la = new ArrayList<Alumno>();
        List<Profesor> lp = new ArrayList<Profesor>();
        AlumnosGenerator listaAlumnos = new AlumnosGenerator();
        ProfesoresGenerator listaProfesores = new ProfesoresGenerator();

        System.out.println("Lista de alumnos: ");
        la = listaAlumnos.generate();
        listaAlumnos.mostrarListaAlumnos(la);
        System.out.println("--------------------------------------------------------");
        System.out.println("Lista de profesores: ");
        lp = listaProfesores.generate();
        listaProfesores.MostrarProfesores(lp);

        System.out.println("\n----------------------------------------------------");
        System.out.println("Punto 1: Ordenar alumnos por apellido ");
        System.out.println("----------------------------------------------------");

        Collections.sort(la, new ApellidoComparator());
        listaAlumnos.mostrarListaAlumnos(la);

        System.out.println("\n----------------------------------------------------");
        System.out.println("Punto 2: Ordenar profesores por legajo (mayor a menor) ");
        System.out.println("----------------------------------------------------");

        Collections.sort(lp, new LegajoComparator());
        listaProfesores.MostrarProfesores(lp);

        System.out.println("\n----------------------------------------------------");
        System.out.println("Punto 3: Mostrar alumno con mayor promedio ");
        System.out.println("----------------------------------------------------");

        Alumno alumnoMayorPromedio = null;
        double mayorPromedio = 0;
        for (Alumno a : la) {
            if (a.getPromedio() > mayorPromedio) {
                mayorPromedio = a.getPromedio();
                alumnoMayorPromedio = a;
            }
        }

        listaAlumnos.mostrarAlumno(alumnoMayorPromedio);

        System.out.println("\n----------------------------------------------------");
        System.out.println("Punto 4: Mostrar alumno con menor promedio ");
        System.out.println("----------------------------------------------------");

        Alumno alumnoMenorPromedio = null;
        double menorPromedio = 0;
        for (Alumno a : la) {
            if (menorPromedio == 0) {
                menorPromedio = a.getPromedio();
            } else {
                if (a.getPromedio() < menorPromedio) {
                    menorPromedio = a.getPromedio();
                    alumnoMenorPromedio = a;
                }
            }
        }

        listaAlumnos.mostrarAlumno(alumnoMenorPromedio);

        System.out.println("\n----------------------------------------------------");
        System.out.println("Punto 5: Mostrar alumnos con promedio mayor a 7, ordenados de mayor a menor promedio ");
        System.out.println("----------------------------------------------------");

        List<Alumno> alumnosMayorProm = new ArrayList<>();
        for (Alumno a : la) {
            if (a.getPromedio() >= 7) {
                alumnosMayorProm.add(a);
            }
        }
        if (alumnosMayorProm.size() == 0) {
            System.out.println("No hay alumnos cuyo promedio supere 7");
        } else {
            Collections.sort(alumnosMayorProm, new PromedioComparator());
            listaAlumnos.mostrarListaAlumnos(alumnosMayorProm);
        }

        System.out.println("\n----------------------------------------------------");
        System.out.println("Punto 6: Mostrar profesores cuyo título sea 'Ingeniero en Sistemas de Información' ");
        System.out.println("----------------------------------------------------");


        List<Profesor> profesoresIngEnSistemas = new ArrayList<>();
        for (Profesor p : lp) {
            if (p.getTitulo().equals("Ingeniero en Sistemas de Información")) {
                profesoresIngEnSistemas.add(p);
            }
        }
        if (profesoresIngEnSistemas.size() == 0) {
            System.out.println("No hay profesores cuyo título sea Ingeniero en Sistemas de Información");
        } else {
            listaProfesores.MostrarProfesores(profesoresIngEnSistemas);
        }

        /* Con iterator
        Iterator<Profesor> profesorFiltrarTitulo = lp.iterator();
        while(profesorFiltrarTitulo.hasNext()){
            if(profesorFiltrarTitulo.next().getTitulo().equalsIgnoreCase("Ingeniero en Sistemas de Información")){
                listaProfesores.mostrarProfesor(profesorFiltrarTitulo.next());
            }
        }
         */

        System.out.println("\n----------------------------------------------------");
        System.out.println("Punto 7: Mostrar profesores ordenados por edad de mayor a menor ");
        System.out.println("----------------------------------------------------");

        Collections.sort(lp, new EdadComparator());
        listaProfesores.MostrarProfesores(lp);

        System.out.println("\n----------------------------------------------------");
        System.out.println("Punto 8: Mostrar suma de edades de profesores ");
        System.out.println("----------------------------------------------------");

        int totalEdades = 0;
        Iterator<Profesor> iteradorProfesores = lp.iterator();
        while (iteradorProfesores.hasNext()) {
            totalEdades += iteradorProfesores.next().getEdad();
        }
        System.out.println("El resultado de la suma de todos los profesores es " + totalEdades);

        System.out.println("\n----------------------------------------------------");
        System.out.println("Punto 9: Mostrar promedio total y promedio de los mejores alumnos (promedio > 7) ");
        System.out.println("----------------------------------------------------");

        //Inicializamos promedios y un contador de alumnos de mayor promedio
        double promedioTotal = 0;
        int contMayorPromedio = 0;
        Iterator<Alumno> iteradorAlumnosPromedios = la.iterator();
        while(iteradorAlumnosPromedios.hasNext()){
            double promedio = iteradorAlumnosPromedios.next().getPromedio();
            promedioTotal += promedio;
            if(promedio >= 7){
                contMayorPromedio++;
            }
        }
        System.out.println("El promedio total es " + promedioTotal/50);
        System.out.println("Los mejores alumnos son " + contMayorPromedio);
        System.out.println("El promedio de los mejores alumnos es " + ((double)contMayorPromedio/50));

    }
}
