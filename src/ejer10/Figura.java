package ejer10;

abstract class Figura {

    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public Figura() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public abstract String toString();
}
