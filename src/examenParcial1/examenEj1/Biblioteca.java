package examenParcial1.examenEj1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    private ArrayList<GestionableBiblioteca> lista = new ArrayList<>();

    public ArrayList<GestionableBiblioteca> getLista() {
        return lista;
    }

    public void agregarLibro(){
        Scanner scanner = new Scanner(System.in);
        Libro libro = new Libro();
        System.out.println("Titulo del libro");
        libro.setTitulo(scanner.next());
        System.out.println("Autor del libro");
        libro.setAutor(scanner.next());
        System.out.println("Año de publicación");
        libro.setAnioPublicacion(scanner.nextInt());
        this.lista.add(libro);
    }

    public void agregarPersonal(){
        Scanner scanner = new Scanner(System.in);
        PersonalBiblioteca personalBiblioteca = new PersonalBiblioteca();
        System.out.println("Nombre");
        personalBiblioteca.setNombre(scanner.next());
        System.out.println("Puesto");
        personalBiblioteca.setPuesto(scanner.next());
        System.out.println("Horas de trabajo");
        personalBiblioteca.setHorasTrabajo(scanner.nextInt());
        this.lista.add(personalBiblioteca);
    }

    public void mostrar(){
        for(GestionableBiblioteca gestionableBiblioteca: lista){
            System.out.println(gestionableBiblioteca);
        }
    }

    public void guardarDatos(File file){
        try(FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos)){
            objectOutputStream.writeObject(this.lista);
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    @SuppressWarnings("unchecked")
    public void leerDatos(File file){
        ArrayList<GestionableBiblioteca> nuevaLista = null;
        if (file.exists()){
            try(FileInputStream fis = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fis)){
                nuevaLista = (ArrayList<GestionableBiblioteca>) objectInputStream.readObject();
                for (GestionableBiblioteca gestionableBiblioteca: nuevaLista){
                    System.out.println(gestionableBiblioteca);
                }
                System.out.println("Archivo leido correctamente");
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error: " + e);
            }
        }else{
            System.out.println("El archivo no existe");
        }

    }

}
