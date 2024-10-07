package ejer4;

public class CuentaCorriente extends CuentaBancaria{

    private int envios;

    public CuentaCorriente(double saldo, int envios) {
        super(saldo);
        this.envios = envios;
    }

    public int getEnvios() {
        return envios;
    }

    public void setEnvios(int envios) {
        this.envios = envios;
    }

    @Override
    public String toString() {
        return "Saldo actual: " + getSaldo()
                + " y cantidad de envios: " + envios;
    }

    void maximoEnvios(int numMaxEnvios){
        if (envios > numMaxEnvios){
            System.out.println("No se puede realizar más envios");
        }else{
            System.out.println("Todavia te quedan este nº de envios: " + (numMaxEnvios - envios));
        }
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

}
