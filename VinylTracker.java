package com.eitankrajewski;

import java.util.ArrayList;
import java.util.Scanner;

public class VinylTracker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        printOptions();
        String vinyls = scanner.nextLine().toUpperCase();
        ArrayList<String> vinylList = new ArrayList<>();

        switch(vinyls) {
            case "A" -> {
                    System.out.println("Which vinyls would you like to add?: ");
                    vinyls = scanner.nextLine();
                    vinylList.add(vinyls);
                    System.out.println(vinylList);
            }
            case "R" -> vinylList.remove(vinyls);
            case "Q" -> {
                return;
            }
            default -> {
                vinylList.add(vinyls);
            }
        }

    }

    private static void printOptions() {
        System.out.println("""
            What would you like to do?
            1) Add vinyls
            2) Remove vinyls
            3) Quit
            Enter option: """);
    }
}
