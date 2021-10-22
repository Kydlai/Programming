package main;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

class Stunky extends Pokemon {

    public Stunky(String var1, int var2){
        super(var1, var2);
        this.setStats(63, 63, 47, 41, 41, 74);
        this.setMove(new Scratch(), new Rest(), new Meditate());
        this.setType(Type.POISON, Type.DARK);
    }

}
