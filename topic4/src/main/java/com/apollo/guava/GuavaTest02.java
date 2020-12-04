package com.apollo.guava;

import com.google.common.cache.*;

import java.util.concurrent.TimeUnit;

public class GuavaTest02 {
    public static void main(String[] args) {
        CacheLoader<String, String> loader = new CacheLoader<String, String> () {
            public String load(String key) throws Exception {
                Thread.sleep(1000);
                if("key".equals(key)) return "null";
                System.out.println(key + " is loaded from a cacheLoader!");
                return key + "'s value";
            }
        };

        RemovalListener<String, String> removalListener = new RemovalListener<String, String>() {
            public void onRemoval(RemovalNotification<String, String> removal) {
                System.out.println("[" + removal.getKey() + ":" + removal.getValue() + "] is evicted!");
            }
        };

        LoadingCache<String, String> testCache = CacheBuilder.newBuilder()
                .maximumSize(7)
                .expireAfterWrite(10, TimeUnit.SECONDS)
                .removalListener(removalListener)
                .build(loader);

        for (int i = 0; i < 10; i ++){
            String key = "key" + i;
            String value = "value" + i;
            testCache.put(key,value);
            System.out.println("[" + key + ":" + value + "] is put into cache!");
        }

        System.out.println(testCache.getIfPresent("key6"));

        try{
            TimeUnit.SECONDS.sleep(2);
            System.out.println(testCache.get("key"));
            System.out.println(testCache.get("key11"));
            TimeUnit.SECONDS.sleep(4);
        } catch(Exception e){
            // e.printStackTrace();
        }
    }

}
