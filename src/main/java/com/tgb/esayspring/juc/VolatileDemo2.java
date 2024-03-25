package com.tgb.esayspring.juc;

/**
 * @title: springboot-essay
 * @description: volatile 不能保证原子性
 * @author: 北京小桔汇金网络科技有限公司
 * @date: 2023/03/12 15:19
 */
public class VolatileDemo2 {
    private static volatile int flag = 0;

    public static void main(String[] args) {
        for(int j = 0; j <100 ; j++) {
            new Thread(()->{
                for (int i = 0; i < 1000; i++) {
                    flag++;
                }
            }).start();
        }
        System.out.println(Thread.currentThread().getName() + "\tfinal flag result = " + flag);
    }
}
