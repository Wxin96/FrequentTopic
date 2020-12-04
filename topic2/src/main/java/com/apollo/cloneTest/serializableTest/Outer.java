package com.apollo.cloneTest.serializableTest;

import java.io.*;

public class Outer implements Serializable{
    private static final long serialVersionUID = 369285298572941L;  //最好是显式声明ID
    public Inner inner;
    // 　Discription:[深度复制方法,需要对象及对象所有的对象属性都实现序列化]
    public Outer myclone() {
        Outer outer = null;
        try {// 将该对象序列化成流,因为写在流里的是对象的一个拷贝，而原对象仍然存在于JVM里面。所以利用这个特性可以实现对象的深拷贝
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);
            // 将流序列化成对象
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            outer = (Outer) ois.readObject();
            System.out.println(this.hashCode());
            System.out.println(outer.hashCode());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return outer;
    }

    public static void main(String[] args) {
        new Outer().myclone();
    }
}
