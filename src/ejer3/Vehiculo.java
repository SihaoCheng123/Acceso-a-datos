package ejer3;

public class Vehiculo {

    private int velocidadMaxima;
    private String marca;

    public Vehiculo(int velocidadMaxima, String marca) {
        this.velocidadMaxima = velocidadMaxima;
        this.marca = marca;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "velocidadMaxima=" + velocidadMaxima +
                ", marca='" + marca + '\'' +
                '}';
    }

    public void acelerar(){
        System.out.println("Acelerando...");
    }


}
