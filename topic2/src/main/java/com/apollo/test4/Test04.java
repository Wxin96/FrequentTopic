package com.apollo.test4;

class Test05 {
    public static void main(String[] args) {
        System.out.println("文件名不同于类名");
        short a = 1000;
        short aa = (short) 0xFFFFF;
        int b = 0X11;
        b = 0B111001;

        test(+a);
        boolean bb = true | false;
        // Double.MAX_VALUE;
        try {
            int c = 1/0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public static void test (int a) {

    }
    public static void test (short a) {

    }


}
