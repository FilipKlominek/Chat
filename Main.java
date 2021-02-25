package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("messages.txt", true));
            BufferedReader br = new BufferedReader(new FileReader("messages.txt"));

            System.out.println("Zadej jméno:");
            String name = sc.nextLine();
            System.out.println("Pro ukončení zápisu zadej `!konec`");

            GUI.readAll();

            GUI.writeMessages(name);

            bw.close();
            br.close();
        } catch (Exception e) {
            System.out.println("1");
        }
    }
}