package com.apollo.test5;

public class Main09 {


    /**
     *
     * @param s string字符串
     * @return string字符串
     */
    public String change (String s) {
        // write code here
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if ('a' == s.charAt(i)) {
                sb2.append('a');
            } else {
                sb1.append(s.charAt(i));
            }
        }

        return (sb1.append(sb2)).toString();
    }

}
