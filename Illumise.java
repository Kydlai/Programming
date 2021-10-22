package main;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

class Illumise extends Pokemon {

    public Illumise(String var1, int var2) {
        super(var1, var2);
        this.setStats(65, 47, 74, 73, 85, 85);
        this.setMove(new IcyWind(), new SkyDrop(), new ThunderWave(), new SilverWind());
        this.setType(Type.BUG);
    }

}
