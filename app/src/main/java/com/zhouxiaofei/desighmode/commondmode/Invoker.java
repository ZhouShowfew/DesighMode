package com.zhouxiaofei.desighmode.commondmode;

/**
 * @author zhouxiaofei
 * @Date 2018/3/1 上午9:37
 */
//调用者
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }
}
