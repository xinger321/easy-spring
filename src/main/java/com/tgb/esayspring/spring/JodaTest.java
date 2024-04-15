package com.tgb.esayspring.spring;

import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;

public class JodaTest {
    public static void main(String[] args) {
        String strDate = "2024-04-11";
        LocalDate parse = LocalDate.parse(strDate, DateTimeFormat.shortDate());
        System.out.println(parse);
    }
}
