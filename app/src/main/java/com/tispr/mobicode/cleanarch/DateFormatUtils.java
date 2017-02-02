package com.tispr.mobicode.cleanarch;

import java.util.Date;

/**
 * Created by mikhail.ivanou on 03.12.16.
 */

public class DateFormatUtils {

    public static String format(Date formatDate) {
        return format(formatDate, new Date());
    }

    public static String format(Date formatDate, Date now) {
        return "Long time ago";
    }

}
