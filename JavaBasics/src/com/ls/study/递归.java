package com.ls.study;

public class 递归 {

    public static void main(String[] args) {

        System.out.println(f(5));
        test();
    }
    public static int f(int i){
        if (i == 1){
            return 1;
        }else {
            return i*f(i-1);
        }

    }

    public static void test(){
        int i = 1;
        i+=10;
//        i = i+10;
        System.out.println(i);
    }
}
