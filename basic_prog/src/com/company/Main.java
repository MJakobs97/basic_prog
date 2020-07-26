package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static ArrayList<Bekannte> freundesliste = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        int menuChoice = 999;

        while(menuChoice != 0){

            printMenu();

            menuChoice = Integer.parseInt(in.readLine());
            switch (menuChoice){
                case 0: System.exit(0);  break;
                case 1: System.out.println("Hello there :) !"); break;
                case 2:
                        Bekannte tempBekannte = new Bekannte();
                    System.out.println("Bitte Vornamen eingeben");

                        tempBekannte.vorname = in.readLine();
                    System.out.println("Bitte Nachnamen eingeben");
                        tempBekannte.name = in.readLine();
                    System.out.println("Bitte Wohnort eingeben");
                        tempBekannte.wohnort = in.readLine();
                    System.out.println("Bitte coX eingeben");
                        tempBekannte.coX = Double.parseDouble(in.readLine());
                    System.out.println("Bitte coY eingeben");
                        tempBekannte.coY = Double.parseDouble(in.readLine());

                        freundesliste.add(tempBekannte);
                break;
                case 3:
                    for (Bekannte freund: freundesliste) {
                        freund.printInfo();
                    }break;

                case 4:
                    System.out.println("Bitte den gewünschten Vornamen eingeben");
                    String friendToEdit = in.readLine();
                    /*Need to implement iterative comparison */
                    break;
            }


        }
    }

    public static void printMenu(){
        System.out.println("(0) - Exit");
        System.out.println("(1) - PrintGreeting");
        System.out.println("(2) - Add Friend");
        System.out.println("(3) - Printout Friends");
        System.out.println("(4) - Edit Friend");
    }


}
