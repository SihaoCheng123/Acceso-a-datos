package ejer8;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class LeerAlumnoFichero {

    public static void main(String[] args) {
        String ruta = "C:\\Users\\ALUMNO\\Desktop\\2º DAM\\Acceso a datos\\basico\\src\\ejer8\\alumnos.txt";
        ArrayList<Alumno> alumnos = new ArrayList<>();
        readFileTXT(alumnos);
        for (Alumno alumno:alumnos){
            System.out.println(alumno);
        }
        crearArchivoConAlumnos(alumnos);
        trabajandoConArchivos();

        System.out.println("El alumno con la nota más alta es: " + getAlumnoNotaMasAlta(alumnos));
    }

    public static ArrayList<Alumno> readFileTXT(ArrayList<Alumno> alumnos){
        String ruta = "C:\\Users\\ALUMNO\\Desktop\\2º DAM\\Acceso a datos\\basico\\src\\ejer8\\alumnos.txt";

        try{
            FileReader fileReader = new FileReader(ruta);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linea;
            while((linea = bufferedReader.readLine()) != null){
                String[] contenido = linea.split("\n");
                alumnos.add(new Alumno(contenido[0], contenido[1],contenido[2],contenido[3]));
            }
            fileReader.close();
            bufferedReader.close();
        }catch (IOException e){
            System.out.println("Error: " + e);
        }
        return alumnos;
    }

    public static Alumno getAlumnoNotaMasAlta(ArrayList<Alumno> alumnos){
        Alumno alumnoNotaMasAlta = new Alumno();
        float nota = 0;
        for(Alumno alumno:alumnos){
            if (nota < alumno.getNota()){
                nota = alumno.getNota();
                alumnoNotaMasAlta = alumno;
            }
        }
        return alumnoNotaMasAlta;
    }

    public static void crearArchivoConAlumnos(ArrayList<Alumno> alumnos){
        String nuevoArchivo = "C:\\Users\\ALUMNO\\Desktop\\2º DAM\\Acceso a datos\\basico\\src\\ejer8\\alumnosvacio.txt";
        BufferedWriter writter = null;

        try{
            writter = new BufferedWriter(new FileWriter(nuevoArchivo));
            for (Alumno alumno:alumnos){
                writter.write(alumno.toString());
                writter.newLine();
            }
            System.out.println("Archivo escrito correctamente");
            writter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void trabajandoConArchivos(){
        File f = new File("C:\\Users\\ALUMNO\\Desktop\\2º DAM\\Acceso a datos\\basico\\src\\ejer8\\alumnosvacio2.txt");
        System.out.println(f.exists());
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        try {
            System.out.println(f.createNewFile());
            File f2 = new File("C:\\Users\\ALUMNO\\Desktop\\2º DAM\\Acceso a datos\\basico\\src\\ejer8\\alumnosvacio2.txt");
            System.out.println(f.renameTo(f2));
            System.out.println("Puedo leeerlo: " + f2.canRead());
            System.out.println("Puedo escribir: " + f2.canWrite());
            System.out.println("Puedo ejecutarlo: " + f2.canExecute());
            System.out.println("Para saber los bits: " + f2.length());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
