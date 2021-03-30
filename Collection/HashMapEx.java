//package Collection;
//
//import java.util.HashMap;
//import java.util.Set;
//
//public class HashMapEx {
//    public static void main(String[] args) {
//        HashMap<String, Integer> map = new HashMap<String, Integer>();
//        map.put("신논현", 1);
//        map.put("강남", 2);
//        map.put("혜화", 3);
//        map.put("안양", 4);
//        map.put("수원", 5);
//        HashMap<String, Integer> map2 = new HashMap<String, Integer>();
//        map.put("천안", 6);
//        map.put("양평", 7);
//        map.put("장성", 8);
//        map.put("파주", 9);
//        map.put("부산", 10);
//
//        map.putAll(map2);
//        System.out.println(map2);
//        System.out.println(map);
//        System.out.println(map.size());
//        System.out.println(map.values());
//        System.out.println(map.get("강남"));
//        HashMap<String,Integer>map3 =(HashMap<String, Integer>) map.clone();
//        System.out.println(map3);
//        System.out.println(map3.containsValue(5));
//        System.out.println(map3.containsValue(15));
//        Set set = map.entrySet();
//        System.out.println(set);
//
//    }
//}
