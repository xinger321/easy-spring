package com.tgb.esayspring.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @title: springboot-essay
 * @description: 循环依赖问题
 * @author: 
 * @date: 2023/05/31 15:16
 */
public class CircularReferenceTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanA.class,BeanB.class);
        BeanA beanA = context.getBean(BeanA.class);
        BeanB beanB = context.getBean(BeanB.class);
        System.out.println(beanA);
        System.out.println(beanB);
        
        BeanB beanB1 = beanA.getBeanB();
        BeanA beanA1 = beanB.getBeanA();
        System.out.println(beanA == beanA1);
        System.out.println(beanB == beanB1);
        
    }    
}

class BeanA{
    @Autowired
    private BeanB beanB;

    public BeanB getBeanB() {
        return beanB;
    }

    public void setBeanB(BeanB beanB) {
        this.beanB = beanB;
    }
}

class BeanB{
    @Autowired
    private BeanA beanA;

    public BeanA getBeanA() {
        return beanA;
    }

    public void setBeanA(BeanA beanA) {
        this.beanA = beanA;
    }
}