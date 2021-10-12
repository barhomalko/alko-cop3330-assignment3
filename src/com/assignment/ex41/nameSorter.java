/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 barhom alko
 */
package com.assignment.ex41;
import java.util.*;
import java.io.*;

// this java program will read in a list of names from a text file, sort by lastnames alphabetically
// and print output to a text file

//define class
public class nameSorter {
    public static void readNames(Scanner input, ArrayList<String> names) {
        while (input.hasNextLine()) {
            names.add(input.nextLine());
        }
    }

    // define function for outputting names

    public static void outputNames(ArrayList<String> names) throws IOException {

        // output file writer

        FileWriter output = new FileWriter("exercise41_output.txt");
        output.write("Total of " + names.size() + " names\n");
        output.write("------------------------\n");

        for (String i : names) {
            output.write(i + "\n");
        }
        output.close();
    }

    public static void main(String[] args) throws FileNotFoundException {

        // Read input and array

        Scanner inputFile = new Scanner(new File("exercise41_input.txt"));
        ArrayList<String> names = new ArrayList<String>();
        readNames(inputFile, names);

        // sort names

        Collections.sort(names, String.CASE_INSENSITIVE_ORDER);
        inputFile.close();

        // writes output file

        try {
            outputNames(names);
        }

        // prints any issues to console

        catch (Exception e) {
            System.out.println(e);
        }
    }
}


