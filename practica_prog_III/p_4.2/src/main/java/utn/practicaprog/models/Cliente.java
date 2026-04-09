package utn.practicaprog.models;

import java.util.Vector;

public class Cliente {

    private String apellido;
    private String nombre;
    private int clienteNro;
    private Vector<Cuenta> listaCuentas;
    private Banco banco;

    public Cliente(String nombre, String apellido, int clienteNro, Banco banco){
        this.nombre = nombre;
        this.apellido = apellido;
        this.clienteNro = clienteNro;
        this.listaCuentas = new Vector<>();
        this.banco = banco;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public int getClienteNro() {
        return clienteNro;
    }


    public Banco getBanco() {
        return banco;
    }

    public void addCuenta(Cuenta nuevaCuenta){
        this.listaCuentas.add(nuevaCuenta);
        this.banco.addCuenta(nuevaCuenta);
    }

}
