package ejer6;

import ejer5.Conectable;

import java.util.Scanner;

public class TelefonoInteligente extends Dispositivos implements Conectable {

    public TelefonoInteligente(String marca) {
        super(marca);
    }

    @Override
    void encender() {
        setEstado(true);
        System.out.println("Teléfono encendido");
    }

    @Override
    TelefonoInteligente introducirMarca(Scanner scanner) {
        scanner = new Scanner(System.in);
        TelefonoInteligente telNuevo = new TelefonoInteligente("");
        telNuevo.setMarca(scanner.nextLine());
        return telNuevo;
    }

    @Override
    public void conectarWifi() {
        System.out.println("Teléfono conectado al wifi");
    }

    @Override
    public void desconectarWifi() {
        System.out.println("Teléfono desconectado del wifi");
    }

    @Override
    public String toString(){
        return "Este teléfono es de la marca " + getMarca();
    }
}
