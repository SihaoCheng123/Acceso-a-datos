package examenParcial1.examenEj2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class InventarioLibros {
    ArrayList<Libro> listaLibros = new ArrayList<>();

    public void agregarLibroFiccion(){
        Scanner scanner = new Scanner(System.in);
        Ficcion libro = new Ficcion("","",0,"");
        System.out.println("Inserte el titulo");
        libro.setTitulo(scanner.next());
        System.out.println("Inserte el autor");
        libro.setAutor(scanner.next());
        System.out.println("Inserte el nº de páginas");
        libro.setPag(scanner.nextInt());
        System.out.println("Inserte el género");
        libro.setGenero(scanner.next());
        this.listaLibros.add(libro);
    }

    public void agregarLibroNoFiccion(){
        Scanner scanner = new Scanner(System.in);
        NoFiccion libro = new NoFiccion("","", 0, "");
        System.out.println("Inserte el titulo");
        libro.setTitulo(scanner.next());
        System.out.println("Inserte el autor");
        libro.setAutor(scanner.next());
        System.out.println("Inserte el nº de páginas");
        libro.setPag(scanner.nextInt());
        System.out.println("Inserte el campo de estudio");
        libro.setCampoEstudio(scanner.next());
        this.listaLibros.add(libro);
    }

    public void mostrarLibros(){
        for (Libro libro: listaLibros){
            System.out.println(libro.toString());
        }
    }

    public void guardarInventario(File file){
        try(FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos)){
            objectOutputStream.writeObject(this.listaLibros);
            System.out.println("Inventario guardado");
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public void cargarInventario(File file){
        ArrayList<Libro> nuevaLista = null;
        if (file.exists()){
            try(FileInputStream fis = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fis)){
                nuevaLista = (ArrayList<Libro>) objectInputStream.readObject();
                for(Libro libro:listaLibros){
                    System.out.println(libro.toString());
                }
                System.out.println("Cargando datos");
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error: " + e);
            }
        }else{
            System.out.println("No existe el archivo");
        }

    }
}
