package com.tgb.esayspring.juc;

/**
 * @title: springboot-essay
 * @description: 写一个小程序来体验一下，volatile的作用：保证线程间的可见性
 * @author: 北京小桔汇金网络科技有限公司
 * @date: 2023/03/12 15:19
 */
public class VolatileDemo {
    private static int flag = 0;
    //private volatile static int flag = 0;

    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                int localFlag = flag;
                while (true){
                    if (localFlag != flag){
                        System.out.println("读取到被修改的flag值为:"+flag);
                        localFlag = flag;
                    }
                }
            }
        }.start();
        
        new Thread(){
            @Override
            public void run() {
                int localFlag = flag;
                while (true){
                    System.out.println("flag被修改为了:"+ ++localFlag);
                    flag = localFlag;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                
            }
        }.start();
    }
}
