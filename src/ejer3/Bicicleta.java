package ejer3;

public class Bicicleta extends Vehiculo{

    private String tipoBicicleta;

    public Bicicleta(int velocidadMaxima, String marca, String tipoBicicleta) {
        super(velocidadMaxima, marca);
        this.tipoBicicleta = tipoBicicleta;
    }

    @Override
    public void acelerar() {
        System.out.println("Ding ding");
    }

    @Override
    public String toString() {
        return "La marca " + super.getMarca()
                + " de bicibleta tiene una velocidad máxima de " + super.getVelocidadMaxima()
                + " y es de tipo " + tipoBicicleta;
    }
}
