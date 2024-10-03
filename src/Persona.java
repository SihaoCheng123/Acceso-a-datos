public class Persona {
    private String name;
    private int age;
    private double weight;

    public Persona(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Persona(){
        this.name = "";
        this.age = 0;
        this.weight = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age +
                ", weight=" + this.weight +
                '}';
    }
}
