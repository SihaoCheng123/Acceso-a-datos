package ejer5;

public class Telefono implements Conectable, Recargable{


    @Override
    public void cargar() {
        System.out.println("Cargando...");
    }

    @Override
    public void nivelDeBateria() {
        System.out.println("Nivel de batería bajo");
    }

    @Override
    public void conectarWifi() {

    }

    @Override
    public void desconectarWifi() {

    }
}
