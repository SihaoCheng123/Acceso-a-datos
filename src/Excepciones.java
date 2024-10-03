public class Excepciones {

    public static void ArithmeticExceptionFunction(){
        try {
            int result = 10/0;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("El error procede de dividir entre 0");
        }
    }

    public static void ArrayIndexExceptionFunction(){
        int [] num = {1,2,3,4};
        try {
            System.out.println(num[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(num[3]);
        }
    }
    public static void main(String[] args) {
        ArithmeticExceptionFunction();
    }
}
