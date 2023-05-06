package com.simbirsoft;

public class Game {

    private String name;
    private int price;
    private boolean isInterestingGame;
    private final String[] numberOfDls = {"DLS1", "DLS2", "DLS3"};

    public Game(String name, int price, boolean isInterestingGame) {
        this.name = name;
        this.price = price;
        this.isInterestingGame = isInterestingGame;
    }

    public void setBadRating() {
            System.out.println("Не тратьте на это свое время и деньги");
    }

    public void setGoodRating() {
            System.out.println("Отличный ААА-проект");
    }

    public boolean isInterestingGame() {
        return isInterestingGame;
    }

    public void printDls() {
        for (int i = 0; i < numberOfDls.length; i++) {
            System.out.println(numberOfDls[i]);
        }
    }
}
