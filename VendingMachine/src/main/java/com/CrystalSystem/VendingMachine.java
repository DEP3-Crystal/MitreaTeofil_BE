package com.CrystalSystem;

public class VendingMachine {

    public final int ONE_C = 1;
    public final int FIVE_C = 5;
    public final int TEN_C = 10;
    public final int TWENTY_FIVE_C = 25;
    public final int FIFTY_C = 50;
    public final int ONE_HUNDRED_C = 100;

    public int[] getChange(int money, int price) {

        if (money < price) {
            System.err.println("Insufficient founds");
            return null;
        }

        int[] availableCoins = {ONE_C, FIVE_C, TEN_C, TWENTY_FIVE_C, FIFTY_C, ONE_HUNDRED_C};
        int[] returnCoins = new int[]{0, 0, 0, 0, 0, 0};

        int toReturn = money - price;
        System.out.println("change to return: " + toReturn);

        for (int i = availableCoins.length - 1; i >= 0 && toReturn != 0; i--) {
            int biggestCoin = availableCoins[i];
            while (toReturn >= biggestCoin) {
                returnCoins[i]++;
                toReturn -= biggestCoin;
            }
        }
        return returnCoins;
    }
}
