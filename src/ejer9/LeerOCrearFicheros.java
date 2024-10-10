package ejer9;

import ejer8.Alumno;

import java.io.*;
import java.util.ArrayList;

public class LeerOCrearFicheros {

    public static void main(String[] args) {
        String frase1 = "Holiwi";
        String frase2 = "que tal";
        String frase3 = "mal.";
        ArrayList<String> frases = new ArrayList<>();
        frases.add(frase1);
        frases.add(frase2);
        frases.add(frase3);

        File f = new File("C:\\Users\\ALUMNO\\Desktop\\2º DAM\\Acceso a datos\\basico\\src\\ejer9\\ficheroCreado.txt");
        if (f.exists()){
            if (f.canRead()){
                try{
                    FileReader fileReader = new FileReader(f);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    String linea;
                    while((linea = bufferedReader.readLine()) != null){
                        String[] contenido = linea.split(",");
                        String primeralinea = contenido[0];
                        char[] caracteresPrimeraLinea = primeralinea.toCharArray();
                        System.out.println(caracteresPrimeraLinea);
                    }

                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
        }else {
            try{
                f.createNewFile();
                BufferedWriter writter = null;

                try{
                    writter = new BufferedWriter((new FileWriter(f)));
                    for(String frase:frases){
                        writter.write(frase);
                        writter.newLine();
                    }
                    System.out.println("Archivo escrito correctamente");
                    writter.close();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
    }
}
