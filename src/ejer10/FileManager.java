package ejer10;

import ejer8.Alumno;

import java.io.*;
import java.util.ArrayList;

public class FileManager {

    private File file;

    public FileManager(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public static void main(String[] args) {
        //Crear con la ruta
        File file = new File("C:\\Users\\ALUMNO\\Desktop\\2º DAM\\Acceso a datos\\basico\\src\\ejer10\\figuras.txt");
        FileManager fileManager = new FileManager(file);
        //Comprobar si existe
        System.out.println("¿Existe este archivo? " + fileManager.existes());
        //Leer el archivo
        fileManager.importFromFile();
        //Crear array e importar los datos
        ArrayList<Figura> listaFiguras = new ArrayList<>();
        fileManager.getDataFromFile(listaFiguras);
        for (Figura figura: listaFiguras){
            if (figura.getColor() == null){
                System.out.println("Figura no válida");
            }else{
                System.out.println(figura);
            }
        }
        //Crear nuevo fichero
        fileManager.crearNuevoFichero(listaFiguras);

    }

    public boolean existes(){
        return getFile().exists();
    }

    public void importFromFile(){

        try{
            FileReader fileReader = new FileReader(file.getPath());
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linea;
            while((linea = bufferedReader.readLine()) != null){
                System.out.println(linea);
            }
            fileReader.close();
            bufferedReader.close();
        }catch (IOException e){
            System.out.println("Error: " + e);
        }
    }

    public ArrayList<Figura> getDataFromFile(ArrayList<Figura> listaFiguras){

        try{
            FileReader fileReader = new FileReader(file.getPath());
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linea;
            while((linea = bufferedReader.readLine()) != null){
                String[] contenido = linea.split(" ");
                try{
                    if (contenido[0].equals("Rectangulo")){
                        listaFiguras.add(new Rectangulo(contenido[1],contenido[2],contenido[3]));
                    } else if (contenido[0].equals("Circulo")) {
                        listaFiguras.add(new Circulo(contenido[1],contenido[2]));
                    } else{
                        listaFiguras.add(new Cuadrado(contenido[1],contenido[2]));
                    }
                }catch (IndexOutOfBoundsException e){
                    if (contenido[0].equals("Rectangulo")){
                        listaFiguras.add(new Rectangulo(contenido[1],contenido[2]));
                    } else if (contenido[0].equals("Circulo")) {
                        listaFiguras.add(new Circulo(contenido[1]));
                    } else{
                        listaFiguras.add(new Cuadrado(contenido[1]));
                    }
                }
            }
            fileReader.close();
            bufferedReader.close();
        }catch (IOException e){
            System.out.println("Error: " + e);
        }
        return listaFiguras;
    }

    public void crearNuevoFichero(ArrayList<Figura> listaFiguras){
        String resultados = "C:\\Users\\ALUMNO\\Desktop\\2º DAM\\Acceso a datos\\basico\\src\\ejer10\\resultados.txt";
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(resultados));

            for (Figura figura: listaFiguras){
                writer.write(figura.toString());
                writer.newLine();
            }
            System.out.println("Archivo escrito correctamente");
            writer.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
