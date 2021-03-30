package Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTest02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Busan");        list.add("Dusan");        list.add("Fusan");        list.add("Gusan");
        list.add("Husan");        list.add("Kusan");        list.add("Musan");        list.add("Nusan");

        for (int i = 0; i <list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("******");

        Iterator<String> iter = list.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
