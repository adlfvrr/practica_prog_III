package comparators;

import tp01.Alumno;

import java.util.Comparator;

public class PromedioComparator implements Comparator<Alumno> {

    @Override
    public int compare(Alumno alu1, Alumno alu2) {
        return Double.compare(alu2.getPromedio(), alu1.getPromedio());

    }
}
