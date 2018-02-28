package com.zhouxiaofei.desighmode.factory.singletonfactory;

import java.lang.reflect.Constructor;

/**
 * @author zhouxiaofei
 * @Date 2018/2/28 下午5:19
 */

public class SingletonFactory {

    private static Singleton singleton;

    static {
        try {
            Class c1 = Class.forName(Singleton.class.getName());
            Constructor constructor = c1.getDeclaredConstructor();
            constructor.setAccessible(true);
            singleton = (Singleton) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Singleton getSingleton(){
        return singleton;
    }
}
