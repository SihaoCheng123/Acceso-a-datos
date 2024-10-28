package repasoExamen2;

import repasoExamen.GestorInventario;

import java.io.*;
import java.util.ArrayList;

public class GestorVehiculoBinario {
    ArrayList<Coche> listaCoches = new ArrayList<>();

    public static void main(String[] args) {
        File file = new File("C:\\Users\\ALUMNO\\Desktop\\2º DAM\\Acceso a datos\\basico\\src\\repasoExamen2\\vehiculos.ser");
        Coche coche1 = new Coche("2312SEF", "Toyota", "20", "2016", "");
        Coche coche2 = new Coche("2321GEF", "Toyota", "10", "2020", "");
        Coche coche3 = new Coche("2341EGW", "Toyota", "30", "2024", "");
        GestorVehiculoBinario gestor = new GestorVehiculoBinario();
        gestor.verificarArchivo(file);
        gestor.leerFichero(file);
    }

    public void verificarArchivo(File file){
        FileOutputStream fos = null;
        try{
            if (file.exists()){
                System.out.println("El tamaño del archivo en bytes es " + file.length());
            }else{
                System.out.println("El archivo no existe. Creando archivo");
                fos = new FileOutputStream(file);
                ObjectOutputStream entrada = new ObjectOutputStream(fos);
                entrada.writeObject(this.listaCoches);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void leerFichero(File file){
        ArrayList<Coche> nuevaLista = null;
        try(FileInputStream fis = new FileInputStream(file);
        ObjectInputStream entrada = new ObjectInputStream(fis)) {
            nuevaLista = (ArrayList<Coche>) entrada.readObject();

            for (Coche coche: nuevaLista){
                System.out.println(coche);
            }
            System.out.println("Archivo leido correctamente");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e);
    }

    }

    public void agregarCoches(File file){

    }

    public void mostrarPorPantalla(File file){
        ArrayList<Coche> nuevaLista = null;
        try(FileInputStream fis = new FileInputStream(file);
        ObjectInputStream entrada = new ObjectInputStream(fis)){
           nuevaLista =  (ArrayList<Coche>) entrada.readObject();
           for(Coche coche : nuevaLista){
               System.out.println(coche);
           }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

