package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
        Cat catGrandFather = new Cat(grandFatherName,null,null);
        String grandMotherName = reader.readLine();
        Cat catGrandMather = new Cat(grandMotherName,null,null);


        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catGrandFather,null);
        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, null,catGrandMather);

        String sonName = reader.readLine();
        Cat catSon= new Cat(sonName, catFather, catMother);
        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catFather, catMother);



        System.out.println(catGrandFather);
        System.out.println(catGrandMather);

        System.out.println(catFather);
        System.out.println(catMother);

        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
            private String name;
            private Cat parentFa;
            private Cat parentMa;


            Cat(String name, Cat parentFa, Cat parentMa) {
                this.name = name;
                this.parentFa = parentFa;
                this.parentMa = parentMa;
            }

            @Override
            public String toString() {
                if (parentFa == null&&parentMa==null)
                    return "Cat name is " + name + ", no mother"+ ", no father";

                else if (parentMa==null)
                    return "Cat name is " + name +", no mother"+ ", father is "+ parentFa.name;

                else if (parentFa==null)
                    return "Cat name is " + name + ", mother is "+ parentMa.name+", no father";

                else
                    return "Cat name is " + name +", mother is " +parentMa.name + ", father is " +parentFa.name ;

            }
    }

}
