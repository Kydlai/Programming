package main;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

class SilverWind extends SpecialMove {
    public SilverWind(){super(Type.BUG, 60, 100);}
    protected void applySelfEffects(Pokemon var1) {
        if(Math.random() > 0.9)
        {
            var1.setMod(Stat.ATTACK, (int) (var1.getStat(Stat.ATTACK) + 1));
        }
        if(Math.random() > 0.9)
        {
            var1.setMod(Stat.SPEED, (int) (var1.getStat(Stat.SPEED) + 1));
        }
        if(Math.random() > 0.9)
        {
            var1.setMod(Stat.SPECIAL_ATTACK, (int) (var1.getStat(Stat.SPECIAL_ATTACK) + 1));
        }
        if(Math.random() > 0.9)
        {
            var1.setMod(Stat.SPECIAL_DEFENSE, (int) (var1.getStat(Stat.SPECIAL_DEFENSE) + 1));
        }
        if(Math.random() > 0.9)
        {
            var1.setMod(Stat.DEFENSE, (int) (var1.getStat(Stat.DEFENSE) + 1));
        }
    }
}
