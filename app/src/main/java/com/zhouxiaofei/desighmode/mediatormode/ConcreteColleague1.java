package com.zhouxiaofei.desighmode.mediatormode;

/**
 * @author zhouxiaofei
 * @Date 2018/3/1 上午10:27
 */

public class ConcreteColleague1 extends AbstractColleague {

    //构造方法注入中介者
    public ConcreteColleague1(AbstractMediator mediator) {
        super(mediator);
    }

    public void selfMethod1(){
        //处理自己的业务逻辑
    }

    public void depMethod1(){
        super.mediator.doSomething1();
    }
}
