package ejer3;

public class Coche extends Vehiculo{

    private int capacidadCombustible;

    public Coche(int velocidadMaxima, String marca, int capacidadCombustible) {
        super(velocidadMaxima, marca);
        this.capacidadCombustible = capacidadCombustible;
    }

    @Override
    public void acelerar() {
        System.out.println("Vroom vroom");
    }

    @Override
    public String toString() {
        return "La marca " + super.getMarca()
                + " de coche tiene una velocidad máxima de " + super.getVelocidadMaxima()
                + " y una capacidad de combustible de " + capacidadCombustible;
    }
}
