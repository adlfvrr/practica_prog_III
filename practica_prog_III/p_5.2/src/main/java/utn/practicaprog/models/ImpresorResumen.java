package utn.practicaprog.models;

public class ImpresorResumen implements Impresor{

    public ImpresorResumen(){
    }

    @Override
    public void imprimirMensaje(Mensaje mensaje) {
        System.out.println("-----------------------------------");
        System.out.println(mensaje.getHeader().getMensajeHeader());
        System.out.println("-----------------------------------");
        System.out.println(mensaje.getBody().getTitulo().getTexto());
        System.out.println("-----------------------------------");
        System.out.println(mensaje.getFooter().getMensajeFooter());
        System.out.println("-----------------------------------");
    }

}
