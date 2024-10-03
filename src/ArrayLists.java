import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        for (int numero: numeros){
            System.out.println(numero);
        }

        ArrayList<Character> letras = new ArrayList<>();

        letras.add('A');
        letras.add('B');
        letras.add('C');
        letras.add('D');
        letras.add('E');

        for(char letra : letras){
            System.out.println(letra);
        }

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Sihao", 22, 65));
        personas.add(new Persona("Jose", 32, 75));
        personas.add(new Persona("Paula", 42, 85));
        personas.add(new Persona("Gabriel", 22, 80));

//        for(Persona persona : personas){
//            System.out.println(persona);
//        }
//
//        System.out.println(personas.get(2));
//        for (Persona persona: personas){
//            if (persona.getName().equals("Gabriel")){
//                System.out.println(persona);
//            }
//        }
        int i = 0;
        boolean found = false;
        while(i < personas.size() && !found){
            if (personas.get(i).getName().equals("Paula")){
                found = true;
                System.out.println(personas.get(i));
            }
            i++;

        }
    }
}
