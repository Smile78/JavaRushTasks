package com.javarush.task2.task16.t1631;

public class ImageReaderFactory implements ImageReader{
    public static ImageReader getImageReader(ImageTypes img){
           if (img==null) throw new IllegalArgumentException("Неизвестный тип картинки");
           else if (img.equals(ImageTypes.BMP)) return new BmpReader();
           else if (img.equals(ImageTypes.JPG)) return new JpgReader();
           else if (img.equals(ImageTypes.PNG)) return new PngReader();
           else throw new IllegalArgumentException("Неизвестный тип картинки");


    }
}
