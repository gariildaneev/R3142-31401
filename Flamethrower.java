package com.company;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Flamethrower extends SpecialMove {
    public Flamethrower(){
        super(Type.FIRE,95,100);
    }
    @Override
    protected String describe(){return "устраивает поджог";}
    protected void applyOppEffects(Pokemon p){
        if (Math.random()<= 0.4) Effect.burn(p);
    }
}


