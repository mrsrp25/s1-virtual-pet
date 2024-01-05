import java.util.ArrayList;

public class human{
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("banana");
        fruits.add("pomegranate");
     for (int i = 0; i <fruits.size(); i++){
        System.out.println(fruits.get(i));
     }
        fruits.clear();

    }
}