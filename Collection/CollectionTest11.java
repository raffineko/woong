package Collection;

import java.util.TreeSet;

public class CollectionTest11 {
    public static void main(String[] args) {
        TreeSet<Integer> score = new TreeSet<Integer>();
        score.add(90);       score.add(91);       score.add(93);
        score.add(80);       score.add(70);       score.add(50);
        System.out.println(score);

        Integer value = null;
        value = score.first(); print("lowest score", value);
        value = score.last(); print("highest score", value);
        value = score.lower(85); print("less than 85", value);
        value = score.higher(85); print("greater than 86", value);
        value = score.floor(85); print("near to 85", value);
        value = score.ceiling(90); print("near to 90", value);

        while(!score.isEmpty()) {
            value = score.pollLast();
            print("Best High", value);
        }
    }
    public static void print(String s, Integer value) {
        System.out.println(s + " : "+value);
    }
}