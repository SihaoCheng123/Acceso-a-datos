package ejer3;

import java.util.ArrayList;

public class Carrera {

    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Coche(200, "FIAT", 60));
        vehiculos.add(new Bicicleta(50, "Scott", "Urbana"));

        for (Vehiculo vehiculo: vehiculos){
            vehiculo.acelerar();
            System.out.println(vehiculo);
        }
    }
}
