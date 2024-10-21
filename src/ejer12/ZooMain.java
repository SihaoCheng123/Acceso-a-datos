package ejer12;

import java.util.ArrayList;

public class ZooMain {
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();
        zoo.agregarMamiferos();
        zoo.agregarAves();
        zoo.agregarCuidador();
        zoo.mostrarLista();
        zoo.serializarLista();
        zoo.deserializarLista();
    }
}
