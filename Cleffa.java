package com.company;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Cleffa extends Pokemon {
    Cleffa (String name, int level){
        super(name, level);
        setStats(50,25,28,45,55,15);
        setType(Type.FAIRY);
        setMove(new Sing(), new DreamEater());
    }


}

