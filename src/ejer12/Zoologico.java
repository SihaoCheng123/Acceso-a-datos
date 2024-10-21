package ejer12;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Zoologico {
    private static final long serialVersionUID = 1L;
    ArrayList<Gestionable> zoo = new ArrayList<>();

    public Zoologico() {
        this.zoo = zoo;
    }

    public void agregarAves() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre del ave");
        String nombreAve = scanner.next();
        System.out.println("Introduce la edad del ave");
        int edadAve = scanner.nextInt();
        System.out.println("¿Puede volar? Inserte " + true + " o " + false);
        boolean vuelo = scanner.nextBoolean();
        Ave ave = new Ave(nombreAve, edadAve, vuelo);
        zoo.add(ave);
    }

    public void agregarMamiferos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre del mamifero");
        String nombreMamifero = scanner.next();
        System.out.println("Introduce la edad del mamifero");
        int edadMamifero = scanner.nextInt();
        System.out.println("¿Tiene pelo? Inserte " + true + " o " + false);
        boolean pelaje = scanner.nextBoolean();
        Mamifero mamifero = new Mamifero(nombreMamifero, edadMamifero, pelaje);
        zoo.add(mamifero);
    }

    public void agregarCuidador(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre del cuidador");
        String nombreCuidador = scanner.next();
        System.out.println("Introduce la edad del cuidador");
        int edadCuidador = scanner.nextInt();
        System.out.println("Introduce su área de trabajo");
        String areaTrabajo = scanner.next();
        Cuidador cuidador = new Cuidador(nombreCuidador, edadCuidador, areaTrabajo);
        zoo.add(cuidador);
    }

    public void serializarLista() {
        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\ALUMNO\\Desktop\\2º DAM\\Acceso a datos\\basico\\src\\ejer12\\animales.ser");
             ObjectOutputStream salida = new ObjectOutputStream(fos)) {
            salida.writeObject(zoo);
            System.out.println("Archivo serializado correctamente");
        } catch (IOException e) {
            System.out.println("Error " + e);
        }
    }
    @SuppressWarnings("unchecked")
    public void deserializarLista(){
        ArrayList<Gestionable> nuevaLista = null;
        try(FileInputStream fis = new FileInputStream("C:\\Users\\ALUMNO\\Desktop\\2º DAM\\Acceso a datos\\basico\\src\\ejer12\\animales.ser");
        ObjectInputStream entrada = new ObjectInputStream(fis)){
            nuevaLista = (ArrayList<Gestionable>) entrada.readObject();
            for(Gestionable elemento:nuevaLista){
                System.out.println(elemento);
            }
            System.out.println("Archivo deserializado correctamente");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error " + e);
        }
    }

    public void mostrarLista(){
        if (zoo.isEmpty()){
            System.out.println("No hay elementos");
        }else{
            System.out.println("Mostrando lista:");
            for(Gestionable elemento: zoo){
                System.out.println(elemento);
            }
        }
    }
}

