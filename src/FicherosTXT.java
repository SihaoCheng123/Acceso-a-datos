import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FicherosTXT {

    public static void main(String[] args) {

        String fichero = "C:\\Users\\ALUMNO\\Desktop\\2º DAM\\Acceso a datos\\basico\\src\\contenido.txt";

        try{
            FileReader fileReader = new FileReader(fichero);
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
}
