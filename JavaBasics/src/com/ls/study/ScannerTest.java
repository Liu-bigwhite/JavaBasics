package com.ls.study;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        methodParam(new Scanner(System.in));

    }
    public static void methodParam(Scanner sr){
        int num = sr.nextInt();
        System.out.println("输入的是"+num);
    }
}
