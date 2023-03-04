package Generics;
import java.util.ArrayList;
import java.util.HashMap;

public class Generics {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("apple");
        list.add("banana");
        list.add("Orange");

        String fruit = (String)list.get(1);
        System.out.println(fruit);

        //Modern style///

        ArrayList<String> strings = new ArrayList<String>();

        strings.add("cat");
        strings.add("dog");
        strings.add("alligator");

        String animal = strings.get(1);

        System.out.println(animal);

        // there can be more than one type argument//

        HashMap<Integer, String> map = new HashMap <Integer,String>();


        // java 7 style///

        ArrayList<Animal> someList = new ArrayList<>();

    }


}


