package com.ls.study;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateFormatTest {
    public static void main(String[] args) {
        Date date = new Date();
       String str = utils.dateToString(date,"yyyy-MM-dd HH:mm:ss");
        System.out.println(str);
    }
}
