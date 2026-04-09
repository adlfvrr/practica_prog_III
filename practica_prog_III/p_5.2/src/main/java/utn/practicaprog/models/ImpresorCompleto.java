package utn.practicaprog.models;

public class ImpresorCompleto implements Impresor {

    public ImpresorCompleto() {

    }


    @Override
    public void imprimirMensaje(Mensaje msj) {
        System.out.println(msj.getHeader().getMensajeHeader());
        System.out.println(msj.getBody().getTitulo().getTexto());
        for (Parrafo parrafo : msj.getBody().verParrafos()) {
            System.out.println(parrafo.getTexto());
            System.out.println(" ");
        }
        System.out.println(msj.getFooter().getMensajeFooter());
        System.out.println(msj.getMensajeParticular());
    }

}
