package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class CollectionTest03 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>(20);
        vector.addElement("Busan");        vector.addElement("Dusan");        vector.addElement("Musan");

        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.elementAt(i)+ "\t");
        }
        System.out.println("\n");

        System.out.println("1: "+vector.firstElement());
        System.out.println("2: "+vector.lastElement());

        vector.insertElementAt("Paris",2); print(3, vector);
        vector.insertElementAt("London",1); print(4, vector);

        System.out.println("3: "+vector.capacity());
        System.out.println("4: "+vector.size());
        vector.trimToSize();
        System.out.println("5: "+vector.capacity());

        vector.removeElement("London");print(6, vector);
        vector.removeElementAt(1); print(7, vector);
        vector.removeAllElements(); print(8, vector);

        List<String> list = Arrays.asList("Busan", "jeju", "Masan");
        vector.addAll(list);  print(9, vector);
        vector.setSize(6);  print(10, vector);
    }
    static void print(int n, List<String> list) {
        System.out.println(n+": "+list);
    }
}