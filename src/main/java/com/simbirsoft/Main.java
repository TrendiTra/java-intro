package com.simbirsoft;

public class Main {

    public static void main(String[] args) {

        Skyrim skyrim = new Skyrim("Skyrim", 80, true);
        GenshinImpact genshinImpact = new GenshinImpact("GenshinImpact", 10000, false);
        CallOfDuty callOfDuty = new CallOfDuty("CallOfDuty", 180, false);

        skyrim.fusRoDar();
        skyrim.printDls();
        skyrim.setGoodRating();

        System.out.println();
        genshinImpact.setBadRating();
        genshinImpact.buyMorePrayers(99);

        System.out.println();
        callOfDuty.setBadRating();
        callOfDuty.buyNewSkinOnWeapon(1);
    }
}
