package main;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

class Doublade extends Pokemon {
    public Doublade (String var1, int var2){
        super(var1, var2);
        this.setStats(59, 110, 150, 45, 49, 35);
        this.setMove(new Counter(), new RockSlide(), new MetalSound());
        this.setType(Type.STEEL, Type.GHOST);
    }
}