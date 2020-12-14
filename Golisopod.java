package com.company;


public class Golisopod extends Wimpod{
    Golisopod(String name, int level){
        super(name, level);
        setStats(75,125,140,60,90,40);
        setType();
        setMove(new DoubleTeam(),new Rest(),new LeechLife(),new Blizzard());
    }
}


