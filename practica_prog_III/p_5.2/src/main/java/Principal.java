import utn.practicaprog.models.*;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;

public class Principal {

    public static void main(String[] args) {


        //Creamos el mensaje
        Mensaje mensaje = new Mensaje(Date.from(Instant.now()), "Msj particular");
        mensaje.setHeader(new Header("Header"));
        mensaje.setBody(new Body("Título"));
        Parrafo parrafo1 = new Parrafo("Párrafo 1");
        Parrafo parrafo2 = new Parrafo("Párrafo 2");
        mensaje.getBody().addParrafo(parrafo1);
        mensaje.getBody().addParrafo(parrafo2);
        mensaje.setFooter(new Footer("Footer"));

        //Creamos los impresores
        ImpresorResumen impresorResumen = new ImpresorResumen();
        ImpresorCompleto impresorCompleto = new ImpresorCompleto();

        //Imprimimos

        impresorResumen.imprimirMensaje(mensaje);
        impresorCompleto.imprimirMensaje(mensaje);

    }
}
