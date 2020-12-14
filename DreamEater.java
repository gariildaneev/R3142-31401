package com.company;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class DreamEater extends SpecialMove {
    public DreamEater(){
        super(Type.PSYCHIC,100,100);
    }
    @Override
    protected String describe(){return"Пожирает сны";}
    protected void applySelfEffects(Pokemon p){
        if (Math.random()<=0.1) p.setMod(Stat.HP, -40);
    }
}


