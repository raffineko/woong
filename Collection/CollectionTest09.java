package Collection;

import java.util.Map;
import java.util.TreeMap;

public class CollectionTest09 {
    public static void main(String[] args) {
        TreeMap<String, String>users = new TreeMap<String, String>();
        users.put("20181234", "Busan");
        users.put("20181211", "Musan");
        users.put("20181222", "Nusan");
        users.put("20201234", "Tusan");
        users.put("20221234", "Pusan");
        System.out.println(users);

        Map.Entry<String,String> entry = null;
        entry = users.firstEntry();
        print("firstman", entry);
        entry = users.lastEntry();
        print("lastman", entry);

        entry = users.lowerEntry("20181222");
        print("2018 last man", entry);

        entry = users.higherEntry("20201234");
        print("2020 first man", entry);

        while (!users.isEmpty()){
            entry = users.pollFirstEntry();
            print("retired", entry);
            System.out.println("current members"+users.size());
        }
    }
    public static void print(String s, Map.Entry<String,String> entry){
        System.out.println(s+" : "+entry.getKey()+" / "+entry.getValue());
    }
}