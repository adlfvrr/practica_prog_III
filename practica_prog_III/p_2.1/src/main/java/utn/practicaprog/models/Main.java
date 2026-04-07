package utn.practicaprog.models;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Programación III");
        curso.setProfesor(new Profesor("Zapata Icart", 23443));
        curso.add(new Alumno("Adolfo", "Vera", "47477499"));
        curso.add(new Alumno("Ezequiel", "Martinez", "39099821"));

        curso.imprimir();
    }
}




