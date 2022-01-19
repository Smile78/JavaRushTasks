package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Количество букв
*/

public class Solution1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а','б','в','г','д','е','ё','ж',
                'з','и','й','к','л','м','н','о',
                'п','р','с','т','у','ф','х','ц',
                'ч','ш','щ','ъ','ы','ь','э','ю','я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i <2; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // напишите тут ваш код
            int[] massBukv = new int[33];
        int cnt=0;
//        for (int i = 0; i <alphabet.size() ; i++) {
            for (int j = 0; j <list.size() ; j++) {
                char[] ch = list.get(j).toCharArray();
                    for (int k = 0; k <ch.length ; k++) {
                                for (int i = 0; i <alphabet.size() ; i++) {

//                        System.out.println(ch[k]);
//                        cnt++;
//                        System.out.println(alphabet.get(i));
                        if (alphabet.get(i)==ch[k]) massBukv[i]++;
                    }

            }
        }
//        System.out.println(cnt);
        System.out.println(Arrays.toString(massBukv));
    }
}
