package utn.practicaprog.models;

import java.util.Date;

public class Deposito extends Transaccion{

    private Date fechaDeposito;

    public Deposito(float monto, Date fechaDeposito) {
        super(monto);
        this.fechaDeposito = fechaDeposito;
    }

    @Override
    public Date getFechaTransaccion() {
        return this.fechaDeposito;
    }
}
