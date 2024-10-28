package examenParcial1.examenEj2;

public class NoFiccion extends Libro{
    private String campoEstudio;

    public NoFiccion(String titulo, String autor, int pag, String campoEstudio) {
        super(titulo, autor, pag);
        this.campoEstudio = campoEstudio;
    }

    public String getCampoEstudio() {
        return campoEstudio;
    }

    public void setCampoEstudio(String campoEstudio) {
        this.campoEstudio = campoEstudio;
    }

    @Override
    public String toString() {
        return "Libro{" +
                        "titulo='" + getTitulo() + '\'' +
                        ", autor='" + getAutor() + '\'' +
                        ", pag=" + getPag() +
                "campoEstudio='" + campoEstudio + '\'' +
                '}';
    }
}
