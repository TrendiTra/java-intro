package com.simbirsoft;

public class CallOfDuty extends Game {

    public CallOfDuty(String name, int price, boolean isInterestingGame) {
        super(name, price, isInterestingGame);
    }

    private int numberOfSkins = 0;

    public int getNumberOfSkins() {
        return numberOfSkins;
    }

    public void setNumberOfSkins(int numberOfSkins) {
        this.numberOfSkins = numberOfSkins;
    }

    public void buyNewSkinOnWeapon() {
        if (numberOfSkins < 10) {
            System.out.println("Будь самым крутым, приобрети новую раскраску на оружие!");
        }
    }
}
