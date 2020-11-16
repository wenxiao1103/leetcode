package com.learing.designMode.singleton;

import javax.swing.plaf.SliderUI;

/**
 * @author xiaowen
 * @date 2020/10/4 9:05 下午
 */
public class SLHanDanLi {
    private static SLHanDanLi slHanDanLi = null;
    private SLHanDanLi() {}
    public static SLHanDanLi getInstance() {
        if (slHanDanLi == null) {
            synchronized (SLHanDanLi.class) {
                if (slHanDanLi == null) {
                    slHanDanLi = new SLHanDanLi();
                }
            }
        }
        return slHanDanLi;
    }
}
