package Collection;

import java.util.*;

public class CollectionTest01 {
    static void print(int n, List<String> list) {
        System.out.println(n + ":" + list);

    }


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i < 6; i++) {
            System.out.println("입력 " + i );
            String str = scan.next();
            list.add(str);
            list.sort(Comparator.naturalOrder());
            System.out.println(list);
        }

        String st;

        for (int i = 1; i < 3; i++) {
            System.out.println("삭제 " + i );
            list.remove(st = scan.next());
            list.sort(Comparator.naturalOrder());

            System.out.println(list);
        }

        for (int i = 1; i < 3; i++) {
            System.out.println("삭제 " + i);
            list.remove(st = scan.next());
            list.sort(Comparator.reverseOrder());

            System.out.println(list);
        }
    }
}
//
//package com.javaapi.gradle;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class CollectionTest01 {
//    static void print(int n, List<String> list) {
//        System.out.println(n+": "+list);
//    }
//    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<String>();
//        list.add("Hong");      list.add("Bong");      list.add("Dong");      list.add("Fong");
//        list.add(1,"BS");
//        for (int i = 0; i <list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//        System.out.println("1: "+list.toString());
//        print(2, list);
//
//        System.out.println("3: "+list.indexOf("Dong"));
//        System.out.println("4: "+list.lastIndexOf("Fong"));
//
//        list.remove("Dong");print(5, list);
//
//        list.remove(2);print(6, list);
//
//        System.out.println("7: "+list.contains("Fong"));
//        Object obj[] = list.toArray();
//        System.out.println("8: "+ Arrays.toString(obj));
//
//        String cities[] = new String[0];
//        cities = list.toArray(cities);
//        System.out.println("9: "+Arrays.toString(cities));
//
//        list.clear(); print(10, list);
//
//        System.out.println("11: "+list.isEmpty());
//
//        list.add("Busan"); list.add("Jeju");  list.add("go");
//
//        List<String> list2 = Arrays.asList("come", "has", "give");
//        print(12, list2);
//
//        list.addAll(list2); print(13, list);
//
//        System.out.println("14: "+list.containsAll(list2));
//
//        list.retainAll(list2); print(15, list);
//
//        list.removeAll(list2); print(16, list);
//    }
//}
