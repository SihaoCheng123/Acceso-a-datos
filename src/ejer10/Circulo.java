package ejer10;

public class Circulo extends Figura{

    private String radio;

    public Circulo(String radio, String color) {
        super(color);
        this.radio = radio;
    }

    public Circulo(String radio) {
        this.radio = radio;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }
}
