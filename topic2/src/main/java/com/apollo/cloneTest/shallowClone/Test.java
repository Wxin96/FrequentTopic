package com.apollo.cloneTest.shallowClone;

/**
 *  浅拷贝测试
 */
public class Test {

    public static void main(String[] args) {
        // Date
        Student stu1 = new Student();
        stu1.setNumber(123456);
        Address addr = new Address();
        addr.setAddr("杭州市");
        stu1.setAddr(addr);

        Student stu2 = stu1.clone();

        System.out.println("stu1.getNumber() = " + stu1.getNumber() + " , addr: " + stu1.getAddr().getAddr());
        System.out.println("stu2.getNumber() = " + stu2.getNumber() + " , addr: " + stu2.getAddr().getAddr());

        stu2.setNumber(654321);
        stu2.getAddr().setAddr("青岛市");

        System.out.println("stu1.getNumber() = " + stu1.getNumber() + " , addr: " + stu1.getAddr().getAddr());
        System.out.println("stu2.getNumber() = " + stu2.getNumber() + " , addr: " + stu2.getAddr().getAddr());
    }

}
