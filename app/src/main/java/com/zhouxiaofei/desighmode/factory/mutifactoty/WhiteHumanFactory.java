package com.zhouxiaofei.desighmode.factory.mutifactoty;

import com.zhouxiaofei.desighmode.factory.staticfactory.BlackHuman;
import com.zhouxiaofei.desighmode.factory.staticfactory.Human;
import com.zhouxiaofei.desighmode.factory.staticfactory.WhiteHuman;

/**
 * @author zhouxiaofei
 * @Date 2018/2/28 下午5:12
 */

public class WhiteHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}
