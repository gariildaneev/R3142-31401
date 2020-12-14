package com.company;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Blizzard extends SpecialMove {
    public Blizzard() {super(Type.ICE,110,70);}
    @Override
    protected String describe(){return "Устраивает вьюгу:)";}
    protected void applyOppEffects(Pokemon p){
        if (Math.random()<= 0.4) Effect.freeze(p);
    }
}


