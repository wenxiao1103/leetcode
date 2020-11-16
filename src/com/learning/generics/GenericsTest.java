package com.learning.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author xiaowen
 * @date 2020/10/22 2:35 下午
 */
public class GenericsTest {
    public static void main(String[] args) {
//        List<Integer> integerList = new ArrayList<>();
//        List<String> stringList = new ArrayList<>();
//        System.out.println(integerList.getClass());
//        System.out.println(stringList.getClass());
//        System.out.println(integerList.getClass() == stringList.getClass());

//        List<? extends Person> extendsList = getPersonList();//<? extends Person>这种类型的范型只能get,不能add
////        extendsList.add(new Man());
////        extendsList.add(new Person());
//
//        Person p = extendsList.get(0);
//        System.out.println(p.getClass());
//    }
//    public static List<? extends Person> getPersonList() {//加入这个list的只能是同一类
//        List<Man> list = new ArrayList<>();
//        list.add(new Man());
//        return list;
        List<? super Person> list = new ArrayList<>();
        onlyAdd(list);
    }
    public static void onlyAdd(List<? super Person> list) {//<? super T>这种类型的泛型只能add,不能get
        list.add(new Man());
//        Person p = list.get(0);
        list.add(new Woman());
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getClass());
        }
    }

}
