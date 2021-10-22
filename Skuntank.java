package main;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

class Skuntank extends Pokemon {
    public Skuntank(String var1, int var2){
        super(var1, var2);
        this.setStats(103, 93, 67, 71, 61, 84);
        this.setMove(new Scratch(), new Rest(), new Meditate(), new AuraSphere());
        this.setType(Type.POISON, Type.DARK);
    }
}