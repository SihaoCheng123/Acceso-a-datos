package ejer1;

import java.util.ArrayList;

public class Tienda {

    public static void main(String[] args) {

        ArrayList<Producto> inventario = new ArrayList<>();
        //Añadir productos al inventario
        inventario.add(new Producto("ordenador", 400, 3));
        inventario.add(new Producto("raton", 50.50, 10));
        inventario.add(new Producto("teclado", 10.10, 20));
        inventario.add(new Producto("movil", 850, 2));

        //Mostrar todos los productos
        for (Producto producto: inventario){
            System.out.println("Productos en el inventario: " + producto.getName());
        }

        //Actualizar el inventario
        inventario.get(0).setQuantity(2);
        inventario.get(0).setPrice(500);
        System.out.println("Inventario actualizado: " + inventario + "\n");

        //Eliminar un objeto
        int i = 0;
        boolean buy = false;
        while(!buy && i < inventario.size()){
            if (inventario.get(i).getName().equals("Movil")){
                inventario.remove(i);
                buy = true;
                System.out.println("Producto eliminado");
            }
            i++;
        }
        System.out.println("Inventario actualizado: " + inventario + "\n");

        //Calcular precio total
        double total = 0;
        for (Producto producto: inventario){
            total += producto.getPrice() * producto.getQuantity();
        }
        System.out.println("El valor total del inventario es: " + total);
    }
}
