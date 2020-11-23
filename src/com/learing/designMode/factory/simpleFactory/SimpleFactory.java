package com.learing.designMode.factory.simpleFactory;

/**
 * @author xiaowen
 * @date 2020/11/22 9:37 下午
 */
public class SimpleFactory {
    public static Product makeProduct(int kind) {
        switch (kind) {
            case Const.PRODUCT_A:
                return new ConcreteProduct1();
            case Const.PRODUCT_B:
                return new ConcreteProduct2();
        }
        return null;
    }
}
