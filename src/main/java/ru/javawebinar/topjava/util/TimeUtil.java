package ru.javawebinar.topjava.util;

import java.time.LocalTime;

/**
 * Created by dimas on 03.12.16.
 */
public class TimeUtil {
    public static boolean isBetween(LocalTime lt, LocalTime startTime, LocalTime endTime) {
        return lt.compareTo(startTime) >= 0 && lt.compareTo(endTime) <= 0;
    }
}
