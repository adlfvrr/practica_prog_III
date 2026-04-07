package utn.practicaprog.models;

public class Autor {

    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String sexo;
    private String email;


    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Autor(String nombre, String apellido, String fechaNacimiento, String sexo, String email) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setFechaNacimiento(fechaNacimiento);
        this.setEmail(email);
        this.setSexo(sexo);
    }

}
