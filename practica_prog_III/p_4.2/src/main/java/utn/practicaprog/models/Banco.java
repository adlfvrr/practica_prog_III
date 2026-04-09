package utn.practicaprog.models;

import java.util.Vector;

public class Banco {

    private String nombre;

    Vector<Cuenta> cuentasBanco;


    public Banco(String nombre){
        this.nombre = nombre;
        this.cuentasBanco = new Vector<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void addCuenta(Cuenta nuevaCuenta){
        this.cuentasBanco.add(nuevaCuenta);
    }

    public float getDisponibleBanco(){
        float monto = 0;
        for(Cuenta cuenta : this.cuentasBanco){
            monto += cuenta.getSaldo();
        }
        return monto;
    }

}
