package netology.hw221matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class Main {

    public static int SIZE = 9;
    public static int[][] colors = new int[SIZE][SIZE];
    public static int[][] rotatedColorsSWAP = new int[SIZE][SIZE];


    public static void main(String[] args) {

        random(colors);

        print(colors);

        System.out.println("Введите вариант угла поворота: \n" +
                "по часовой:\n" +
                "на 90градусов введите 1 \\ на 180 - 2 \\ на 270 - 3 \\ \n" +
                "против часовой:\n" +
                "на 90 - 4\n" +
                "побыстрее по часовой:\n" +
                "на 180 - 5 \\ на 270 - 6 ");

        String str = "";
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        try {
            str = buf.readLine();
            buf.close();
        } catch (IOException e) {
            System.out.println("ИО Пиу Пиу");
        }

        boolean swap = false;
        switch (Integer.parseInt(str)) {
            case 1:
                turn90R();
                break;
            case 2:
                turn90R();
                turn90R();
                swap = true;
                break;
            case 3:
                turn90R();
                turn90R();
                turn90R();
                swap = true;
                break;
            case 4:
                turn90L();
                break;
            case 5:
                turn180();
                break;
            default:
                turn270R1();
                break;
        }

        print(swap ? colors : rotatedColorsSWAP);                              //нужно свап если крутить неск. раз одним методом

    }

    private static void turn90R() {                                             //поворот на 90 на право
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[0].length; j++) {
                rotatedColorsSWAP[j][(colors.length - 1) - i] = colors[i][j];
            }
        }

        for (int i = 0; i < colors.length; i++) {                               //нужно только если еще раз крутить
            for (int j = 0; j < colors[0].length; j++) {
                colors[i][j] = rotatedColorsSWAP[i][j];
            }
        }
    }


    private static void turn90L() {                                              //поворот на 90 на лево
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[0].length; j++) {
                rotatedColorsSWAP[(colors.length - 1) - j][i] = colors[i][j];
            }
        }

        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[0].length; j++) {
                colors[i][j] = rotatedColorsSWAP[i][j];
            }
        }
    }


    private static void turn180() {                                              //поворот на 180  в один прием
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[0].length; j++) {
                rotatedColorsSWAP[(colors.length - 1 - i)][colors[0].length - 1 - j] = colors[i][j];
            }
        }
    }


    private static void turn270R1() {                                              //поворот на 270 на право  в один прием
        turn90L();
    }

    private static void turn270R2() {                                              //поворот на 270 на право  ***по понятиям***
        turn90R();
        turn90R();
        turn90R();
    }


    private static void random(int[][] colors) {
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
    }

    private static void print(int[][] colors) {
        int SIZE = colors.length;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }


}
