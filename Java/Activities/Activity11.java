package activities;

import java.util.*;

public class Activity11 {

    public static void main(String[] args) {

        Map colours=new HashMap();
        //Adding elements to map
        colours.put(1,"Black");
        colours.put(2,"Blue");
        colours.put(3,"White");
        colours.put(4,"Green");
        colours.put(5,"Orange");

        Set set=colours.entrySet();//Converting to Set so that we can traverse
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            //Converting to Map.Entry so that we can get key and value separately
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        colours.remove(2);

        System.out.println("Does the Set contains Five? "
                + colours.containsValue("Green"));

        System.out.println("Size of set="+colours.size());


    }

}
