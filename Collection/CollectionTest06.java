package Collection;
import java.util.HashMap;

public class CollectionTest06 {
    public static void main(String[] args) {
        String word[] = {"wine", "beer", "soju", "juice"};
        String meaning[]= {"clear", "good", "nice", "okay"};
        HashMap<String, String> dic = new HashMap<String, String>();

        for (int i = 0; i < word.length; i++) {
            dic.put(word[i], meaning[i]);
        }

        System.out.println(dic);
        System.out.println(dic.size());

        System.out.println(dic.keySet());
        System.out.println(dic.values());

        System.out.println("soju->"+dic.get("soju"));
        dic.replace("soju", "cida");
        System.out.println("soju->"+dic.get("soju"));
        dic.put("soju", "bad");
        System.out.println("soju->"+dic.get("soju"));

        System.out.println(dic.containsKey("juice"));
        System.out.println(dic.containsValue("clear"));

        dic.remove("beer");
        System.out.println(dic.isEmpty());
        System.out.println(dic.size());
    }
}

