package examenParcial1.examenEj2;

public class Ficcion extends Libro{

    private String genero;

    public Ficcion(String titulo, String autor, int pag, String genero) {
        super(titulo, autor, pag);
        this.genero = genero;
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", pag=" + getPag() +
                "genero='" + genero + '\'' +
                '}';
    }
}
