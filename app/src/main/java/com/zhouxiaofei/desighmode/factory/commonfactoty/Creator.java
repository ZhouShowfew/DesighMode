package com.zhouxiaofei.desighmode.factory.commonfactoty;

/**
 * @author zhouxiaofei
 * @Date 2018/2/28 下午4:40
 */
//抽象工厂类
public abstract class Creator {

    /* * 创建 一个 产品 对象， 其 输入 参数 类型 可以 自行 设置 * 通常 为 String、 Enum、 Class 等， 当然 也可以 为 空 */
    public abstract <T extends Product> T createProduct(Class<T> c);
}
