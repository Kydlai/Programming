package main;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

class ThunderWave extends StatusMove {
    public ThunderWave(){super(Type.ELECTRIC, 0, 90);}

    protected void applyOppEffects(Pokemon var1) {
        Effect.paralyze(var1);
    }
}