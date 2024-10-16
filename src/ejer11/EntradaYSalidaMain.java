package ejer11;

import java.io.*;

public class EntradaYSalidaMain {

    public static void main(String[] args) {
        File archivoEntrada = new File("C:\\Users\\ALUMNO\\Desktop\\2º DAM\\Acceso a datos\\basico\\src\\ejer11\\EntradaYSalidaMain.java");
        if (archivoEntrada.exists()) {
            FileInputStream fis = null;
            FileOutputStream fos = null;
            try {
                File archivo = new File("C:\\Users\\ALUMNO\\Desktop\\2º DAM\\Acceso a datos\\basico\\src\\ejer11\\entrada.txt");
                if (archivo.exists()) {
                      fis = new FileInputStream(archivo);
                      long sizeFile = archivo.length();
                      int byteLeido;
                      byte[] byteLeidoEntrada = new byte[(int) sizeFile];
                      int cont = 0;
                      fos = new FileOutputStream("C:\\Users\\ALUMNO\\Desktop\\2º DAM\\Acceso a datos\\basico\\src\\ejer11\\salida.bin");
                      while((byteLeido = fis.read()) != -1){
                          System.out.println((char)byteLeido);
                          byteLeidoEntrada[cont] = (byte) byteLeido;
                          cont ++;
                      }
                    fos.write(byteLeidoEntrada);
                    System.out.println("Archivo creado correctamente");

//                    long sizeFile = archivo.length();
//                    byte[] contenidoEntrada = new byte[(int) sizeFile];
//                    fis.read(contenidoEntrada);
//                    System.out.println(new String(contenidoEntrada));
//
//                    fos = new FileOutputStream("C:\\Users\\ALUMNO\\Desktop\\2º DAM\\Acceso a datos\\basico\\src\\ejer11\\salida.bin");
//                    String contenidoSalida = contenidoEntrada.toString();
//                    byte[] bytesContenidoSalida = contenidoSalida.getBytes();
//                    fos.write(bytesContenidoSalida);
//                    System.out.println("Archivo creado correctamente");


                }
            } catch (FileNotFoundException e) {
                System.out.println("Error: " + e);
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
        }


    }
}
//    public static void leerArchivoEntrada() {
//        FileInputStream fis = null;
//
//        try{
//            File archivo = new File("C:\\Users\\ALUMNO\\Desktop\\2º DAM\\Acceso a datos\\basico\\src\\ejer11\\entrada.txt");
//            if (archivo.exists()){
//                fis = new FileInputStream(archivo);
//                long sizeFile = archivo.length();
//                byte[] contenido = new byte[(int) sizeFile];
//                fis.read(contenido);
//                System.out.println(new String(contenido));
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("Error: " + e);
//        } catch (IOException e) {
//            System.out.println("Error: " + e);
//        }
//    }

