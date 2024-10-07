package ejer4;

import java.util.ArrayList;

public class Transaccion {

    public static void main(String[] args) {

        ArrayList<CuentaBancaria> cuentas = new ArrayList<>();
        CuentaCorriente cc = new CuentaCorriente(2000,6);
        cc.maximoEnvios(10);
        CuentaAhorros ca = new CuentaAhorros(500,1.49);
        System.out.println("El interés anual es: " + ca.calcularInteres());
        cuentas.add(cc);
        cuentas.add(ca);

        for (CuentaBancaria cuenta:cuentas){
            System.out.println(cuenta);
        }

        cuentas.get(0).retirar(500);
        cuentas.get(1).depositar(100);

    }
}
