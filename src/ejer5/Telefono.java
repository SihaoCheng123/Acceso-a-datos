package ejer5;

public class Telefono implements Conectable, Recargable{

    @Override
    public void encender() {
        System.out.println("Teléfono encendido");
    }

    @Override
    public void apagar() {
        System.out.println("Teléfono apagado");
    }

    @Override
    public void cargar() {
        System.out.println("Cargando...");
    }

    @Override
    public void nivelDeBateria() {
        System.out.println("Nivel de batería bajo");
    }
}
