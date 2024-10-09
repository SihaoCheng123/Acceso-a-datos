package ejer7;

public class Programador extends Empleado implements Autenticable, Bonificable{

    public Programador(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase, bono);
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    @Override
    public void iniciarSesion(String user, String password) {
        System.out.println("Sesión iniciada para " + user);
    }

    @Override
    public void cerrarSesion() {
        System.out.println("Sesión cerrada");
    }

    @Override
    public void calcularBono(double porcentaje) {
        this.bono = salarioBase * porcentaje/100;
    }

    @Override
    double calcularSalario() {
        return (salarioBase*12) + bono;
    }

    @Override
    public String toString() {
        double salarioAnual = calcularSalario();
        return nombre + " tiene un salario anual de " + salarioAnual +
                " con un bono ya añadido de " + bono;
    }
}
