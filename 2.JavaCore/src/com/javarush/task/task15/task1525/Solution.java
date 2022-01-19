package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(Statics.FILE_NAME));
            String s;
            while (!(s = reader.readLine()).equals("[]")) lines.add(s);
//            while (!(s = reader.readLine()).isEmpty()) System.out.println(s);
            reader.close();
        } catch (Exception e) {

        }
    }


//static {
//    try {
//        InputStream inpSt = new FileInputStream(new File(Statics.FILE_NAME));
//        while (inpSt.available() > 0) {
//            char chr =(char) inpSt.read();
//            System.out.print(chr);
////            lines.add(Character.toString(chr));
//         }
//        inpSt.close();
//    } catch (FileNotFoundException e) {
//        System.out.println("нету файла");
//    } catch (IOException e) {
//        System.out.println("IO ошибка");
//    }
//}



public static void main(String[] args) {
        System.out.println(lines);
    }
}
