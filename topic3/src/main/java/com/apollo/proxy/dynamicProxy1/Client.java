package com.apollo.proxy.dynamicProxy1;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        SmsService smsService = new SmsServiceImpl();
        SmsService proxyInstance = (SmsService)Proxy.newProxyInstance(smsService.getClass().getClassLoader(), smsService.getClass().getInterfaces(), new DebugInvocationHandler(smsService));

        proxyInstance.send("hello");
    }
}
