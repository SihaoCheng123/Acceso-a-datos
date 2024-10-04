public class Perro extends Animal{

    public Perro(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise(){
        System.out.println(this.name + " dice: Guau" );
    }

    public void moveTail(){
        System.out.println(this.name + " está moviendo la cola");
    }

}
