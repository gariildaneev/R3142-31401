package com.company;

import ru.ifmo.se.pokemon.*;

public class LeechLife extends PhysicalMove {
    public LeechLife(){
        super(Type.BUG,80,100);
    }
    @Override
    protected String describe(){return"Крадёт хп и бьёт ";}
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.HP,-30);
    }
}

