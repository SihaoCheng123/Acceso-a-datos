package ejer5;

public class Ordenador implements Conectable, Recargable{

    @Override
    public void encender() {
        System.out.println("Ordenador encendido");
    }

    @Override
    public void apagar() {
        System.out.println("Ordenador apagado");
    }

    @Override
    public void cargar() {
        System.out.println("Cargando...");
    }

    @Override
    public void nivelDeBateria() {
        System.out.println("Nivel de batería alto");
    }
}
