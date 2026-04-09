package utn.practicaprog.models;

public class DireccionEdificio extends Direccion{

    private String calle;
    private int numero;
    private String departamento;

    public DireccionEdificio(String descripcion, String calle, int numero, String departamento) {
        super(descripcion);
        this.calle = calle;
        this.numero = numero;
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Descripción: " + this.getDescripcion() + "\nCalle: " + this.calle + "\nNúmero: " + this.numero + "\nDepartamento: " + this.departamento;
    }
}
