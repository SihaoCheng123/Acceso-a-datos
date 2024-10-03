public class Funciones {

    public static void helloWorld(){
        System.out.println("Hello, world");
    }

    public static boolean isTrue(String word){
        return word.equals("Monday");
    }

    public static String dayOfWeek(int day){
        return switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            default -> "Invalid";
        };
    }
    public static void main(String[] args) {
        helloWorld();
        String dia = "Monday";
        System.out.println(isTrue(dia));
        System.out.println(dayOfWeek(2));
    }
}
