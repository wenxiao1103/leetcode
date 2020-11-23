package com.learing.designMode.adapter.objectAdapter;

/**
 * @author xiaowen
 * @date 2020/11/17 10:16 上午
 */
public class ObjectAdapter implements Target {
    private Adaptee adaptee;
    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
