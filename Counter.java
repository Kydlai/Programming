package main;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

class Counter extends PhysicalMove {
    public Counter() {
        super(Type.FIGHTING, 0, 100, -5, 1);
    }

    protected void applyOppDamage(Pokemon var1, double var2) {
        var1.setMod(Stat.HP, (int) (var1.getStat(Stat.ATTACK) / 2));
    }
}
