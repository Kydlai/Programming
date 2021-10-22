package main;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

class MetalSound extends StatusMove {
    public MetalSound(){super(Type.STEEL, 0, 85);}
    protected void applyOppEffects(Pokemon var1) {
        var1.setMod(Stat.SPECIAL_DEFENSE, (int) (var1.getStat(Stat.SPECIAL_DEFENSE) -2));
    }
}