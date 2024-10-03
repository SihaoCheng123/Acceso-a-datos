import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerArchivoScanner {

    public static void main(String[] args) {

        String ruta = "C:\\Users\\ALUMNO\\Desktop\\2º DAM\\Acceso a datos\\basico\\src\\contenido.txt";

        try{
            File archivo = new File(ruta);
            Scanner scanner = new Scanner(archivo);
            while(scanner.hasNextLine()){
                String linea = scanner.nextLine();
                System.out.println(linea);
            }
        scanner.close();

        }catch (FileNotFoundException e){
            System.out.println("Archivo no encontrado: " + e);
        }
    }
}
