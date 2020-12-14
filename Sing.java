package com.company;

import ru.ifmo.se.pokemon.*;

public class Sing extends StatusMove {
    public Sing(){
        super();
        this.type = Type.NORMAL;
        this.accuracy = 55;
    }
    @Override
    protected String describe(){return "поёт!";}
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().condition(Status.SLEEP).turns(1);
        p.addEffect(e);
    }
}



