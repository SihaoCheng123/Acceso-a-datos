package examenParcial1.examenEj1;

import java.io.Serializable;

public class PersonalBiblioteca implements GestionableBiblioteca, Serializable {
    private static final long serialVersionUID= 1L;
    private String nombre;
    private String puesto;
    private int horasTrabajo;

    public PersonalBiblioteca(String nombre, String puesto, int horasTrabajo) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.horasTrabajo = horasTrabajo;
    }

    public PersonalBiblioteca(){

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getTipo() {
        return "Personal de Biblioteca";
    }

    @Override
    public String toString() {
        return "PersonalBiblioteca{" +
                "nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", horasTrabajo=" + horasTrabajo +
                '}';
    }
}
