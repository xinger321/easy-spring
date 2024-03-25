package com.tgb.esayspring.juc;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * @title: springboot-essay
 * @description: 延迟订单
 * @author: 
 * @date: 2023/06/30 20:42
 */
public class OrderDelay implements Delayed {
    private String orderId;
    private long timeout;

    public OrderDelay(String orderId, long timeout) {
        this.orderId = orderId;
        this.timeout = timeout;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return 0;
    }

    @Override
    public int compareTo(Delayed o) {
        return 0;
    }
    void print(){
        System.out.println(orderId + "要被删除了");
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1111");
        list.add("2222");
        list.add("3333");
        list.add("4444");

        DelayQueue<OrderDelay> queue = new DelayQueue<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 4; i++) {
            queue.put(new OrderDelay(list.get(i),TimeUnit.NANOSECONDS.convert(3,TimeUnit.SECONDS)));
            try {
                queue.take().print();
                System.out.println("After" + (System.currentTimeMillis() - start) +"s");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
