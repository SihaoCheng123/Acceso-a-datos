package ejer4;

public class CuentaAhorros extends CuentaBancaria{

    private double interesAnual;

    public CuentaAhorros(double saldo, double interesAnual) {
        super(saldo);
        this.interesAnual = interesAnual;
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }

    @Override
    public String toString() {
        return "Saldo actual: " + getSaldo()
                + " e interés anual: " + interesAnual;
    }

    @Override
    void depositar(double cantidad) {
        setSaldo(getSaldo()+cantidad);
        System.out.println("Saldo actualizado: " + getSaldo());
    }

    @Override
    void retirar(double cantidad) {
        setSaldo(getSaldo()-cantidad);
        System.out.println("Saldo actualizado: " + getSaldo());
    }

    public double calcularInteres(){
        return getSaldo() + (getSaldo() * (interesAnual/100));
    }
}
