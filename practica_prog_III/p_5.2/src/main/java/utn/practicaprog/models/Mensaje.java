package utn.practicaprog.models;

import java.util.Date;

public class Mensaje {

    private Date fecha;
    private String mensajeParticular;

    private Header header;
    private Footer footer;
    private Body body;

    public Mensaje(Date fecha, String mensajeParticular){
        this.fecha = fecha;
        this.mensajeParticular = mensajeParticular;
    }

    public Date getFecha() {
        return fecha;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Footer getFooter() {
        return footer;
    }

    public void setFooter(Footer footer) {
        this.footer = footer;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public String getMensajeParticular() {
        return mensajeParticular;
    }
}
