package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {


    public static HashMap<String, Date> createMap() throws ParseException {

        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("NAS", df.parse("AUGUST 1 1983"));
        map.put("NSS", df.parse("MAY 18 1977"));
        map.put("BAI", df.parse("FEBRUARY 02 1959"));
        map.put("NNN", df.parse("DECEMBER 21 1955"));
        map.put("ZOO", df.parse("JULY 16 1987"));
        map.put("NSI", df.parse("NOVEMBER 14 2007"));
        map.put("CEN", df.parse("OCTOBER 23 1959"));
        map.put("CHN", df.parse("JANUARY 21 1976"));
        map.put("PSA", df.parse("AUGUST 25 1986"));
        return map;
        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator();
                while (it.hasNext()){
                    HashMap.Entry<String, Date> pair = it.next();
                        if (pair.getValue().getMonth()>4 && pair.getValue().getMonth()<8)
                         it.remove();
                }
    }

    public static void main(String[] args) throws ParseException {
        HashMap<String, Date> map= createMap() ;
        removeAllSummerPeople(map);
        System.out.println(map);


    }
}
