package ejer10;

public class Cuadrado extends Figura{

    private String lado;

    public Cuadrado(String lado, String color) {
        super(color);
        this.lado = lado;
    }

    public Cuadrado(String lado) {
        this.lado = lado;
    }

    public String getLado() {
        return lado;
    }

    public void setLado(String lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                ", color='" + color + '\'' +
                '}';
    }
}
