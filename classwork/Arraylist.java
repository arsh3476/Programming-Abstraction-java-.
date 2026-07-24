import java.util.*;

public class Arraylist{
    public static void main(String[] args){
       
        // ArrayList<String> fruits = new ArrayList<>();
        // fruits.add("Apple");
        // fruits.add("Banana");
        // fruits.add("Mango");
        // fruits.add("Orange");
        
        // System.out.print(fruits);

        // ArrayList<Integer> fruits = new ArrayList<>();
        // fruits.add(100);
        // fruits.add(200);
        // fruits.add(300);
        // fruits.add(400);
        
        // System.out.print("Size = "+ fruits.size());


        ArrayList<Integer> fruits = new ArrayList<>();
        fruits.add(5);
        fruits.add(2);
        fruits.add(8);
        fruits.add(9);
        
        Collections.reverse(fruits);
        System.out.println(fruits);


        Collections.sort(fruits);
        System.out.println(fruits);


        System.out.println("Arraylist  = " + Collections.max(fruits));
        

    }
}