package com.company;

import java.io.*;
import java.util.Scanner;

public class GUI {
    public static void readAll() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("messages.txt"));

            String line = br.readLine();
            if (line != null) {
                System.out.println("------------------------");
                while (line != null) {
                    System.out.println(line);
                    line = br.readLine();
                }
                System.out.println("------------------------");
            } else System.out.println("-- Žádné příchozí zprávy --");
            br.close();
        } catch (Exception e) {
            System.out.println("2");
        }
    }

    public static void writeMessages(String name) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("messages.txt", true));

            Scanner sc = new Scanner(System.in);
            String message = "";

            while (!message.equals("!konec")) {
                message = sc.nextLine();
                bw.write(name + ": " + message);
                bw.newLine();
                System.out.println(name + ": " + message);
            }
            bw.close();
        } catch (Exception e) {
            System.out.println("3");
        }
    }
}