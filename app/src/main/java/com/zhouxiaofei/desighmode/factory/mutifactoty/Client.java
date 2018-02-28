package com.zhouxiaofei.desighmode.factory.mutifactoty;

import com.zhouxiaofei.desighmode.factory.staticfactory.Human;

/**
 * @author zhouxiaofei
 * @Date 2018/2/28 下午5:13
 */

public class Client {

    public static void main(String[] args) {
        Human whiteHuman = new WhiteHumanFactory().createHuman();
        whiteHuman.getColor();
        whiteHuman.talk();

        Human blackHuman = new BlackHumanFactory().createHuman();
        blackHuman.getColor();
        blackHuman.talk();

        Human yellowHuman = new YellowHumanFactory().createHuman();
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
