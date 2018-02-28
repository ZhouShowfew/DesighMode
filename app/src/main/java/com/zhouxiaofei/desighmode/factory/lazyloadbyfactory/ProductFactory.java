package com.zhouxiaofei.desighmode.factory.lazyloadbyfactory;

import com.zhouxiaofei.desighmode.factory.commonfactoty.ConcreateProduct1;
import com.zhouxiaofei.desighmode.factory.commonfactoty.ConcreateProduct2;
import com.zhouxiaofei.desighmode.factory.commonfactoty.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhouxiaofei
 * @Date 2018/2/28 下午5:34
 */

public class ProductFactory {
    private static final Map<String, Product> prMap = new HashMap<>();

    public static synchronized Product createProduct(String type) throws Exception {
        Product product = null;
        if (prMap.containsKey(type)) {
            product = prMap.get(type);
        } else {
            if (type.equals("Product1")) {
                product = new ConcreateProduct1();
            } else {
                product = new ConcreateProduct2();
            }

            prMap.put(type, product);
        }
        return product;
    }
}
