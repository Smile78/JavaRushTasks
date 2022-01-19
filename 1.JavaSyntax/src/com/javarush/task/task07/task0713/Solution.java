package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> arrM = new ArrayList<Integer>();
        ArrayList<Integer> arrN3 = new ArrayList<Integer>();
        ArrayList<Integer> arrN2 = new ArrayList<Integer>();
        ArrayList<Integer> arrOthrs = new ArrayList<Integer>();

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i <20; i++) {
            arrM.add(Integer.parseInt(buf.readLine()));
        }

        for (int i = 0; i <arrM.size() ; i++) {
           if (arrM.get(i)%3==0) arrN3.add(arrM.get(i));
           if (arrM.get(i)%2==0) arrN2.add(arrM.get(i));
           if  (arrM.get(i)%3!=0&&arrM.get(i)%2!=0) arrOthrs.add(arrM.get(i));
        }

        printList(arrN3);
        printList(arrN2);
        printList(arrOthrs);

    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
