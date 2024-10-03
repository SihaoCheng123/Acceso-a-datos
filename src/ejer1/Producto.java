package ejer1;

public class Producto {

    private String name;
    private double price;
    private int quantity;

    public Producto(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Producto() {
        this.name = "";
        this.price = 0;
        this.quantity = 0;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "El producto " + name +
                " cuesta " + price +
                " y hay " + quantity;
    }
}
