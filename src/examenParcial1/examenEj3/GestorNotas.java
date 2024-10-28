package examenParcial1.examenEj3;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorNotas {
    private ArrayList<Estudiante> lista = new ArrayList<>();

    public static void main(String[] args) {
        File file = new File("C:\\Users\\ALUMNO\\Desktop\\2º DAM\\Acceso a datos\\basico\\src\\examenParcial1\\examenEj3\\notas_estudiantes.txt");
        GestorNotas gestor = new GestorNotas();
        gestor.verificarYCrearArchivo(file);
        gestor.leerNotas(file);
        gestor.escribirNotas(file);
        gestor.mostrarInfoArchivo(file);
        gestor.leerNotas(file);
    }

    public void verificarYCrearArchivo(File file) {
        try{
            if (file.exists()){
                System.out.println("El archivo ya existe en la ruta especificada");
            }else{
                file.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

    }

    public void leerNotas(File file){
        ArrayList<Estudiante> nuevaLista = new ArrayList<>();
        try{
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String linea;
            while((linea = bufferedReader.readLine()) != null){
                String [] contenido = linea.split("\\|");
                nuevaLista.add(new Estudiante(contenido[0], Double.parseDouble(contenido[1])));
            }
            System.out.println("Mostrando las notas leidas");
            for (Estudiante estudiante: nuevaLista){
                System.out.println(estudiante.toString());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public void escribirNotas(File file){
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("¿Desea agregar un alumno?");
            String respuesta = scanner.next().trim().toLowerCase();
            while(respuesta.equals("si")){
                agregarEstudiante();
                System.out.println("¿Desea agregar otro?");
                respuesta = scanner.next().trim().toLowerCase();
            }
            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (Estudiante estudiante: this.lista){
                bufferedWriter.write(estudiante.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            System.out.println("Archivo escrito correctamente");
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
    public void mostrarInfoArchivo(File file){
        System.out.println("El archivo existe: " + file.exists());
        System.out.println("Su tamaño: " + file.length());
    }

    public void agregarEstudiante(){
        Scanner scanner = new Scanner(System.in);
        Estudiante estudiante = new Estudiante();
        System.out.println("Introduce su nombre");
        estudiante.setNombre(scanner.next());
        System.out.println("Introduce su nota");
        estudiante.setNota(scanner.nextDouble());
        this.lista.add(estudiante);
    }
}
