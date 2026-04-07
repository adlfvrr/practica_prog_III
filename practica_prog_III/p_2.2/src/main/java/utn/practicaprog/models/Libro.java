package utn.practicaprog.models;

public class Libro {

    private String nombre;
    private Autor autor;
    private Editorial editorial;
    private String anioPublicacion;
    private int cantidadEjemplares;
    private double costo;

    //No se que es ISDN asi que no lo tomo en cuenta
    //getters & setters

    public String getNombre() {
        return nombre;
    }


    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public String getAnioPublicacion() {
        return anioPublicacion;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public double getCosto() {
        return costo;
    }

    public Libro(String nombre, Editorial editorial, String anioPublicacion, int cantidadEjemplares, double costo) {

        this.nombre = nombre;
        this.editorial = editorial;
        this.anioPublicacion = anioPublicacion;
        this.cantidadEjemplares = cantidadEjemplares;
        this.costo = costo;

    }

}
