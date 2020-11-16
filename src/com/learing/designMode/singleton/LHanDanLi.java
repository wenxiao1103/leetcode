package com.learing.designMode.singleton;

/**
 * @author xiaowen
 * @date 2020/10/4 9:00 下午
 */
public class LHanDanLi {
    private static LHanDanLi lHanDanLi = null;
    private LHanDanLi(){};
    public static synchronized LHanDanLi getInstance() {
        if (lHanDanLi == null) {
            lHanDanLi = new LHanDanLi();
        }
        return lHanDanLi;
    }
}
