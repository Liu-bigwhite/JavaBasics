package com.ls.study.string;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        test2("b");
    }

    public static void test1(String string){
        String s = "a";
        String b = s.concat(string);
        System.out.println(b);//"ab"
    }

    public static void test2(String string){
        StringBuilder stringBuilder = new StringBuilder("a");
        stringBuilder.append(string);
        System.out.println(stringBuilder);
    }
    public static void test3(String string){
        StringBuffer stringBuffer = new StringBuffer("a");
        stringBuffer.append(string);
        System.out.println(stringBuffer);
    }



}
