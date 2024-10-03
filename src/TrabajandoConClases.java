public class TrabajandoConClases {

    public static void main(String[] args) {
//        Persona persona1 = new Persona("Sihao", 22, 65);
//        Persona persona2 = new Persona();
//        System.out.println(persona1.getName());
//        System.out.println(persona1.getAge());
//        System.out.println(persona1.getWeight());
//
//        persona2.setName("Gabriel");
//        persona2.setAge(23);
//        persona2.setWeight(80);
//
//        System.out.println(persona2.toString());

//    Perro perro1 = new Perro("Choco",3);
//    perro1.makeNoise();
//        Calculadora calculadora = new Calculadora();
//        try {
//            double resultadoDivision = calculadora.dividir(10,2);
//            System.out.println("Resultado división " + resultadoDivision);
//        }
//        catch (ArithmeticException e){
//            System.out.println(e);
//        }

        Figura circulo = new Circulo(5);
        circulo.mostrarFigura();
        circulo.mostrarDimension();
        System.out.println("Área del circulo: " + circulo.calcularArea());
        System.out.println("Perímetro del circulo: " + circulo.calcularPerimetro());

        Figura rectangulo = new Rectangulo(5, 10);
        rectangulo.mostrarFigura();
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
        rectangulo.mostrarDimension();
    }
}
