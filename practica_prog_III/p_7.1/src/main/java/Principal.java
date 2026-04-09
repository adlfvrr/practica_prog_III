import utn.practicaprog.models.ManejadorArchivo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    /*public static void main(String[] args){

        //Realizamos el código de la consigna 1

        //int a = Integer.parseInt(args[0]); Modificamos porque no funciona esta manera de leer un input
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("El número ingresado es " + a);
        System.out.println("Fin del programa");


        Respondemos consignas:
        a) Nos devuelve los SOUT que hicimos (a = 8745)

        b) No devuelve nada hasta que ingresemos un caracter (a = " ")

        c) Devuelve un InputMismatchException (a = 12G4)




    } */
    //Agrego otro main para completar el ejercicio 2

    /* public static void main(String[] args) {
        // Al código anterior, le agregamos un try-catch-finally
        try {

            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            System.out.println("El número ingresado es " + a);
        } catch (
                InputMismatchException ex) { //Colocamos InputMismatchException, debido a que es la exception que el programa nos lanzó
            System.out.println("No ingresó un número");
        } finally {
            System.out.println("Fin del programa");
        }

        Respondemos consignas:
        a) Nos devuelve los SOUT que hicimos (a = 8745)

        b) No devuelve nada hasta que ingresemos un caracter (a = " ")

        c) Devuelve un el mensaje que colocamos en el catch (a = 12G4)
    }
        */
    //Vuelvo a realizar main para realizar la consigna 3

    /*public static void main(String[] args) {
        //repetimos todo el código anterior
        try {
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            System.out.println("El número ingresado es " + a);
        }catch(Exception ex){
            System.out.println("Se ha producido una excepción");
        }catch (InputMismatchException ex) {
            System.out.println("No ingresó un número");
        } finally {
            System.out.println("Fin del programa");
        }

        - Al intentar compilar la clase, se produce un error debido a que la excepción Exception abarca a todas las demás,
        por lo tanto, si ocurre una excepción, lanzará el bloque catch de Exception (Es decir, el bloque catch de
        inputMismatchException no se ejecutará, sobra).
        - Para poder ejecutar la aplicación, debemos realizar una "jerarquía" de excepciones, colocando las excepciones
        menos generales al principio (numberFormat, inputMismatch, illegalArgument, o bien personalizadas) y las más
        generales como Exception o RuntimeException al final.

    }
*/

    public static void main(String[] args) {

        try {
            ManejadorArchivo.LeerArchivo("C:\\miArchivo.txt");
        } catch (Exception ex) {
            System.out.println("Se ha producido un error al leer el archivo");
        }
    }

    /*Habrá un error de compilación al ejecutar la clase. El manejo de archivos debería realizarse dentro del método Principal (main),
      no dentro de una clase.
      Por lo tanto, todo lo de la clase ManejadorArchivo lo traería al main y en el bloque finally cerraría el FileInputStream.
      Al realizarse el manejo de excepciones dentro de main, se debe realizar la lectura de archivos dentro del mismo.
     */
}
