package edu.hillel.date.demo;

import sun.util.resources.CalendarData;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateInfoProvider {
    public static void main(String[] args) {

        Date d;
        Calendar c;
        TimeZone tz;

        Arrays
                .stream(TimeZone.getAvailableIDs())
                .forEach(System.out::println);

        System.out.println("Date from object Date: ");
        Date curDate = new Date();
        System.out.println(curDate.toString());

        long millis = curDate.getTime();
        System.out.println(millis);
        System.out.println(String.valueOf(millis));

        //this is very useful format curDate & time

        SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat format3 = new SimpleDateFormat("dd MMMM yyyy zzzz");
        SimpleDateFormat format4 = new SimpleDateFormat("dd MMMM yyyy zzzz", Locale.UK);
        SimpleDateFormat format5 = new SimpleDateFormat("E, dd MMMM yyy HH:mm:ss z");
        SimpleDateFormat format6 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss ");


        System.out.println(format1.format(curDate));
        System.out.println(format2.format(curDate));
        System.out.println(format3.format(curDate));
        System.out.println("with locale: " + format4.format(curDate));
        System.out.println("A long format: " + format5.format(curDate));

        System.out.println(format6.format(curDate));


        // Example of DateFormat

        String dateToString = DateFormat.getInstance().format(curDate);
        System.out.println("Example date from DateFormat " + dateToString);
        String getTime = DateFormat.getTimeInstance().format(curDate);
        System.out.println(getTime);
        String getDate = DateFormat.getDateInstance().format(curDate);
        System.out.println(getDate);
        String getTimeDay = DateFormat.getDateTimeInstance().format(curDate);
        System.out.println(getTimeDay);

        String time = DateFormat.getTimeInstance(DateFormat.SHORT).format(curDate);
        String timeWithSec = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(curDate);
        System.out.println(time);
        System.out.println(timeWithSec);

        String timeLong = DateFormat.getTimeInstance(DateFormat.LONG).format(curDate);
        System.out.println(timeLong);

        String timeAndDay = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.LONG).format(curDate);
        System.out.println(timeAndDay);

        Calendar calendar = Calendar.getInstance();
        calendar.set(2019, 6, 15);
        System.out.println("data from calendar " + calendar.getTime());

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
        int dayOfWeekInMonth = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_MONTH);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int week = calendar.get(Calendar.WEEK_OF_MONTH);
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        System.out.println("year " + year + " month " + month + " dayOfYear " + dayOfYear + " day of week in month " + dayOfWeekInMonth + " day Of Week " + dayOfWeek + " day Of Month " + dayOfMonth);
        System.out.println("week in month: " + week);
        System.out.println("week of year: " + weekOfYear);

        //last day of month

        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.DAY_OF_MONTH, -15);
        System.out.println("this is last day of our month " + calendar.get(Calendar.DAY_OF_MONTH));



        //last day of third week

        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2019, 1, 1);

        int weekOfMyDate = calendar1.get(Calendar.WEEK_OF_MONTH);
        int dayOfWeekImMyDate = calendar1.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        System.out.println();
        System.out.println("week of month: " + weekOfMyDate);
        System.out.println("day of week: " + dayOfWeekImMyDate);
        calendar1.add(Calendar.WEEK_OF_MONTH, 3);
        calendar1.add(Calendar.DAY_OF_MONTH, -10);
        System.out.println(calendar1.get(Calendar.DAY_OF_MONTH));

    }
}
