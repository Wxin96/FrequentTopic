package com.apollo.deadlock;

public class EasyJstack extends Thread{

    private EasyJstackResource resourceManger;// 资源管理类的私有引用，通过此引用可以通过其相关接口对资源进行读写
    private int a, b;// 将要写入资源的数据

    public static void main(String[] args) throws Exception {
        EasyJstackResource resourceManager = new EasyJstackResource();
        EasyJstack stack1 = new EasyJstack(resourceManager, 1, 2);
        EasyJstack stack2 = new EasyJstack(resourceManager, 3, 4);
        stack1.start();
        stack2.start();
    }

    public EasyJstack(EasyJstackResource resourceManager, int a, int b) {
        this.resourceManger = resourceManager;
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        while (true) {
            this.resourceManger.read();
            this.resourceManger.write(this.a, this.b);
        }
    }


}
