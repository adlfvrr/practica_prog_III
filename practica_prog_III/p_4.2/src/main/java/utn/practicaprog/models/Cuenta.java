package utn.practicaprog.models;

import java.util.Vector;

public class Cuenta {

    private int nroCuenta;
    private Cliente cliente;
    private Vector<Transaccion> listaTrans;
    private float saldo;

    public Cuenta(int nroCuenta){
        this.listaTrans = new Vector<>();
        this.saldo = 0;
    }

    public float getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void addTransaccion(Transaccion transaccion){
        if(transaccion instanceof Deposito){
            this.saldo += transaccion.getMonto();
        }
        else if(transaccion instanceof Extraccion){
            this.saldo -= transaccion.getMonto();
        }
        this.listaTrans.add(transaccion);
    }

}
