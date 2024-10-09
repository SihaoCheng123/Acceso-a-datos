package ejer6;

import java.util.Scanner;

abstract class Dispositivos {

    private boolean estado;
    private String marca;

    public Dispositivos(String marca) {
        this.estado = false;
        this.marca = marca;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Dispositivos{" +
                "estado=" + estado +
                ", marca='" + marca + '\'' +
                '}';
    }

    abstract void encender();

    abstract Dispositivos introducirMarca(Scanner scanner);
}
