package com.company;

import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon Clefable = new Clefable("Ведьма со стажем",217);
        Pokemon Clefairy = new Clefairy("Ведьма", 113);
        Pokemon Cleffa = new Cleffa("Саша",44);
        Pokemon Absol = new Absol("Олег", 163);
        Pokemon Wimpod = new Wimpod("Таракан",46);
        Pokemon Golisopod = new Golisopod("Большой таракан",186);
        b.addAlly(Wimpod);
        b.addAlly(Golisopod);
        b.addAlly(Absol);
        b.addFoe(Cleffa);
        b.addFoe(Clefable);
        b.addFoe(Clefairy);
        b.go();
    }
}

