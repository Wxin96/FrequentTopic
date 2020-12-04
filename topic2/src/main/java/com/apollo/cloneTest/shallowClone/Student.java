package com.apollo.cloneTest.shallowClone;

public class Student implements Cloneable {
    private int number;

    private Address addr;

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public Student clone() {
        Student stu = null;

        try {
            stu = (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return stu;
    }
}
