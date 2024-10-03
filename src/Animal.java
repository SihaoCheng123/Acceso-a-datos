public class Animal {

    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo(){
        System.out.println("Nombre: " + this.name + "; Edad: " + this.age);
    }

    public void makeNoise(){
        System.out.println("Noise");
    }
}
