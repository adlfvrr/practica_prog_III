package utn.practicaprog.models;

import java.util.Vector;

public class Curso {

    private String nombreCurso;
    private Profesor profesor;
    private Vector<Alumno> listaAlumnos;


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

    public Curso(String nombreCurso) {
        this.setNombreCurso(nombreCurso);
        this.listaAlumnos = new Vector<>();
    }

    public void add(Alumno alumno) {
        this.listaAlumnos.add(alumno);
    }

    public void imprimir() {

        System.out.println("Profesor: " + this.getProfesor().getApellido() + " - Legajo: " + this.getProfesor().getnLE());

        listaAlumnos.stream()
                .map(a -> "Alumno: " + a.getNombre() + " - Apellido: " + a.getApellido() + " - DNI: " + a.getNroDocumento())
                .forEach(System.out::println);
    }
}
