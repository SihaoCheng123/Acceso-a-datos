package ejer10;

public class Rectangulo extends Figura{

    private String base;
    private String altura;

    public Rectangulo(String base, String altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(String base, String altura) {
        this.base = base;
        this.altura = altura;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", color='" + color + '\'' +
                '}';
    }
}
