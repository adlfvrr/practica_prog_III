package utn.practicaprog.models;

public class DireccionBarrio extends Direccion{

    private String barrio;
    private String manzana;
    private String departamento;

    public DireccionBarrio(String descripcion, String barrio, String manzana, String departamento) {
        super(descripcion);
        this.barrio = barrio;
        this.manzana = manzana;
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Descripción: " + this.getDescripcion() + "\nBarrio: " + this.barrio + "\nManzana: " + this.manzana + "\nDepartamento: " + this.departamento;
    }
}
