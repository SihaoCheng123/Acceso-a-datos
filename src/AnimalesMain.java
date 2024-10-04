import java.util.ArrayList;

public class AnimalesMain {

    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Perro("Coco",2));
        animales.add(new Perro("Lala", 4));
        animales.add(new Gato("Pipa", 5));
        animales.add(new Gato("Ollie", 4));

        //Mostrar todos los animales
        for (Animal animal:animales){
            System.out.println(animal);
        }

        //Borrar un animal en concreto
        int i = 0;
        boolean found = false;
        while(i < animales.size() && !found){
            if (animales.get(i).getName().equals("Pipa")){
                animales.remove(i);
            }
            i++;
        }

    }
}
