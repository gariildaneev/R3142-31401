package com.company;

public class Clefable extends Clefairy{
    Clefable(String name, int level){
        super(name, level);
        setStats(93,70,73,95,90,60);
        setType();
        setMove();
        addMove(new DisarmingVoice());
    }
}


