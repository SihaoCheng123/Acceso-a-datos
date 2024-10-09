package ejer5;

public class ConectableMain {

    public static void main(String[] args) {
        Telefono tel = new Telefono();

        tel.cargar();
        tel.nivelDeBateria();

        Ordenador orde = new Ordenador();

        orde.cargar();
        orde.nivelDeBateria();

    }
}
