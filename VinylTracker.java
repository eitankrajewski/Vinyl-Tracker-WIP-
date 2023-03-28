package com.eitankrajewski;

import java.util.ArrayList;
import java.util.Scanner;

public class VinylTracker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        printOptions();
        String vinyls = scanner.nextLine().toUpperCase();
        ArrayList<String> vinylList = new ArrayList<>();

        while (vinyls != "Q") {
            switch (vinyls) {
                case "A" -> {
                    System.out.println("Which vinyls would you like to add?: ");
                    vinyls = scanner.nextLine();
                    vinylList.add(vinyls);
                    System.out.println("Ok. " + vinyls + " added to the list.");
                    printOptions();
                    vinyls = scanner.nextLine();
                    if(vinyls == "P") {
                        System.out.println(vinylList);;
                    }
                }
                case "R" -> {
                    System.out.println("Which vinyls would you like to remove?: ");
                    vinyls = scanner.nextLine();
                    vinylList.remove(vinyls);
                    System.out.println("Ok. " + vinyls + " removed from the list.");
                    printOptions();
                    vinyls = scanner.nextLine();
                    if(vinyls == "P") {
                        System.out.println(vinylList);;
                    }
                }
                case "Q" -> {
                    return;
                }
                default -> {
                    System.out.println("Invalid choice selection. Please choose one of the choices from the list.");
                    printOptions();
                    vinyls = scanner.nextLine();
                }
            }
        }
    }


    private static void printOptions() {
        System.out.println("""
            What would you like to do?
            1) Add vinyls
            2) Remove vinyls
            3) Print out vinyl list
            4) Quit
            Enter option: """);
    }
    
}

