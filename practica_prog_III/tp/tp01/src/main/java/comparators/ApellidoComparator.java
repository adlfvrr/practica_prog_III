package comparators;

import tp01.Alumno;
import tp01.Persona;

import java.util.Comparator;

public class ApellidoComparator implements Comparator<Alumno> {

    @Override
    public int compare(Alumno alu1, Alumno alu2) {
        //Verificamos si el apellido se repite
        if (alu1.getApellido().equals(alu2.getApellido())) {
            //Si se repite, se ordena por nombre (tal como pide la actividad)
            return alu1.getNombre().compareTo(alu2.getNombre());
        }
        //Si no verifica, ordenamos por apellido
        return alu1.getApellido().compareTo(alu2.getApellido());
    }

}
