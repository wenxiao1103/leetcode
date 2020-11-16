package com.learing.designMode.builder;

/**
 * @author xiaowen
 * @date 2020/11/9 7:26 下午
 */
public class Product {
    private String partA;
    private String partB;
    private String partC;
    public void setPartA(String partA)
    {
        this.partA=partA;
    }
    public void setPartB(String partB)
    {
        this.partB=partB;
    }
    public void setPartC(String partC)
    {
        this.partC=partC;
    }
    public void show()
    {
        //显示产品的特性
    }
}
