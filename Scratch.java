package com.company;

import ru.ifmo.se.pokemon.*;

public class Scratch extends PhysicalMove {
    public Scratch(){
        super(Type.NORMAL,100,100);
    }
    @Override
    protected String describe(){return "просто бьет";
    }

}

