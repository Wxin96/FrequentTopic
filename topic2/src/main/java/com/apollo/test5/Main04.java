package com.apollo.test5;

import java.util.stream.Stream;

public class Main04 {
    public static void main(String[] args) {
//        StringBuilder str = new StringBuilder("cab");
//        List<Integer> list = new ArrayList<>();
//        list.add(0, 1);
//        TreeMap map = new TreeMap();
//        map.firstKey();
//        map.lastKey();

        Stream<Integer> iterate = Stream.iterate(0, x -> x + 2);
        iterate.limit(10).forEach(System.out::println);

    }
}
