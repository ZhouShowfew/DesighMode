package com.zhouxiaofei.desighmode.mediatormode;

/**
 * @author zhouxiaofei
 * @Date 2018/3/1 上午10:24
 */
//抽象中介者
public abstract class AbstractMediator {
    protected ConcreteColleague1 c1;
    protected ConcreteColleague2 c2;

    public ConcreteColleague1 getC1() {
        return c1;
    }

    public ConcreteColleague2 getC2() {
        return c2;
    }

    public void setC1(ConcreteColleague1 c1) {
        this.c1 = c1;
    }

    public void setC2(ConcreteColleague2 c2) {
        this.c2 = c2;
    }

    public abstract void doSomething1();

    public abstract void doSomething2();
}
