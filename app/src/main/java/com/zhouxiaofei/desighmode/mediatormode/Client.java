package com.zhouxiaofei.desighmode.mediatormode;

/**
 * @author zhouxiaofei
 * @Date 2018/3/1 上午10:41
 */

public class Client {

    public static void main(String[] args) {
        AbstractMediator mediator = new ConcreteMediator();
        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);
        mediator.setC1(colleague1);
        mediator.setC2(colleague2);

        mediator.getC1().depMethod1();
        mediator.getC2().selfMethod2();


    }
}
