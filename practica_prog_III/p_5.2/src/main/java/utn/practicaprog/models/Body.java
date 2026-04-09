package utn.practicaprog.models;

import java.util.Vector;

public class Body {

    private Titulo titulo;
    private Vector<Parrafo> parrafos;

    public Body(String titulo){
        this.titulo = new Titulo(titulo);
        this.parrafos = new Vector<>();
    }

    public void addParrafo(Parrafo parrafo){
        this.parrafos.add(parrafo);
    }

    public Titulo getTitulo() {
        return titulo;
    }

    public Vector<Parrafo> verParrafos(){
        return this.parrafos;
    }

}
