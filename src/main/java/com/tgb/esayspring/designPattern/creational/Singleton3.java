package com.tgb.esayspring.designPattern.creational;

/**
 * @title: springboot-essay
 * @description: 懒汉-synchronized-线程安全-但是线程阻塞，性能有问题，不推荐
 * @author: 北京小桔汇金网络科技有限公司
 * @date: 2023/03/07 15:34
 */
public class Singleton3 {
    private Singleton3() {
    }

    private static Singleton3 instance;
    public static synchronized Singleton3 getInstance(){
        if (instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
}
