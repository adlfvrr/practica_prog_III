package utn.practicaprog.models;

public class Alumno {

    private String nombre;
    private String apellido;
    private Long nroDocumento;
    private int asistencia;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(Long nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public Alumno(String nombre, String apellido, Long dni) {

        this.setApellido(apellido);
        this.setNombre(nombre);
        this.setNroDocumento(dni);
    }

    public int getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }
}
