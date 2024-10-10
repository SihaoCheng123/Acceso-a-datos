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

        System.out.println("El alumno con la nota más alta es: " + getAlumnoNotaMasAlta(alumnos));
    }

    public static ArrayList<Alumno> readFileTXT(ArrayList<Alumno> alumnos){
        String ruta = "C:\\Users\\ALUMNO\\Desktop\\2º DAM\\Acceso a datos\\basico\\src\\ejer8\\alumnos.txt";

        try{
            FileReader fileReader = new FileReader(ruta);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linea;
            while((linea = bufferedReader.readLine()) != null){
                String[] contenido = linea.split(",");
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
}
