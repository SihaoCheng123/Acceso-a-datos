package ejer12;

public class Mamifero extends Animal{
    private boolean tienePelo;

    public Mamifero(String name, int age, boolean tienePelo) {
        super(name, age);
        this.tienePelo = tienePelo;
    }

    public boolean isTienePelo() {
        return tienePelo;
    }

    public void setTienePelo(boolean tienePelo) {
        this.tienePelo = tienePelo;
    }

    @Override
    public String toString() {
        return "Mamifero{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tienePelo=" + tienePelo +
                '}';
    }

    @Override
    public String getType() {
        return "animal";
    }
}
