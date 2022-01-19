package com.javarush.task2;

import com.javarush.task2.task17.Test1701;

import java.util.ArrayList;
import java.util.List;

public class Test1708 {


    public static void main(String[] args) {
        new Test1708.NoteThread().start();
        new Test1708.NoteThread().start();
    }

    public static class Note {

        public static volatile List<String> notes = new ArrayList<String>();

        public static void addNote(int index, String note) {
            System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
            notes.add(index, note);
            System.out.println("Уже добавлена заметка [" + note + "]");
        }

        public static void removeNote(int index) {
            System.out.println("Сейчас будет удалена заметка с позиции " + index);
            String note = notes.remove(index);
            System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
        }

    }

    public static class NoteThread extends Thread {

        @Override
        public void run() {
            for (int i = 0; i <= 999; i++) {
                Test1708.Note.addNote(0, getName() + "-Note" + i);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Test1708.Note.removeNote(0);
            }
        }

    }
}



