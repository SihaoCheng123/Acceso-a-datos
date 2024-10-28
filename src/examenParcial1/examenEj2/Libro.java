package examenParcial1.examenEj2;

import java.io.Serializable;

abstract class Libro implements Serializable {
    private String id;
    private String titulo;
    private String autor;
    private int pag;

    public Libro(String titulo, String autor, int pag) {
        this.titulo = titulo;
        this.autor = autor;
        this.pag = pag;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPag() {
        return pag;
    }

    public void setPag(int pag) {
        this.pag = pag;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", pag=" + pag +
                '}';
    }
}
