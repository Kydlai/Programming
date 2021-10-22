package main;

import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args){
        Illumise Bread = new Illumise("Bread", 1);
        Honedge Weat = new Honedge("Weat", 1);
        Stunky Guy = new Stunky("Guy", 1);
        Skuntank Warrior = new Skuntank("Warrior", 1);
        Doublade Defender = new Doublade("Defender", 1);
        AegislashBlade Expert = new AegislashBlade("Expert", 1);
        Battle battle_for_ITMO = new Battle();
        battle_for_ITMO.addAlly(Expert);
        battle_for_ITMO.addAlly(Warrior);
        battle_for_ITMO.addAlly(Defender);
        battle_for_ITMO.addFoe(Bread);
        battle_for_ITMO.addFoe(Guy);
        battle_for_ITMO.addFoe(Weat);
        battle_for_ITMO.go();
    }

}
