package com.company;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class PlayRough extends PhysicalMove {
    public PlayRough(){
        super(Type.FAIRY,90,90);
    }
    @Override
    protected String describe(){return "играет грубо";}
    protected void applyOppEffects(Pokemon p){
        if(Math.random()<= 0.3) p.setMod(Stat.ATTACK,-1);
    }
}

