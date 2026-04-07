package utn.practicaprog.models;

public class Profesor {

    private String nombre;
    private String apellido;
    private Long nLE;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Long getnLE() {
        return nLE;
    }


    public Profesor(String nombre, String apellido, Long nLE) {
        this.nombre = nombre;
        this.apellido = (apellido);
        this.nLE = (nLE);
    }

}
