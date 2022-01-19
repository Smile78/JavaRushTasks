package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 76;
    }

    String getDescription(){
        String str =super.getDescription()+" Моя страна - "+Country.UKRAINE+"."+" Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
        return  str ;
    }
}
