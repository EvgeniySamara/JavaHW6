import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class prog {

    public static void main(String[] args) {
       Notebook n1 = new Notebook("Acer", "Black", 51000,"kx23456");
       n1.setRam(32);
       n1.setStorage("SDD");
       Notebook n2 = new Notebook("Acer", "Black", 56000,"klm23456"); 
       n2.setRam(16);
       n2.setStorage("HDD");
       Notebook n3 = new Notebook("Sony", "White", 76000,"3eret456"); 
       n3.setRam(32);
       n3.setStorage("SDD");  
        Set<Notebook> compSet = new HashSet<>();
        compSet.add(n1);
        compSet.add(n2);
        compSet.add(n3);        
   
        for (Notebook comp: compSet) {
        System.out.println(comp);
        }
       
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