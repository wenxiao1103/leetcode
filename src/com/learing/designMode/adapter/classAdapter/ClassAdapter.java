package com.learing.designMode.adapter.classAdapter;

/**
 * @author xiaowen
 * @date 2020/11/17 10:14 上午
 */
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void request() {
        specificRequest();
    }
}
