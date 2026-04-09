import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Ingrese un número entre 1000 y 10.000: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("Ingrese si es par o impar (P/I): ");
        s = new Scanner(System.in);
        String codigoParImpar = s.nextLine();
        CodigoParImpar.codigoParImpar(n, codigoParImpar);
    }
}
