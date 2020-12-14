package com.company;

import ru.ifmo.se.pokemon.*;

public class WakeUpSlap extends PhysicalMove {
    public WakeUpSlap(){
        super(Type.FIGHTING,70,100);
    }
    @Override
    protected String describe(){return"говорит сопернику 'вставай на работу пора'";}
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ACCURACY,-1);

    }
}




