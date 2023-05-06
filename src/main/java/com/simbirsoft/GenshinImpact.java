package com.simbirsoft;

public class GenshinImpact extends Game {

    public GenshinImpact(String name, int price, boolean isInterestingGame) {
        super(name, price, isInterestingGame);
    }

    private int prayers = 0;

    public int getPrayers() {
        return prayers;
    }

    public void setPrayers(int prayers) {
        this.prayers = prayers;
    }

    public void buyMorePrayers() {
        if (prayers < 100) {
            System.out.println("Неужели тебе не хочется нового героя в твоей коллекции?");
        }
    }
}
