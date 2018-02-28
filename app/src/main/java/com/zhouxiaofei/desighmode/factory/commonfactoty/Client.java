package com.zhouxiaofei.desighmode.factory.commonfactoty;

/**
 * @author zhouxiaofei
 * @Date 2018/2/28 下午4:45
 */

public class Client {

    public static void main(String[] args){
        Creator creator = new ConcreteCreator();
        Product product1 = creator.createProduct(ConcreateProduct1.class);
        product1.method1();
        product1.method2();

        Product product2 = creator.createProduct(ConcreateProduct2.class);
        product2.method1();
        product2.method2();
    }
}
