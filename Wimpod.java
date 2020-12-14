package com.company;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Wimpod extends Pokemon {
    Wimpod(String name, int level){
        super(name, level);
        setStats(25,35,40,20,30,80);
        setType(Type.WATER,Type.BUG);
        setMove(new DoubleTeam(),new Rest(),new LeechLife());
    }
}


