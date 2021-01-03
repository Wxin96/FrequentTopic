package com.apollo.test;


import org.junit.Test;

import java.util.Stack;

public class Test2 {
    @Test
    public void test01() {
        Stack<Character> stack = new Stack<>();
        stack.contains('a');
        StringBuilder str = new StringBuilder();
        str.insert(1, 'a');
    }
}
