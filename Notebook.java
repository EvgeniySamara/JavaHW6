  
import java.util.Objects;

public class Notebook {

    private String name;
    private String color;
    private String model;
    private int price;


    public  Notebook(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "имя='" + name + '\'' +
                ", цвет='" + color + '\'' +
                ", возраст=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cat cat = (Cat) obj;
        return cat.name.equals(name) &&
                cat.age == age &&
                cat.color.equals(color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, age);
    }
}