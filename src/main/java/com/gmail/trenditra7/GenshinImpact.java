package com.gmail.trenditra7;

public class GenshinImpact extends Game {

    public GenshinImpact(String name, int price, boolean isInterestingGame) {
        super(name, price, isInterestingGame);
    }

    public void buyMorePrayers(int prayers) {
        if (prayers < 100) {
            System.out.println("Неужели тебе не хочется нового героя в твоей коллекции?");
        } else {
            System.out.println("Купи молитвы на будущих героев!");
        }
    }
}
