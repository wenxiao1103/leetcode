package com.learing.designMode.adapter;

import com.learing.designMode.adapter.classAdapter.ClassAdapter;
import com.learing.designMode.adapter.classAdapter.Target;
import com.learing.designMode.adapter.objectAdapter.Adaptee;
import com.learing.designMode.adapter.objectAdapter.ObjectAdapter;

/**
 * @author xiaowen
 * @date 2020/11/17 10:17 上午
 */
public class ObjectAdapterTest {
    //类结构型适配器模式
    //通过实现接口，继承适配者（Adaptee)的方式
//    public static void main(String[] args)
//    {
//        System.out.println("类适配器模式测试：");
//        Target target = new ClassAdapter();
//        target.request();
//    }

    //对象结构型适配器模式
    //通过实现接口，构建适配者（Adaptee)对象的方式
//    public static void main(String[] args)
//    {
//        System.out.println("对象适配器模式测试：");
//        Adaptee adaptee = new Adaptee();
//        Target target = (Target)new ObjectAdapter(adaptee);
//        target.request();
//    }
    /**
     * 适配器模式（Adapter）包含以下主要角色。
     目标（Target）接口：当前系统业务所期待的接口，它可以是抽象类或接口。
    适配者（Adaptee）类：它是被访问和适配的现存组件库中的组件接口。
    适配器（Adapter）类：它是一个转换器，通过继承或引用适配者的对象，把适配者接口转换成目标接口，让客户按目标接口的格式访问适配者。
     */

}
