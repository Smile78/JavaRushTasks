package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 86;
    }

    String getDescription(){
        String str =super.getDescription()+" Моя страна - "+Country.MOLDOVA +"."+" Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
        return  str ;
    }
}
