package com.apollo.thinkInJava;

import java.util.ArrayList;
import java.util.List;

public class ParameterizedArrayType {
    public static void main(String[] args) {
        Integer[] ints = {1, 2, 3, 4, 5};
        Double[] doubles = {1.1, 2.2, 3.3, 4.4, 5.5};
        Integer[] ints2 = new ClassParameter<Integer>().f(ints);
        Double[] doubles2 = new ClassParameter<Double>().f(doubles);
        ints2 = MethodParameter.f(ints);
        doubles2 = MethodParameter.f(doubles);
        List[] list = new List[10];
        list[0] = new ArrayList<Integer>();
        List<String>[] list1 = (List<String>[]) list;
        list[0].add(1);
        System.out.println(list1[0].get(0).equals("1"));
    }
}

class ClassParameter<T> {
    public T[] f (T[] args) {
        return args;
    }
}

class MethodParameter {
    public static <T> T[] f(T[] args) {
        return args;
    }
}


