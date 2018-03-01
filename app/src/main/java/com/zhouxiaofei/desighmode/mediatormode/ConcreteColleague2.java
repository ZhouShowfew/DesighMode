package com.zhouxiaofei.desighmode.mediatormode;

/**
 * @author zhouxiaofei
 * @Date 2018/3/1 上午10:27
 */

public class ConcreteColleague2 extends AbstractColleague {

    public ConcreteColleague2(AbstractMediator mediator) {
        super(mediator);
    }

    public void selfMethod2() {
        //处理自己的业务逻辑
    }

    public void depMethod2() {

        //处理自己的业务
        //自己处理不了的交给中介者处理
        super.mediator.doSomething2();
    }
}
