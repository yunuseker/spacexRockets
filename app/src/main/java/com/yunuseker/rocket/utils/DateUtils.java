package com.yunuseker.rocket.utils;

import android.text.format.DateFormat;
import android.util.Log;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by yunus.seker on 27.01.2019.
 */
public class DateUtils {

    public DateUtils() {
    }

    public String convertDate(String rawDate){
        String parsedDate="";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd",Locale.getDefault());
        try {
            Date date = format.parse(rawDate);
            parsedDate=DateFormat.format("dd.MM.yyyy",date.getTime()).toString();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parsedDate;
    }
}
