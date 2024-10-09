package ejer7;

public class EmpleadoMain {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Laura", 2000, 0);

        gerente.iniciarSesion("laurap", "holiwi123");
        gerente.calcularBono(25);
        System.out.println("Información del gerente: " + gerente);
        gerente.cerrarSesion();

        Programador programador = new Programador("Jose", 5000, 0);
        programador.iniciarSesion("josito", "pepeeeeee");
        programador.calcularBono(25);
        System.out.println("Información del programador " + programador);
        programador.cerrarSesion();


    }
}
