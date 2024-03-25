package com.tgb.esayspring.juc;

/**
 * @title: springboot-essay
 * @description: volatile 不能保证原子性
 * @author: 北京小桔汇金网络科技有限公司
 * @date: 2023/03/12 15:19
 */
public class VolatileDemo1 {
    private volatile int flag = 0;

    public void add(){
        flag++;
    }
    public static void main(String[] args) {
        VolatileDemo1 volatileDemo1 = new VolatileDemo1();
        for(int j = 0; j <20 ; j++) {
            new Thread(()->{
                for (int i = 0; i < 1000; i++) {
                    volatileDemo1.add();
                }
            }).start();
        }
        System.out.println(Thread.currentThread().getName() + "\tfinal flag result = " + volatileDemo1.flag);
    }
}
