package repasoExamen2;

public class Coche extends Vehiculo{
    private String tipo;

    public Coche(String matricula, String marca, String modelo, String ano, String tipo) {
        super(matricula, marca, modelo, ano);
        this.tipo = "Coche";
    }

    @Override
    public String toString() {
        return matricula  + "; " + marca + "; " + modelo + "; " + ano;
    }

    @Override
    String tipoVehiculo() {
        return tipo;
    }
}
