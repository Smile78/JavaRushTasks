package com.javarush.task2;

public class Test1709 {
    public static volatile int proposal1part = 0;

    public static void main(String[] args) {
        new AcceptProposal().start();
        new MakeProposal().start();
    } 

    public static class MakeProposal extends Thread {
        @Override
        public void run() {
            int makedProposal = proposal1part;

            while (proposal1part < 10) {
//                System.out.println("Сделано предложение №" + (thisProposal + 1));
//                proposal = ++thisProposal;
                System.out.println("часть1проп Сделано предложение №" + (++makedProposal));
                proposal1part = makedProposal;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        }
    }

    public static class AcceptProposal extends Thread {
        @Override
        public void run() {
            int accptedProposal = proposal1part;

            while (accptedProposal < 10) {
                if (accptedProposal < proposal1part) {
                    System.out.println("часть2проп Принято предложение №" + proposal1part);
                    accptedProposal = proposal1part;
                }

            }
        }
    }

}
