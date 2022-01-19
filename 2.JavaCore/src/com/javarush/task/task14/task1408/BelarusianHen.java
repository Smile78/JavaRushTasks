package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen implements Country {
    @Override

    int getCountOfEggsPerMonth() {
        return 30*3-5;
    }

    String getDescription(){
        String str =super.getDescription()+" Моя страна - "+Country.BELARUS +"."+" Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
        return  str ;
    }
}
