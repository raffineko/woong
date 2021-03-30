package Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class CollectionTest08 {
    public static void main(String[] args) {
        Hashtable<String, String> dic = new Hashtable<String, String>();
        dic.put("beer", "clear");
        dic.put("wine", "good");
        dic.put("soju", "oneshot");
        dic.put("whisky", "dark");

        System.out.println(dic);
        System.out.println(dic.keySet());
        System.out.println(dic.values());

        System.out.println();
        System.out.println(dic.get("beer"));
        System.out.println(dic.get("whisky"));
        System.out.println();

        Iterator<String> keys = dic.keySet().iterator();
        System.out.println("method1******");
        while (keys.hasNext()) {
            String key = keys.next();
            System.out.println(String.format("%s: %s", key, dic.get(key)));
        }
        System.out.println("method2*****");
        for (Map.Entry<String, String> elem : dic.entrySet()) {
            System.out.println(String.format("%s: %s", elem.getKey(), elem.getValue()));
            ;
        }
        System.out.println("method3*****");
        for (String key : dic.keySet()) {
            System.out.println(String.format("%s: %s", key, dic.get(key)));
        }

        System.out.println(dic.containsKey("beer"));
    }
}
