package utn.practicaprog.models;

import java.util.Vector;

public class Curso {

    private String nombreCurso;
    private Profesor profesor;
    private Vector<Alumno> listaAlumnos;
    private double porcAsistencia;
    private int cantClases;
    private int clasesDictadas;


    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Curso(String nombreCurso, int cantClases) {
        this.setNombreCurso(nombreCurso);
        this.listaAlumnos = new Vector<>();
        this.cantClases = cantClases;
    }

    public void add(Alumno alumno) {
        if (!alumno.getNombre().isEmpty() && !alumno.getApellido().isEmpty() && alumno.getNroDocumento() != null) {
            this.listaAlumnos.add(alumno);
        }
    }

    public void imprimir() {

        System.out.println("Profesor: " + this.getProfesor().getApellido() + " - Legajo: " + this.getProfesor().getnLE());
        System.out.println("Cantidad de clases del curso: " + this.getCantClases());

        listaAlumnos.stream()
                .map(a -> "Alumno: " + a.getNombre() + " - Apellido: " + a.getApellido() + " - DNI: " + a.getNroDocumento())
                .forEach(System.out::println);
    }

    public double getPorcAsistencia() {
        return porcAsistencia;
    }

    public void setPorcAsistencia(double porcAsistencia) {
        this.porcAsistencia = porcAsistencia;
    }

    public int getCantClases() {
        return cantClases;
    }

    public int getClasesDictadas() {
        return clasesDictadas;
    }

    public void setClasesDictadas(int clasesDictadas) {
        this.clasesDictadas = clasesDictadas;
    }

    public void alumnoCumple(Long documento) {

        int cont = 0;
        int idx = -1;
        while (cont < this.listaAlumnos.size() && idx == -1) {
            if (this.listaAlumnos.get(cont).getNroDocumento() == documento) {
                idx = cont;
            }
            cont++;
        }
        Alumno a = this.listaAlumnos.get(idx);
        if ((a.getAsistencia() / this.cantClases) * 100 >= this.porcAsistencia) {
            System.out.println("El alumno " + a.getNombre() + " " + a.getApellido() + " cumple con el porcentaje mínimo");
        } else {
            System.out.println("El alumno " + a.getNombre() + " " + a.getApellido() + " NO cumple con el porcentaje mínimo");
        }
    }


}

