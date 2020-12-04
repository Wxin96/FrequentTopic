package com.apollo.proxy.dynamicProxy1;

/**
 *  实现一个发短信的接口
 */
public class SmsServiceImpl implements SmsService {
    @Override
    public String send(String message) {
        System.out.println("send message:" + message);
        return message;
    }
}
