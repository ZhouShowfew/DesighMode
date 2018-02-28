package com.zhouxiaofei.desighmode.factory.staticfactory;

/**
 * @author zhouxiaofei
 * @Date 2018/2/28 下午5:01
 */

public class Client {

    public static void main(String[] args) {

        Human whiteHuman = HumanFactory.createHunan(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        Human blackHuman = HumanFactory.createHunan(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();

        Human yellowHuman = HumanFactory.createHunan(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
