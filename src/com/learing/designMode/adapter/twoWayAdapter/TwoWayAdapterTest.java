package com.learing.designMode.adapter.twoWayAdapter;

/**
 * @author xiaowen
 * @date 2020/11/17 10:38 上午
 */
public class TwoWayAdapterTest {
    interface TwoWayTarget {
        public void request();
    }
    interface TwoWayAdaptee
    {
        public void specificRequest();
    }
    //目标实现
    static class TargetRealize implements  TwoWayTarget {
        public void request() {
            System.out.println("目标代码被调用");
        }
    }
    //适配者实现
    static class AdapteeRealize implements TwoWayAdaptee {
        @Override
        public void specificRequest() {
            System.out.println("适配者代码被调用");
        }
    }
    //双向适配器
    static class TwoWayAdapter  implements TwoWayTarget,TwoWayAdaptee
    {
        private TwoWayTarget target;
        private TwoWayAdaptee adaptee;
        public TwoWayAdapter(TwoWayTarget target)
        {
            this.target=target;
        }
        public TwoWayAdapter(TwoWayAdaptee adaptee)
        {
            this.adaptee=adaptee;
        }
        public void request()
        {
            adaptee.specificRequest();
        }
        public void specificRequest()
        {
            target.request();
        }
    }
    //测试
    public static void main(String[] args)
    {
        System.out.println("目标通过双向适配器访问适配者：");
        TwoWayAdaptee adaptee=new AdapteeRealize();
        TwoWayTarget target=new TwoWayAdapter(adaptee);
        target.request();
        System.out.println("-------------------");
        System.out.println("适配者通过双向适配器访问目标：");
        target=new TargetRealize();
        adaptee=new TwoWayAdapter(target);
        adaptee.specificRequest();
    }
}
