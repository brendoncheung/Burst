package com.alephreach.burst.persistence;

import android.arch.persistence.room.TypeConverter;

import java.sql.Date;

public class TimeConverter {

    @TypeConverter
    public static Date fromTimestamp(Long value) {
        return value == null ? null : new Date(value);
    }

    @TypeConverter
    public static Long fromDate(Date date) {
        return date == null ? null : date.getTime();
    }
}
