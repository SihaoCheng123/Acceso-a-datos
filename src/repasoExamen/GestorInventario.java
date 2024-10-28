package repasoExamen;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorInventario {

    ArrayList<Producto> listaProductos = new ArrayList<>();


    public static void main(String[] args) {
        File file = new File("C:\\Users\\ALUMNO\\Desktop\\2º DAM\\Acceso a datos\\basico\\src\\repasoExamen\\inventario.txt");
        GestorInventario gestorInventario = new GestorInventario();
        gestorInventario.agregarProductosArchivo(file);
        gestorInventario.mostrarInfoArchivo(file);
        gestorInventario.leerInventario(file);
    }
    public void agregarProductosArchivo(File file) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("¿Desea almacenar productos?");
            String respuesta = scanner.next().trim().toLowerCase();
            while (respuesta.equals("si")){
                almacenarProducto(this.listaProductos);
                System.out.println("¿Desea almacenar más productos?");
                respuesta = scanner.next().trim().toLowerCase();
            }
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for(Producto producto:this.listaProductos){
                bufferedWriter.write(producto.toString());
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            System.out.println("Archivo escrito correctamente");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public void leerInventario(File file) {
        ArrayList<Producto> nuevaLista = new ArrayList<>();
        try{
            FileReader fileReader= new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linea;
            while((linea = bufferedReader.readLine()) !=null){
                String [] contenido = linea.split("\\|");
                Producto producto = new Producto(contenido[0], contenido[1],contenido[2]);
                nuevaLista.add(producto);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
        for (Producto producto: nuevaLista){
            System.out.println(producto);
        }
    }
        public void mostrarInfoArchivo (File file){
            if (file.exists()) {
                System.out.println("El archivo existe");
                System.out.println("Este es su tamaño en bytes: " + file.length());
            } else {
                System.out.println("El archivo no existe");
            }
        }

        public static void almacenarProducto(ArrayList<Producto> listaProductos){
            Scanner scanner = new Scanner(System.in);
            Producto producto = new Producto();
            System.out.println("Introduzca el codigo");
            producto.setCod(scanner.next());
            System.out.println("Introduza el nombre");
            producto.setNombre(scanner.next());
            System.out.println("Introduzca la cantidad");
            producto.setCantidad(scanner.next());
            System.out.println("Introduzca el precio");
            producto.setPrecio(scanner.next());

            listaProductos.add(producto);
        }

    }

