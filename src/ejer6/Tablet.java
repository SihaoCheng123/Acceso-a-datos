package ejer6;

import ejer5.Conectable;

import java.util.Scanner;

public class Tablet extends Dispositivos implements Conectable {

    public Tablet(String marca) {
        super(marca);
    }

    @Override
    void encender() {
        setEstado(true);
        System.out.println("Tablet encendida");
    }

    @Override
    Dispositivos introducirMarca(Scanner scanner) {
        return null;
    }

    @Override
    public void conectarWifi() {
        System.out.println("Tablet conectada al wifi");
    }

    @Override
    public void desconectarWifi() {
        System.out.println("Tablet desconectada del wifi");
    }
}
