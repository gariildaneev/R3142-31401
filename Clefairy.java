package com.company;

public class Clefairy extends Cleffa{
     Clefairy(String name,int level){
         super(name, level);
         setStats(70,45,48,60,65,35);
         setType();
         setMove(new Sing(), new DreamEater(), new WakeUpSlap());
     }
}



