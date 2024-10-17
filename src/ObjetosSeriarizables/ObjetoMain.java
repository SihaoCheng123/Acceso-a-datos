package ObjetosSeriarizables;

import java.io.*;

public class ObjetoMain {

    public static void main(String[] args) {
        Persona persona = new Persona("Sihao", 22);

        try(FileOutputStream fos = new FileOutputStream("C:\\Users\\ALUMNO\\Desktop\\2º DAM\\Acceso a datos\\basico\\src\\ObjetosSeriarizables\\persona.ser");
            ObjectOutputStream salida = new ObjectOutputStream(fos)) {
            salida.writeObject(persona);
        } catch (IOException e) {
            System.out.println("Error " + e);
        }

        leerArchivo();
    }

    public static void leerArchivo(){
        Persona persona2 = null;
        try(FileInputStream fis = new FileInputStream("C:\\Users\\ALUMNO\\Desktop\\2º DAM\\Acceso a datos\\basico\\src\\ObjetosSeriarizables\\persona.ser");
            ObjectInputStream entrada = new ObjectInputStream(fis)){
            persona2 = (Persona) entrada.readObject();
            System.out.println(persona2.toString());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error " + e);
        }
    }
}
