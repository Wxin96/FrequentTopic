package com.apollo.thinkInJava;

public class SimpleHolder {
    private Object obj;

    public Object get() {
        return obj;
    }

    public void set(Object obj) {
        this.obj = obj;
    }

    public static void main(String[] args) {
        SimpleHolder holder = new SimpleHolder();
        holder.set("Item");
        String s = (String) holder.get();
    }
}
