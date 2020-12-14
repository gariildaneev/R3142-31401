package com.company;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Absol extends Pokemon {
    Absol (String name, int level){
        super(name, level);
        setStats(65,130,60,75,60,75);
        addType(Type.DARK);
        addMove(new Scratch());
        addMove(new PlayRough());
        addMove(new Flamethrower());
        addMove(new StoneEdge());
    }

}

