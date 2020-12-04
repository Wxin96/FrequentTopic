package com.apollo.thinkInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsAndCovariance {
    public static void main(String[] args) {
        List<? extends Fruit> flist = new ArrayList<Apple>();
        //! flist.add(new Apple());  // 编译错误
        //! flist.add(new Fruit());  // 编译错误
        //! flist.add(new Object());  // 编译错误
        List<Integer> list = new ArrayList<>();
        System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
    }
}
