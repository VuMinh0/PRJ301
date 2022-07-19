/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;

/**
 *
 * @author dai8p
 */
public class TimeHelper {

    private final String DATE_FORMAT_PATTERN = "dd/MM";
    private final int NUMBER_OF_WEEK_IN_YEAR = 52;

    public LinkedHashMap<String, String> getFirstAndLastDateByWeekNumber(int yearNumber, int weekNumber) {
        LinkedHashMap<String, String> result = new LinkedHashMap<>();

        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_PATTERN);
        Calendar startOfWeek = Calendar.getInstance();
        Calendar endOfWeek = Calendar.getInstance();

        startOfWeek.set(Calendar.YEAR, yearNumber);
        endOfWeek.set(Calendar.YEAR, yearNumber);

        startOfWeek.set(Calendar.WEEK_OF_YEAR, weekNumber);
        endOfWeek.set(Calendar.WEEK_OF_YEAR, weekNumber);

        startOfWeek.setFirstDayOfWeek(Calendar.MONDAY);
        endOfWeek.setFirstDayOfWeek(Calendar.MONDAY);

        startOfWeek.setMinimalDaysInFirstWeek(7);
        endOfWeek.setMinimalDaysInFirstWeek(7);

        startOfWeek.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        endOfWeek.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);

        result.put("firstDate", sdf.format(startOfWeek.getTime()));
        result.put("lastDate", sdf.format(endOfWeek.getTime()));

        return result;
    }

    public LinkedHashMap<String, String> getAllDateByWeekNumber(int yearNumber, int weekNumber) throws Exception {
        LinkedHashMap<String, String> result = new LinkedHashMap<>();
        LinkedHashMap<String, String> firstLastDateInWeekNumber = getFirstAndLastDateByWeekNumber(yearNumber, weekNumber);
        Calendar firstDate = convertStringToCalendar(firstLastDateInWeekNumber.get("firstDate"));
        Calendar lastDate = convertStringToCalendar(firstLastDateInWeekNumber.get("lastDate"));

        result.put("MONDAY", convertCalendarToSimpleStringDate(firstDate));
        result.put("TUESDAY", getNextDate(firstDate));
        result.put("WEDNESDAY", getNextDate(firstDate));
        result.put("THURSDAY", getNextDate(firstDate));
        result.put("FRIDAY", getNextDate(firstDate));
        result.put("SATURDAY", getNextDate(firstDate));
        result.put("SUNDAY", convertCalendarToSimpleStringDate(lastDate));

        return result;
    }

    public Calendar convertStringToCalendar(String dateToConvert) throws Exception {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_PATTERN);
        calendar.setTime(sdf.parse(dateToConvert));
        return calendar;
    }

    public Date convertStringToDate(String dateToConvert) throws Exception {
        Date date = new SimpleDateFormat(DATE_FORMAT_PATTERN).parse(dateToConvert);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.getTime();
    }

    public Date convertStringToDate(String dateToConvert, String pattern) throws Exception {
        Date date = new SimpleDateFormat(pattern).parse(dateToConvert);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.getTime();
    }

    public String convertStringToDate(String dateToConvert, String inputPattern, String outputPattern) throws Exception {
        Date date = new SimpleDateFormat(inputPattern).parse(dateToConvert);
        return new SimpleDateFormat(outputPattern).format(date);
    }

    public String convertCalendarToSimpleStringDate(Calendar calendarToConvert) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_PATTERN);
        return sdf.format(calendarToConvert.getTime());
    }

    public String getNextDate(Calendar dateToGetNext) throws Exception {
        Calendar nextDate = dateToGetNext;
        nextDate.add(Calendar.DATE, 1);
        return convertCalendarToSimpleStringDate(nextDate);
    }

    public LinkedHashMap<Integer, String> getAllWeekFromToDateByYear(int yearNumber) {
        LinkedHashMap<Integer, String> result = new LinkedHashMap<>();
        LinkedHashMap<String, String> firstLastDate;
        for (int i = 1; i <= NUMBER_OF_WEEK_IN_YEAR; i++) {
            firstLastDate = getFirstAndLastDateByWeekNumber(yearNumber, i);
            result.put(i, firstLastDate.get("firstDate") + " To " + firstLastDate.get("lastDate"));
        }
        return result;
    }

    public int getDayInWeekByDate(String date) throws Exception {
        Date cvDate = convertStringToDate(date, "yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(cvDate);
        return calendar.get(Calendar.DAY_OF_WEEK);
    }
}
