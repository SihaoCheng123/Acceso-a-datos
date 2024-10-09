package ejer7;

public abstract class Empleado {

    protected String nombre;
    protected double salarioBase;
    protected double bono;

    public Empleado(String nombre, double salarioBase, double bono) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.bono = bono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    abstract double calcularSalario();
}
