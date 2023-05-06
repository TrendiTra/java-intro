package com.simbirsoft;

public class CallOfDuty extends Game {

    public CallOfDuty(String name, int price, boolean isInterestingGame) {
        super(name, price, isInterestingGame);
    }

    public void buyNewSkinOnWeapon(int numberOfSkins) {
        if (numberOfSkins < 10) {
            System.out.println("Будь самым крутым, приобрети новую раскраску на оружие!");
        } else {
            System.out.println("Оформи предзаказ на новое дополнение!");
        }
    }
}
