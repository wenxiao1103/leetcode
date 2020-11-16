package com.leetcode.test;

import java.util.logging.SocketHandler;

public class ExtendTest {
    public static class Animals{
        public int color;
        public void eat(){
            System.out.println("eat");
        }
    }

    public static class Cat extends Animals{
        @Override
        public void eat() {
            System.out.println("cat + eat");
        }
    }

    public static void main(String[] args){
        Animals animals = new Cat();
        animals.eat();
    }
}
