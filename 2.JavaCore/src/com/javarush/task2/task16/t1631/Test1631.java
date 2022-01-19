package com.javarush.task2.task16.t1631;


public class Test1631 {

/*
Factory method pattern
*/

        public static void main(String[] args) {
            ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);

        }
}