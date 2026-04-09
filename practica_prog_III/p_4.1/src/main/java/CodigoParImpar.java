public class CodigoParImpar {

    public static void codigoParImpar(int n, String codigoParImpar){
        if (n >= 1000 && n <= 10000) {
            if (n % 2 == 0 && codigoParImpar.toLowerCase().equals("p")) {
                System.out.println("Correcto: Número Par: " + n + " Código: P");
            } else if (n % 2 == 1 && codigoParImpar.toLowerCase().equals("i")) {
                System.out.println("Correcto: Número Impar: " + n + " Código: I");
            } else if (n % 2 == 0 && codigoParImpar.toLowerCase().equals("i")) {
                System.out.println("Incorrecto: Número Par: " + n + " Código: I");
            } else if (n % 2 == 1 && codigoParImpar.toLowerCase().equals("p")) {
                System.out.println("Incorrecto: Número Impar: " + n + " Código: P");
            }
        }
        else{
            System.out.println("El número debe ser entre 1000 y 10.000");
        }
    }

}
