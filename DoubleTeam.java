package com.company;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class DoubleTeam extends StatusMove {
    public DoubleTeam(){
        super();
        this.type = Type.NORMAL;
    }
    @Override
    protected String describe(){return "Уклонился";}
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.EVASION,1);
    }
}

