package com.zhouxiaofei.desighmode.factory.commonfactoty;

/**
 * @author zhouxiaofei
 * @Date 2018/2/28 下午4:36
 */

public abstract class Product {

    public void method1() {
        //业务逻辑处理
        System.out.println("method1(Product:12)-->>通用逻辑处理");
//        Log.d("zxf","method1(Product:12)-->>通用逻辑处理");
    }

    public abstract void method2();
}
