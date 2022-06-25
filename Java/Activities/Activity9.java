package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {

    public static List<String> myList = new ArrayList<String>();

    public static void main(String[] args) {

        myList.add("Paru");
        myList.add("Diksha");
        myList.add("Dhruv");
        myList.add("Rajani");
        myList.add("Arun");

        for(int i=0;i<myList.size();i++){

            System.out.println(myList.get(i)+" ");
        }

        System.out.println("Value at index 3="+myList.get(3));

        for(int i=0;i<myList.size();i++){

            if(myList.get(i).contains("Diksha"))
            System.out.println(myList.get(i)+" ");
        }
        System.out.println("Size of List="+myList.size());

        myList.remove(1);
        System.out.println("Size of List after removing element="+myList.size());

    }
}
