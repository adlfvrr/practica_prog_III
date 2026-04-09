package utn.practicaprog.models;

import java.util.Date;

public abstract class Transaccion {

    private float monto;

    public Transaccion(float monto) {
        this.monto = monto;
    }

    public float getMonto() {
        return monto;
    }

    public abstract Date getFechaTransaccion();

}
