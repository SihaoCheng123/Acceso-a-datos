public class Condicionales {

    public static void main(String[] args) {

        boolean isTrue = true;
        String word = "Hola";

        if(isTrue){
            System.out.println("Es verdadero");
        } else if (isTrue && word.equals("Hola")) {
            System.out.println("La palabra es hola");
        }else {
            System.out.println("No lo es");
        }
    }
}
