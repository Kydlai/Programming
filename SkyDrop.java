package main;

import ru.ifmo.se.pokemon.*;

class SkyDrop extends PhysicalMove {

    public SkyDrop(){super(Type.FLYING, 60, 100);}

    protected void applySelfDamage(Pokemon var1, double var2) {var1.setMod(Stat.HP, (int)Math.round(var2));}

    Effect IntoAir = new Effect().turns(0);

    protected void applyOppEffects(Pokemon var1) {var1.addEffect(IntoAir);}

    protected void applySelfEffects(Pokemon var1) {var1.addEffect(IntoAir);}
}