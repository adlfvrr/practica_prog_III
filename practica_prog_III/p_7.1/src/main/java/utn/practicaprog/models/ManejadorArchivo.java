package utn.practicaprog.models;

import java.io.FileInputStream;

public class ManejadorArchivo {

    public static void LeerArchivo(String nombreArchivo){
        byte[] elemento = new byte[50];
        FileInputStream f = new FileInputStream(nombreArchivo);
        f.read(elemento);
        f.close();
    }


}
