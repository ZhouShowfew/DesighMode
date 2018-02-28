package com.zhouxiaofei.desighmode.abstractfactory;

/**
 * @author zhouxiaofei
 * @Date 2018/2/28 下午6:04
 */

public class Creator2 extends AbstractCreator {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
