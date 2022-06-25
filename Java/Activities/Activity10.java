package activities;

import java.util.HashSet;
import java.util.Iterator;

public class Activity10 {

    public static void main(String[] args) {

        HashSet<String> hs=new HashSet();
        hs.add("One");
        hs.add("Two");
        hs.add("Three");
        hs.add("Four");
        hs.add("Five");
        hs.add("Five");

        System.out.println("Size of set="+hs.size());

        hs.remove(1);
        System.out.println("Size of Set after removing element="+hs.size());
        hs.remove(8);

        System.out.println("Does the Set contains Five? "
                + hs.contains("Five"));

        Iterator itr = hs.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
