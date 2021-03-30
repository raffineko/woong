package Collection;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CollectionTest07 {
    public static void main(String[] args) {
        HashMap<String, String> dic = new HashMap<String,String>();
        dic.put("beer", "clear");
        dic.put("wine", "good");
        dic.put("soju", "oneshot");
        dic.put("whisky", "dark");
        dic.put(null,null);
        Iterator<String> keys = dic.keySet().iterator();
        System.out.println("method1******");
        while(keys.hasNext()){
            String key = keys.next();
            System.out.println(String.format("%s: %s", key, dic.get(key)));
        }
        System.out.println("method2*****");
        for (Map.Entry<String, String> elem: dic.entrySet()) {
            System.out.println(String.format("%s: %s", elem.getKey(), elem.getValue()));;
        }
        System.out.println("method3*****");
        for (String key: dic.keySet()) {
            System.out.println(String.format("%s: %s", key, dic.get(key)));
        }

    }
}
