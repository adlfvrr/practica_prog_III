package comparators;

import tp01.Profesor;

import java.util.Comparator;

public class EdadComparator implements Comparator<Profesor> {
    @Override
    public int compare(Profesor p1, Profesor p2) {
        return Integer.compare(p2.getEdad(), p1.getEdad());
    }
}
