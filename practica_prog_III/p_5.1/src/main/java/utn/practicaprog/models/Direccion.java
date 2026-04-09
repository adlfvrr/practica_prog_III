package utn.practicaprog.models;

public abstract class Direccion {

    private String descripcion;

    public Direccion(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public abstract String toString();

}
