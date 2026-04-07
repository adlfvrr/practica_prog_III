package utn.practicaprog.models;

public class Profesor {

    private String apellido;
    private int nLE;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getnLE() {
        return nLE;
    }

    public void setnLE(int nLE) {
        this.nLE = nLE;
    }

    public Profesor(String apellido, int nLE){
        this.setApellido(apellido);
        this.setnLE(nLE);
    }

}
