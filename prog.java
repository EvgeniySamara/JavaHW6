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
       Notebook n4 = new Notebook("Digma", "White", 26000,"366456"); 
       n4.setRam(8);
       n4.setStorage("HDD");         
        Set<Notebook> compSet = new HashSet<>();
        compSet.add(n1);
        compSet.add(n2);
        compSet.add(n3);  
        compSet.add(n4);               
        System.out.println("Ноутбуки в базе:"); 
        for (Notebook comp: compSet) {
        System.out.println(comp);
        }
       
       HashMap<Integer,String> filterlist = new HashMap<>();

       filterlist.put(1,"Цена");
       filterlist.put(2,"Объем ОЗУ в Гб");
       filterlist.put(3,"Вид накопителя HDD/SDD"); 
       filterlist.put(4,"Цвет Black/White");             

       System.out.println("Имеющиеся фильтры:");       
        for (Map.Entry<Integer, String> entry : filterlist.entrySet()) {
            System.out.println("Номер: " + entry.getKey() + ", Критерий: " + entry.getValue());
        }      
        System.out.println("Введите номер критерия фильтрации:");
        Scanner console = new Scanner(System.in);
        Scanner console2 = new Scanner(System.in);    
        // String name = console.nextLine();
        int ch = console.nextInt(); 
        if (ch ==4){
            System.out.println("Введите значение критерия фильтрации:");
            String chvalue = console2.nextLine(); 
            chvalue = chvalue.toLowerCase();

            for (Notebook notebook : compSet) {
                if (chvalue.equals(notebook.getColor())) {
                    System.out.println(notebook);
                }
            }      
        }
        else if (ch ==1){
            System.out.println("Введите минимальное значение критерия фильтрации:");
            int chvalue = console.nextInt(); 
         

            for (Notebook notebook : compSet) {
                int price = notebook.getPrice();

                if (price>chvalue) {
                    System.out.println(notebook);
                }
            }      
        }

    }

}