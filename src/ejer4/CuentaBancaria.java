package ejer4;

abstract class CuentaBancaria {

    private double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    abstract void depositar(double cantidad);

    abstract void retirar(double cantidad);
}
