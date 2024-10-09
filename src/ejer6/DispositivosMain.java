package ejer6;

import ejer5.Conectable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DispositivosMain {

    public static void main(String[] args) {

        //Crear instancia de teléfono inteligente
        TelefonoInteligente tel = new TelefonoInteligente("Samsung");
        tel.encender();
        tel.conectarWifi();
        tel.desconectarWifi();
        System.out.println("\n");

        //Crear instancia de tablet
        Tablet tablet = new Tablet("Samsung");
        tablet.encender();
        tablet.conectarWifi();
        tablet.desconectarWifi();
        System.out.println("\n");

        //Crear una nueva instancia con scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserte una marca de teléfono");
        System.out.println(tel.introducirMarca(scanner) + "\n");

        //Leer contenido de un txt
        String fichero = "C:\\Users\\ALUMNO\\Desktop\\2º DAM\\Acceso a datos\\basico\\src\\ejer6\\mis-dispositivos.txt";
        System.out.println("Estos son los teléfonos de una lista");
        ArrayList<TelefonoInteligente> listaTel = new ArrayList<>();
        try{
            FileReader fileReader = new FileReader(fichero);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linea;
            while((linea = bufferedReader.readLine()) != null){
                listaTel.add(new TelefonoInteligente(linea));
            }
            fileReader.close();
            bufferedReader.close();
        }catch (IOException e){
            System.out.println("Error: " + e);
        }

        for(TelefonoInteligente cadaTel: listaTel){
            System.out.println(cadaTel);
        }
    }
}
