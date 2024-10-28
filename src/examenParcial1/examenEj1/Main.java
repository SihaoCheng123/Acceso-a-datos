package examenParcial1.examenEj1;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        File file = new File("C:\\Users\\ALUMNO\\Desktop\\2º DAM\\Acceso a datos\\basico\\src\\examenParcial1\\examenEj1\\biblioteca.ser");
        Scanner scanner = new Scanner(System.in);
        Libro libro = new Libro("Programacion", "Jose",2001);
        PersonalBiblioteca personalBiblioteca = new PersonalBiblioteca("Jose", "gerente", 40);
        biblioteca.getLista().add(libro);
        biblioteca.getLista().add(personalBiblioteca);

        System.out.println("¿Desea realizar alguna acción?");
        String respuesta = scanner.next().trim().toLowerCase();

        boolean salir = false;
        while(respuesta.equals("si") && !salir){
            System.out.println("""
                    Elija un nº:\s
                    1. Agregar libro\s
                    2. Agregar personal de Biblioteca\s
                    3. Mostrar elementos actuales\s
                    4. Guardar datos en un archivo\s
                    5. Cargar datos de un archivo\s
                    0. Salir""");
                int numUser = scanner.nextInt();
                if (numUser == 1){
                    biblioteca.agregarLibro();
                } else if (numUser ==2) {
                    biblioteca.agregarPersonal();
                } else if (numUser == 3) {
                    biblioteca.mostrar();
                }else if(numUser == 4){
                    biblioteca.guardarDatos(file);
                }else if(numUser == 5){
                    biblioteca.leerDatos(file);
                }else if (numUser == 0){
                    System.out.println("Saliendo del programa");
                    salir = true;
                }else{
                    System.out.println("Nº incorrecto");
                }
            System.out.println("¿Desea realizar otra accion?");
            respuesta = scanner.next().trim().toLowerCase();
            }
        System.out.println("Programa finalizado");
        scanner.close();
        }

        }



