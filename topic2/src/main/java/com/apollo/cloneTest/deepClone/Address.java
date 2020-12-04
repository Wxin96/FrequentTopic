package com.apollo.cloneTest.deepClone;

public class Address implements Cloneable {
    private String addr;

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    protected Address clone() {
        Address addr = null;
        try{
            addr = (Address)super.clone();
        }catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return addr;
    }
}
