package com.tgb.esayspring.jvm.classload;

/**
 * @title: springboot-essay
 * @description:
 * @author: 
 * @date: 2023/03/07 13:41
 */
public class OutClass {
    public static Long currentTime = System.currentTimeMillis() ;
    public OutClass() {
        System.out.println("OutClass构造器");
    }

    {
        System.out.println("非静态初始化块");
    }
    static {
        System.out.println("外部类的static方法块");
    }
    public static void outMethod(){
        System.out.println("外部类的静态方法outMethod");
    }
    public void method(){
        System.out.println("外部类的普通方法");
    }
    
    static class InnerClass{
        public InnerClass() {
            System.out.println("InnerClass构造器");
        }
        static int a;
        static {
            System.out.println("InnerClass的static方法块");
        }
        static void innerMethod(){
            System.out.println("InnerClass的innerMethod内部类的静态方法块");
        }
    }

    public static void main(String[] args) {
        System.out.println("currentTime="+currentTime);
        //OutClass out = new OutClass();
        System.out.println("====================");
        //InnerClass innerClass = new InnerClass();
        //OutClass.InnerClass.innerMethod();
        InnerClass.a=1;
    }
}
