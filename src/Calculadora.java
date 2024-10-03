public class Calculadora {

    public double dividir(double numerador, double denominador) throws ArithmeticException{
        if (denominador == 0){
            throw new ArithmeticException("Error: No se puede dividir entre 0");
        }
        return numerador/denominador;
    }

    public int factorial (int num) throws IllegalArgumentException{
        if (num < 0){
            throw new IllegalArgumentException("Error: No se puede calcular el factorial de un nº negativo");
        }
        int result = 1;
        for(int i = 1; i <= num; i++){
            result += 1;
        }
        return result;
    }
}
