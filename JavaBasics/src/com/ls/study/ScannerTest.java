package com.ls.study;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        System.out.println("shu ru de shi :"+next);

        //methodParam(new Scanner(System.in));

    }
    public static void methodParam(Scanner sr){
        int num = sr.nextInt();
        System.out.println("输入的是"+num);
    }
}
