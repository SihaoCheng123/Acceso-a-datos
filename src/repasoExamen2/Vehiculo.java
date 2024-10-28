package repasoExamen2;

import java.io.Serializable;

abstract class Vehiculo implements Serializable {
    protected final long serialVersionUID = 1L;
    protected String matricula;
    protected String marca;
    protected String modelo;
    protected String ano;

    public Vehiculo(String matricula, String marca, String modelo, String ano) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    abstract String tipoVehiculo();

    @Override
    public String toString() {
        return matricula  + "; " + marca + "; " + modelo + "; " + ano;
    }
}
