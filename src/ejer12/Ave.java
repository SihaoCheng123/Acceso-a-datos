package ejer12;

public class Ave extends Animal{
    private boolean puedeVolar;

    public Ave(String name, int age, boolean puedeVolar) {
        super(name, age);
        this.puedeVolar = puedeVolar;
    }


    public boolean isPuedeVolar() {
        return puedeVolar;
    }

    @Override
    public String toString() {
        return "Ave{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", puedeVolar=" + puedeVolar +
                '}';
    }

    @Override
    public String getType() {
        return "animal";
    }
}
