package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    static String typOper = null ;
    static String iD = null ;
    static String secName = null;
    static String sex = null;
    static Date date = null;
//    static String date = null;

    static void fill(String parm1, String parm2, String parm3, String parm4) throws ParseException {
        typOper = parm1;
        secName = parm2;
        sex=(parm3.equals("м"))? "MALE":"FEMALE";
//        sex=(parm3.equals("м"))? "MALE":"FEMALE";
            String date1=null;
            date1=parm4;
            SimpleDateFormat form1D = new SimpleDateFormat("dd/MM/yyyy" );
            date  =  form1D.parse(date1);

    }
    static void fill(String parm1, String parm2, String parm3, String parm4,String parm5) throws ParseException {
        typOper = parm1;
        iD = parm2;
        secName = parm3;
        sex=(parm4.equals("м"))? "MALE":"FEMALE";
            String date1=null;
            date1=parm5;
            SimpleDateFormat form1D = new SimpleDateFormat("dd/MM/yyyy" );
        date  =  form1D.parse(date1);

    }
    static void fill(String parm1, String parm2 ) throws ParseException {
        typOper = parm1;
        iD = parm2;
    }

    static void print(){
        for (Person p:allPeople) {
//            System.out.println("indx:"+allPeople.indexOf(p)+" "+p.toString());

            Date date1=p.getBirthDate();
            SimpleDateFormat form1D = new SimpleDateFormat("dd/MM/yyyy" );
            SimpleDateFormat form2D = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH );
            String date3=form2D.format(date1);

            System.out.println("indx:"+allPeople.indexOf(p)+" "+p.getName()+" "+p.getSex()+" "+date3);
        }
    }


//    public String toString() {
//        String text = "";
//        text += "Имя: " + allPeople.get();
//        text += ", пол: " + (this.sex ? "мужской" : "женский");
//        text += ", возраст: " + this.age;
//        return text;}




    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        if (args.length==4) {
            fill(args[0], args[1], args[2], args[3]);
//            System.out.println(typOper+" "+secName+" "+((sex=="MALE")? "м":"ж")+" "+date);
        }else if (args.length==5) {
            fill(args[0], args[1], args[2], args[3], args[4]);
//            System.out.println(typOper+" "+iD+" "+secName+" "+((sex=="MALE")? "м":"ж")+" "+date);
        }else if (args.length==2) {
            fill(args[0], args[1]);
//            System.out.println(typOper+" "+iD);
        }

//        print();

        if (typOper.equals("-c")) {

            Sex sx=(sex.equals("MALE"))?Sex.MALE:Sex.FEMALE;
            allPeople.add(new Person(secName, sx, date));
            for (Person p:allPeople) {
                if (secName.equals(p.getName())) System.out.println(allPeople.indexOf(p));
            }

        }else if (typOper.equals("-u")) {
            for (Person p : allPeople) {
                if ((Integer.parseInt(iD)) == allPeople.indexOf(p)) {
//                if (iD.equals(allPeople.indexOf(p))){
                    p.setName(secName);
                    if (sex.equals("MALE")) p.setSex(Sex.MALE);
                    else p.setSex(Sex.FEMALE);
                    p.setBirthDate(date);
                }
            }
        }else if(typOper.equals("-d")) {
                for (Person p : allPeople) {
                    if ((Integer.parseInt(iD)) == allPeople.indexOf(p)) {
//                if (iD.equals(allPeople.indexOf(p))){
                        p.setName(null);
                        p.setSex(null);
                        p.setBirthDate(null);
                    }
                }
            } else if  (typOper.equals("-i")) {
            for (Person p:allPeople) {
                if ((Integer.parseInt(iD))==allPeople.indexOf(p)){
                        Date date1=p.getBirthDate();
                         SimpleDateFormat form2D = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH );
                        String date3=form2D.format(date1);

                         String pol =  (p.getSex().equals(Sex.MALE))?"м":"ж";

                    System.out.println(p.getName()+" "+pol+" "+date3);
                }
            }
        }



//        print();


}
}
