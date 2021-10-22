package main;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

class Meditate extends StatusMove {
    public Meditate(){super(Type.PSYCHIC, 0, 0);}
    protected void applySelfEffects(Pokemon var1) {
        var1.setMod(Stat.ATTACK, (int) (var1.getStat(Stat.ATTACK) + 1));
    }
}
