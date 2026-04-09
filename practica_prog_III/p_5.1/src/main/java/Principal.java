import utn.practicaprog.models.*;

public class Principal {

    public static void main(String[] args){

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();

        //Establecemos lo pedido en la consigna
        //Persona 1:

        persona1.setNombre("Juan");
        persona1.setApellido("Rodríguez");
        Direccion direccion1 = new DireccionCalleNumero("Dirección personal", "San Martín", 325);
        persona1.setDireccion(direccion1);

        //Persona 2:

        persona2.setNombre("María");
        persona2.setApellido("Rodríguez");
        Direccion direccion2 = new DireccionEdificio("Dirección de la oficina comercial", "San Martín", 600, "4B");
        persona2.setDireccion(direccion2);

        //Persona 3:

        persona3.setNombre("Jose");
        persona3.setApellido("Rodríguez");
        Direccion direccion3 = new DireccionBarrio("Dirección del estudio", "La luna II", "M", "Dpto. 03");
        persona3.setDireccion(direccion3);

        //Imprimimos

        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);

    }

}
