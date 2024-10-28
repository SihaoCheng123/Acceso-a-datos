package examenParcial1.examenEj2;

import java.io.File;
import java.util.Scanner;

public class GestionBiblioteca {
    public static void main(String[] args) {
        InventarioLibros inventario = new InventarioLibros();

        File file = new File("C:\\Users\\ALUMNO\\Desktop\\2º DAM\\Acceso a datos\\basico\\src\\examenParcial1\\examenEj2\\inventario.bin");
        Ficcion libroFiccion = new Ficcion("Ficcion", "yo", 200, "Fantasia");
        NoFiccion libroNoFiccion = new NoFiccion("No ficcion", "yo", 100, "Programación");
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Desea realizar alguna acción?");
        String respuesta = scanner.next().trim().toLowerCase();
        boolean salir = false;
        while(respuesta.equals("si") && !salir){
            System.out.println("""
                Elija un nº:\s
                1. Agregar libro ficción\s
                2. Agregar libro no ficción\s
                3. Ver contenido del inventario\s
                4. Guargar inventario en archivo binario\s
                5. Cargar datos del archivo binario\s
                0. Salir""");

            int numUser = scanner.nextInt();
            if (numUser == 1){
               inventario.agregarLibroFiccion();
            } else if (numUser ==2) {
                inventario.agregarLibroNoFiccion();
            } else if (numUser == 3) {
                inventario.mostrarLibros();
            }else if(numUser == 4){
               inventario.guardarInventario(file);
            }else if(numUser == 5){
                inventario.cargarInventario(file);
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

