package main;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

class AegislashBlade extends Pokemon {
    public AegislashBlade (String var1, int var2){
        super(var1, var2);
        this.setStats(60, 50, 140, 50, 140, 60);
        this.setMove(new Counter(), new RockSlide(), new MetalSound(), new Rest());
        this.setType(Type.STEEL, Type.GHOST);
    }
}