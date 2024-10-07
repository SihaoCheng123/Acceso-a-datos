package ejer5;

public class ConectableMain {

    public static void main(String[] args) {
        Telefono tel = new Telefono();
        tel.encender();
        tel.cargar();
        tel.nivelDeBateria();
        tel.apagar();
        Ordenador orde = new Ordenador();
        orde.encender();
        orde.cargar();
        orde.nivelDeBateria();
        orde.apagar();
    }
}
