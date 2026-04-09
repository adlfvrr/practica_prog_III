import java.sql.Date;
import java.text.DateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {

    public static void ejercicio1() {

        try {
            Scanner s = new Scanner(System.in);
            Number n1;
            Number n2;

            System.out.println("Ingrese primer número: ");
            String n = s.next();

            if (n.contains(".") || n.contains(",")) {
                n = n.replace(',', '.');
                n1 = Double.parseDouble(n);
            } else {
                n1 = Integer.parseInt(n);
            }

            System.out.println("Ingrese segundo número: ");
            n = s.next();

            if (n.contains(".") || n.contains(",")) {
                n = n.replace(',', '.');
                n2 = Double.parseDouble(n);
            } else {
                n2 = Integer.parseInt(n);
            }

            if (n1 instanceof Double && n2 instanceof Double) {
                double d1 = (Double) n1;
                double d2 = (Double) n2;
                System.out.println("Ámbos double. Máximo: " + Math.max(d1, d2));
            } else if (n1 instanceof Double || n2 instanceof Double) {
                if (n1 instanceof Double) {
                    double d = (Double) n1;
                    System.out.println("Representación hexadecimal del Double: " + Double.toHexString(d));
                } else {
                    double d = (Double) n2;
                    System.out.println("Representación hexadecimal del Double: " + Double.toHexString(d));
                }
            }
            else{
                int i1 = (Integer) n1;
                int i2 = (Integer) n2;
                System.out.println("Representación hexadecimal del Integer: " + Integer.toHexString(i1));
                System.out.println("Representación hexadecimal del Integer: " + Integer.toHexString(i2));
                System.out.println("Representación binaria del Integer: " + Integer.toBinaryString(i1));
                System.out.println("Representación binaria del Integer: " + Integer.toBinaryString(i2));
            }
        } catch (Exception ex) {
            System.out.println("Ocurrió una excepción: " + ex.getMessage());
        }
    }

    public static void ejercicio2(int cantDias){
        System.out.println("Día: " + LocalDateTime.now().getDayOfWeek());
        System.out.println("Mes: " + LocalDateTime.now().getMonth());
        System.out.println("Año: " + LocalDateTime.now().getYear());
        System.out.println("Fecha completa: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd-hh:mm")));

        LocalDateTime fechaConDiasSumados = LocalDateTime.now().plusDays(cantDias);

        System.out.println(" ");
        System.out.println("Fecha con días sumados: " + cantDias + " días");

        System.out.println("Día: " + fechaConDiasSumados.getDayOfWeek());
        System.out.println("Mes: " + fechaConDiasSumados.getMonth());
        System.out.println("Año: " + fechaConDiasSumados.getYear());
        System.out.println("Fecha completa: " + fechaConDiasSumados.format(DateTimeFormatter.ofPattern("yyyy/MM/dd-hh:mm")));
    }


    public static void main(String[] args) {
        ejercicio1();
        ejercicio2(20);

    }

}
