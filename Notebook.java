  
import java.util.Objects;

public class Notebook {

    private String name;
    private String color;
    private String model;
    private int price;


    public  Notebook(String name, String color, int price, String model) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.model = model;        
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int age) {
        this.price = price;
    }

    public int getModel() {
        return model;
    }

    public void setModel(String age) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "назавание='" + name + '\'' +
                ", цвет='" + color + '\'' +
                ", цена=" + price +
                '}';
    }

    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj) return true;
    //     if (obj == null || getClass() != obj.getClass()) return false;
    //     Notebook cat = (Cat) obj;
    //     return cat.name.equals(name) &&
    //             cat.price == price &&
    //             cat.color.equals(color);
    //}

    @Override
    public int hashCode() {
        return Objects.hash(name, color, age);
    }
}