import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", "Black", 2);
        Cat cat2 = new Cat("Barsik", "Black", 2);
        Cat cat3 = new Cat("Tomas", "White", 1);
        Cat cat4 = new Cat("Murka", "Grey", 3);
        Cat cat5 = new Cat("Murka", "Grey", 3);
        Set<Cat> catSet = new HashSet<>();
        catSet.add(cat1);
        catSet.add(cat2);
        catSet.add(cat3);
        catSet.add(cat4);
        catSet.add(cat5);
        for (Cat c: catSet) {
            System.out.println(c);
        }

    }

}