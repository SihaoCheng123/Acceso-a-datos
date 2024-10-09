package ejer5;

public class Ordenador implements Conectable, Recargable{

    @Override
    public void cargar() {
        System.out.println("Cargando...");
    }

    @Override
    public void nivelDeBateria() {
        System.out.println("Nivel de batería alto");
    }

    @Override
    public void conectarWifi() {

    }

    @Override
    public void desconectarWifi() {

    }
}
