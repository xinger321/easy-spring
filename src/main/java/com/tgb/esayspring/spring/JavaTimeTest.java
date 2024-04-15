package com.tgb.esayspring.spring;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @description:
 * @author: 
 * @date: 2024-04-14 19:02
 */
public class JavaTimeTest {
    public static void main(String[] args) {
        String strDate = "2024-02-22";
        LocalDate parse = LocalDate.parse(strDate, DateTimeFormatter.ISO_DATE);
        System.out.println(parse);
        //LocalDate parse = LocalDate.parse(strDate, DateTimeFormat.shortDate());

    }
}
