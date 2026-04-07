package utn.practicaprog.models;

public class Editorial {

    private String nombre;
    private String telefono;
    private String direccion;
    private String localidad;
    private String email;
    private String CUIT;

    public Editorial(String nombre, String telefono, String email, String CUIT){
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.CUIT = CUIT;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getEmail() {
        return email;
    }

    public String getCUIT() {
        return CUIT;
    }
}
