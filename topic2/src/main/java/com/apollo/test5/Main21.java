package com.apollo.test5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main21 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int num = n + m;

        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            nums.add(sc.nextInt());
        }

        String result = nums.stream().sorted().map(o -> o + "").collect(Collectors.joining(" "));

        System.out.println(result);


    }

}
