package com.company;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class StoneEdge extends PhysicalMove {
    public StoneEdge(){
        super(Type.ROCK,100,80);
    }
    @Override
    protected String describe(){
        return ", ХОРОШАЯ РАБОТА";}
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.ATTACK,2);
    }
}


