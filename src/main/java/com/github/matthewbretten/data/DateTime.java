package com.github.matthewbretten.data;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class DateTime {

    public static String getCurrentDate(){
        return ZonedDateTime.now(ZoneOffset.UTC).toString();
    }
}
