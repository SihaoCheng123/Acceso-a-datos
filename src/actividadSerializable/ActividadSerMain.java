package actividadSerializable;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ActividadSerMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new Empleado("Jose", 24, 3442.2));
        listaEmpleados.add(new Empleado("Carla", 25, 1355));

        System.out.println("¿Desea agregrar más empleados?");
        String respuesta = scanner.next().toLowerCase();
        while(respuesta.equals("si")){
            addEmpleados(listaEmpleados);
            System.out.println("¿Desea agregrar más empleados?");
            String respuesta2 = scanner.next();
            respuesta = respuesta2;

        }

        serializarLista(listaEmpleados);
        deserializarLista();
        scanner.close();
    }

    public static void serializarLista(ArrayList<Empleado> listaEmpleados){
        try(FileOutputStream fos = new FileOutputStream("C:\\Users\\ALUMNO\\Desktop\\2º DAM\\Acceso a datos\\basico\\src\\actividadSerializable\\empleados.ser");
            ObjectOutputStream salida = new ObjectOutputStream(fos)) {
            salida.writeObject(listaEmpleados);
            System.out.println("Archivo serializado correctamente");
        } catch (IOException e) {
            System.out.println("Error " + e);
        }
    }

    public static void deserializarLista(){
        ArrayList<Empleado> listaNueva = null;
        try(FileInputStream fis = new FileInputStream("C:\\Users\\ALUMNO\\Desktop\\2º DAM\\Acceso a datos\\basico\\src\\actividadSerializable\\empleados.ser");
            ObjectInputStream entrada = new ObjectInputStream(fis)){
            listaNueva = (ArrayList<Empleado>) entrada.readObject();
            for(Empleado empleado: listaNueva){
                System.out.println(empleado.toString());
            }
            System.out.println("Archivo deserializado correctamente");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error " + e);
        }

    }

    public static void addEmpleados(ArrayList<Empleado> listaEmpleados){
        Scanner scanner = new Scanner(System.in);
        Empleado nuevoEmpleado = new Empleado();
        System.out.println("Inserte el nombre del nuevo empleado");
        nuevoEmpleado.setNombre(scanner.nextLine());
        System.out.println("Inserte la edad del nuevo empleado");
        nuevoEmpleado.setEdad(scanner.nextInt());
        System.out.println("Inserte el salario del nuevo empleado");
        nuevoEmpleado.setSalario(scanner.nextDouble());
        listaEmpleados.add(nuevoEmpleado);
        System.out.println("Empleado agregado correctamente");
    }
}
