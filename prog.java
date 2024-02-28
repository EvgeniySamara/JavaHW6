import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class prog {

    public static void main(String[] args) {
       Notebook n1 = new Notebook("Acer", "Black", 51000,"kx23456");
  

        // Set<Cat> catSet = new HashSet<>();
        // catSet.add(cat1);
        // catSet.add(cat2);
        // catSet.add(cat3);
        // catSet.add(cat4);
        // catSet.add(cat5);
        // for (Cat c: catSet) {
        System.out.println(n1);
        // }
       
       HashMap<Integer,String> filterlist = new HashMap<>();

       filterlist.put(1,"Цена");
       filterlist.put(2,"Объем ОЗУ в Гб");
       filterlist.put(3,"Вид накопителя HDD/SDD");           

       System.out.println("Имеющиеся фильтры:");       
        for (Map.Entry<Integer, String> entry : filterlist.entrySet()) {
            System.out.println("Номер: " + entry.getKey() + ", Критерий: " + entry.getValue());
        }      
        System.out.println("Введите номер критерия фильтрации:");
        Scanner console = new Scanner(System.in);
        // String name = console.nextLine();
        int ch = console.nextInt(); 

    }

}