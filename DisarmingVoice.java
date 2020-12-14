package com.company;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class DisarmingVoice extends SpecialMove {
    public DisarmingVoice(){
        super(Type.FAIRY,40,100);
    }
    @Override
    protected String describe(){return"КАК ЗАОРЁТ";}
    protected void applySelfEffects(Pokemon p){
        if (Math.random()<=0.2) p.setMod(Stat.DEFENSE,1);
    }
}


