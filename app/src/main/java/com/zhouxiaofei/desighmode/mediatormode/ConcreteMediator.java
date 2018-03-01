package com.zhouxiaofei.desighmode.mediatormode;

/**
 * @author zhouxiaofei
 * @Date 2018/3/1 上午10:31
 */

public class ConcreteMediator extends AbstractMediator {
    @Override
    public void doSomething1() {
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }

    @Override
    public void doSomething2() {
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }
}
