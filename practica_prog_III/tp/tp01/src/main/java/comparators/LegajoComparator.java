package comparators;

import tp01.Profesor;

import java.util.Comparator;

public class LegajoComparator implements Comparator<Profesor> {
    @Override
    public int compare(Profesor p1, Profesor p2) {
        return p2.getLegajo().compareTo(p1.getLegajo());
    }
}
