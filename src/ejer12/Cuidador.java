package ejer12;

import java.io.Serializable;

public class Cuidador implements Serializable, Gestionable{

    private static long serialVersionUID = 1L;

    private String name;
    private int age;
    private String area;

    public Cuidador(String name, int age, String area) {
        this.name = name;
        this.age = age;
        this.area = area;
    }

    public int getAge() {
        return age;
    }

    public String getArea() {
        return area;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return "persona";
    }

    @Override
    public String toString() {
        return "Cuidador{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", area='" + area + '\'' +
                '}';
    }
}
