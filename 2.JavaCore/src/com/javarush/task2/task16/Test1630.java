package com.javarush.task2.task16;

import java.io.*;

public class Test1630 {

//     public static String firstFileName = "d:\\1.txt";
//     public static String secondFileName= "d:\\2.txt";

    public static String firstFileName  ;
    public static String secondFileName ;


    static {
        try {
            BufferedReader buff1 = new BufferedReader(new InputStreamReader(System.in));
            firstFileName = buff1.readLine();
            secondFileName = buff1.readLine();
            buff1.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);
        String getFileContent();
        void join() throws InterruptedException;
        void start();
    }

    //add your code here - добавьте код тут

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fName;
        private String line="";

        @Override
        public void setFileName(String fullFileName) {
            this.fName = fullFileName;
        }

        @Override
        public String getFileContent() {
//            try {
//                BufferedReader buff  = new BufferedReader(new FileReader(fName));
//                String s;
//                while ( !(s=buff.readLine()).equals("") ) line = line +s +" ";
//                buff.close();
//            } catch (Exception e) {}
            return line;
        }

        @Override
        public void run() {
            BufferedReader buff = null;
            try {
                buff = new BufferedReader(new FileReader(fName));
            } catch (FileNotFoundException e) {}
            try {
//              while (buff.ready()) { System.out.println( buff.readLine() + " ");}
                while (buff.ready()) {line =line+ buff.readLine() + " ";}
            } catch (IOException e) {}

        }




    }


}
