package ejer_repaso_java;

public class Estudiante {

    private String name;
    private int edad;
    private double finalMark;

    public Estudiante(String name, int edad, double finalMark) {
        this.name = name;
        this.edad = edad;
        this.finalMark = finalMark;
    }

    public Estudiante() {
        this.name = "";
        this.edad = 0;
        this.finalMark = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getFinalMark() {
        return finalMark;
    }

    public void setFinalMark(double finalMark) {
        this.finalMark = finalMark;
    }

    @Override
    public String toString() {
        return
                name + " tiene " + edad +
                " y ha sacado un " + finalMark;
    }
}
