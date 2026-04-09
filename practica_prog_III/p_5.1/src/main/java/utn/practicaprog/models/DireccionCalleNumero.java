package utn.practicaprog.models;

public class DireccionCalleNumero extends Direccion{

    private String calle;
    private int numero;

    public DireccionCalleNumero(String descripcion, String calle, int numero){
        super(descripcion);
        this.calle = calle;
        this.numero = numero;
    }

    @Override
    public String toString(){
        return "Descripcion: " + this.getDescripcion() + "\nCalle: " + this.calle + "\nNúmero: " + this.numero;
    }

}
