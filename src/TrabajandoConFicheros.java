import java.io.*;

public class TrabajandoConFicheros {
    public static void main(String[] args) {
        File archivo = new File("C:\\Users\\ALUMNO\\Desktop\\2º DAM\\Acceso a datos\\basico\\src\\ejer8\\alumnos.txt");

        if (isExists(archivo)){
            long bits = getBits(archivo.length());
            leerArchivoFileInputStream();
            leerArchivoYObtenerTamano();
            escribirArchivoFileInputStrema();
        }
    }

    public static boolean isExists(File archivo){
        return archivo.exists();
    }

    public static long getBits(long archivoLength){
        return archivoLength * 8;
    }

    public static void leerArchivoFileInputStream(){
        FileInputStream fis = null;

        try{
            fis = new FileInputStream("C:\\Users\\ALUMNO\\Desktop\\2º DAM\\Acceso a datos\\basico\\src\\ejer8\\alumnos.txt");

            int byteLeido;
            while((byteLeido = fis.read()) != -1){
                System.out.println((char) byteLeido);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public static void leerArchivoYObtenerTamano(){
        FileInputStream fis = null;

        try{
            File archivo = new File("C:\\Users\\ALUMNO\\Desktop\\2º DAM\\Acceso a datos\\basico\\src\\ejer8\\alumnos.txt");
            if (isExists(archivo)){
                fis = new FileInputStream(archivo);
                //vemos tamaño del archivo
                long sizeFile = archivo.length();
                //Creamos una array de bytes con el tamaño exacto del archivo
                byte[] contenido = new byte[(int) sizeFile];
                //Leemos el contenido del archivo de una sola vez y lo almacenamos en el array
                fis.read(contenido);
                //Convertir el contenido del archivo (que está en formato bytes) a un String
                System.out.println(new String(contenido));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public static void escribirArchivoFileInputStrema(){
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream("C:\\Users\\ALUMNO\\Desktop\\2º DAM\\Acceso a datos\\basico\\src\\outputStreamalumnos.txt");
            String contenido = "Hola, mundo";
            byte[] bytesContenido = contenido.getBytes();
            fos.write(bytesContenido);
            System.out.println("Archivo creado correctamente");
        } catch (IOException e) {
            System.out.println("Error: " + e);;
        }
    }
}
