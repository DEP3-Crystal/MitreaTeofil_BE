package com.CrystalSystem;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product money: ");
        int money = scanner.nextInt();
        System.out.print("Enter your price: ");
        int price = scanner.nextInt();

        int[] change = vendingMachine.getChange(money, price);

        System.out.println(Arrays.toString(change));
    }
}
