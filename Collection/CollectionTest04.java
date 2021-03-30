package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class CollectionTest04 { //skipped
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>(20);
        vector.addElement("Busan");        vector.addElement("Seoul");
        vector.addElement("Jeju");

        Enumeration<String> en = vector.elements();

        while (en.hasMoreElements()) {
            String city = en.nextElement();
            System.out.println(city);
        }
//        System.out.println("=====");
//
//        Enumeration<String> en2 = vector.elements();
//        Iterator<String> iter = en2.asIterator();//do not support
//
//        while(iter.hasNext()){
//            System.out.println(iter.next());
//        }
    }
}