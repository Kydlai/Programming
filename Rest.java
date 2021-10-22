package main;

import ru.ifmo.se.pokemon.*;

class Rest extends StatusMove {
    public Rest(){super(Type.PSYCHIC, 0, 0);}
    protected void applySelfEffects(Pokemon var1) {
        var1.setMod(Stat.HP, (int) (2 * (var1.getStat(Stat.HP)) - (int) var1.getHP()));
        var1.setCondition(new Effect().condition(Status.PARALYZE).stat(Stat.SPEED, -2).attack(0.75D).turns(2));
    }
}
