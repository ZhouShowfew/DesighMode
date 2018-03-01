package com.zhouxiaofei.desighmode.mediatormode;

/**
 * @author zhouxiaofei
 * @Date 2018/3/1 上午10:22
 */
//抽象同事者
public abstract class AbstractColleague {

    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
