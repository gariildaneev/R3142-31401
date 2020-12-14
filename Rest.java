package com.company;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest(){
        super();
        this.type = Type.PSYCHIC;
    }
    @Override
    protected String describe(){return "Пошел спать";}
    protected void applySelfEffects(Pokemon p){
        Effect e = new Effect().condition(Status.SLEEP).turns(1);
        p.addEffect(e);
        p.getStat(Stat.HP);
    }
}


