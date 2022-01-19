package com.javarush.task.task16.task1631;


import com.javarush.task.task16.task1631.common.*;



public class ImageReaderFactory {
//    private static Reader1 reader;
    public static ImageReader getImageReader(ImageTypes imgTyp )   {
        if (imgTyp==null) throw new IllegalArgumentException("Неизвестный тип картинки");
             else if (imgTyp.equals(ImageTypes.BMP)) return new BmpReader();
             else if (imgTyp.equals(ImageTypes.JPG)) return new JpgReader();
             else if (imgTyp.equals(ImageTypes.PNG)) return new PngReader();

             else   throw new IllegalArgumentException("Неизвестный тип картинки");


    }
}
