package com.zhouxiaofei.desighmode.commondmode;

/**
 * @author zhouxiaofei
 * @Date 2018/3/1 上午9:35
 */

public class ConcreteCommand2 extends Command {

    private Receiver receiver;

    public ConcreteCommand2(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}
