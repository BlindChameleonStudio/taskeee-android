package com.example.ejdy.todoapp;

import android.annotation.SuppressLint;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * base code created by Ferdousur Rahman Sarker on 3/19/2018.
 * additional features added by Blind Chameleon Studio - all rights reserved
 */

class Function {

    public static String Epoch2DateString(String epochSeconds, String formatString) {
        Date updatedate = new Date(Long.parseLong(epochSeconds));
        @SuppressLint("SimpleDateFormat") SimpleDateFormat format = new SimpleDateFormat(formatString);
        return format.format(updatedate);
    }

    public static Calendar Epoch2Calender(String epochSeconds) {
        Date updatedate = new Date(Long.parseLong(epochSeconds));
        Calendar cal = Calendar.getInstance();
        cal.setTime(updatedate);

        return cal;
    }
}