package com.learing.designMode.singleton;

/**
 * @author xiaowen
 * @date 2020/10/4 9:03 下午
 */
public class EHanDanLi {
    private static EHanDanLi eHanDanLi = new EHanDanLi();
    private EHanDanLi() {};
    public static EHanDanLi getInstance() {
        return eHanDanLi;
    }
}
