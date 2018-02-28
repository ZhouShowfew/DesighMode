package com.zhouxiaofei.desighmode.factory.staticfactory;

/**
 * @author zhouxiaofei
 * @Date 2018/2/28 下午4:57
 */

public class HumanFactory {

    public static <T extends Human> T createHunan(Class<T> c){

        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
         System.out.println("人种生产错误");
        }

        return (T) human;
    }
}
