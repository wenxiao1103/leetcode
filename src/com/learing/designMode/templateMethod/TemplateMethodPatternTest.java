package com.learing.designMode.templateMethod;

/**
 * @author xiaowen
 * @date 2020/11/17 10:41 下午
 */
public class TemplateMethodPatternTest {
    public static void main(String[] args) {
        AbstractClass tm = new ConcreteClass();
        tm.TemplateMethod();
    }
}
