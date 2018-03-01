package com.zhouxiaofei.desighmode.commondmode;

/**
 * @author zhouxiaofei
 * @Date 2018/3/1 上午9:38
 */

public class Client {

    //考虑Receiver与Client解耦
    public static void main(String[] args){
        Invoker invoker = new Invoker();
        Receiver receiver = new ConcreteReceiver1();
        Command command = new ConcreteCommand1(receiver);

        invoker.setCommand(command);
        invoker.action();
    }
}
