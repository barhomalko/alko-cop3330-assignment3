/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 barhom alko
 */

package com.assignment.ex42;
import java.util.*;
import java.io.*;

//This java program will read in CSV from a text file and output the recors into a table on the console

public class parseData {
    public void printDetails(String filename) {
        try {
            File file = new File(filename);
            Scanner sc = new Scanner(file);

            while (sc.hasNext()) {
                String s = sc.nextLine();
                String[] temp = s.split(",");
                System.out.printf("%-17s%-17s%-17s\n", temp[0], temp[1], temp[2]);
            }
// prints any issues to console
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        parseData in = new parseData();
        System.out.printf("%-17s%-17s%-17s\n", "Last", "First", "Salary");
        System.out.println("----------------------------------------");
        in.printDetails("exercise42_input.txt");
    }
}
