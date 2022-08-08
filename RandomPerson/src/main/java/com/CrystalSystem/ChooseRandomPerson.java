package com.CrystalSystem;

import java.util.*;

public class ChooseRandomPerson {
    public static List<String> chosen = new ArrayList<>();
    public static List<String> people = new ArrayList<>();
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        String option = "";

        while (!option.equals("0")) {
            System.out.println("""

                    1. List of peoples
                    2. Choose a random person
                    3. The chosen ones
                    0. Exit
                    
                    Select an option (1, 2, 3, 0):""");

            option = scanner.next();
            switch (option) {
                case "1" -> showPeoples();
                case "2" -> chooseRandom();
                case "3" -> showChosen();
                case "0" -> System.exit(0);
                default -> System.err.println("Invalid option");
            }
        }
    }

    private static void showPeoples() {
        for (String person : people) {
            System.out.println(person);
        }
    }

    public static void chooseRandom() {
        Random random = new Random();
        int nr = random.nextInt(people.size());
        String randomName = people.get(nr);
        if (!(chosen.contains(randomName))) {
            System.out.println(randomName);
            chosen.add(randomName);
        } else {
            System.out.println(randomName + " has already been chosen. Pick another");
        }
    }

    public static void showChosen() {
        for (String picked : chosen) {
            System.out.println(picked);
        }
    }
}