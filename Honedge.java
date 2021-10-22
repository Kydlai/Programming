package main;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

class Honedge extends Pokemon {
    public Honedge (String var1, int var2){
        super(var1, var2);
        this.setStats(45, 80, 100, 35, 37, 28);
        this.setMove(new Counter(), new RockSlide());
        this.setType(Type.STEEL, Type.GHOST);
    }
}