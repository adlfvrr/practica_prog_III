package utn.practicaprog.models;

import java.util.Date;

public class Extraccion extends Transaccion{

    private Date fechaExtraccion;

    public Extraccion(float monto, Date fechaExtraccion){
        super(monto);
        this.fechaExtraccion = fechaExtraccion;
    }

    @Override
    public Date getFechaTransaccion(){
        return this.fechaExtraccion;
    }


}
