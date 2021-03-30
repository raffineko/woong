package Collection;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CollectionTest05 {
    static void print(int n, List<String> list) {
        System.out.println(n + ": " + list);
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Busan");
        list.add("Masan");
        list.add("Jejy");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + "\t");
        }

        list.add(1, "LA");
        print(1, list);
        list.addFirst("London");
        print(2, list);
        list.addLast("NY");
        print(3, list);

        list.offer("Paris");
        print(4, list);
        list.offerFirst("Rome");
        print(5, list);
        list.offerLast("Bangkok");
        print(6, list);

        System.out.println("7 " + list.peek());
        System.out.println("8 " + list.peekFirst());
        System.out.println("9 " + list.peekLast());

        list.poll();
        print(10, list);
        list.pollFirst();
        print(11, list);
        list.pollLast();
        print(12, list);

        list.push("jeju");
        print(13, list);
        System.out.println("14 " + list.pop());

        System.out.println("15: " + list.get(3));
        System.out.println("16: " + list.getFirst());
        System.out.println("17: " + list.getLast());

        System.out.println("18 " + list.indexOf("Masan"));
        System.out.println("19 " + list.lastIndexOf("Masan"));

        list.removeFirst(); print(20, list);
        list.removeLast(); print(21, list);
        list.remove(3); print(22, list);
        list.remove("LA"); print(23, list);

        List<String> list2 = Arrays.asList("cha", "ma");
        list.addAll(list2);

        Object obj[] = list.toArray();
        System.out.println("24 "+Arrays.toString(obj));

        String cities[] = new String[0];
        cities = list.toArray(cities);
        System.out.println("25 "+Arrays.toString(cities));


        list.removeAll(list2); print(26, list);
    }
}