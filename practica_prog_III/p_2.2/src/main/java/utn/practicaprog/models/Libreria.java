package utn.practicaprog.models;

import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class Libreria {

    private String nombre;

    private Vector<Libro> libros;

    public Libreria(String nombre) {
        this.nombre = nombre;
        this.libros = new Vector<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void addLibro(Libro libro) {
        this.libros.add(libro);
    }

    public List<Libro> verLibrosPorApellidoAutor(String apellidoAutor) {

        return this.libros.stream()
                .filter(l -> l.getAutor().getApellido().equals(apellidoAutor))
                .collect(Collectors.toList());
    }

    public Libro verLibroPorNombre(String nombre) {

        int cont = 0;
        int idx = -1;

        while (cont < this.libros.size() && idx == -1) {
            if (libros.get(cont).getNombre().equals(nombre)) {
                idx = cont;
            }
            cont++;
        }
        return this.libros.get(idx);
    }

    public void Imprimir() {
        for (Libro l : this.libros) {

            System.out.println("Libro: " + l.getNombre() + " - Ejemplares: " + l.getCantidadEjemplares() + " - Costo: $" + l.getCosto());
            System.out.println("Autor: " + l.getAutor().getNombre() + " " + l.getAutor().getApellido());
            System.out.println("Editorial: " + l.getEditorial().getNombre() + " Dirección: " + l.getEditorial().getDireccion());
        }
    }

}
