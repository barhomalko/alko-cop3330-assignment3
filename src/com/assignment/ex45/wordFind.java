/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 barhom alko
 */

package com.assignment.ex45;
import java.io.*;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;


public class wordFind {

    public static void main(String[] args) throws IOException {

        File file = new File("exercise45_input.txt");
        Scanner sc = new Scanner(file);

        //create another Scanner object to prompt input from user via console

        Scanner s = new Scanner(System.in);

        //ask user for output name

        System.out.print("\nEnter output file name: ");

        String ffile = s.next();

        //create an output write object to write into a file

        FileWriter output = new FileWriter("exercise45_output.txt");


        try
        {

            //using while loop to read file

            while(sc.hasNext())
            {

                //read line

                String user = sc.nextLine();

                //replace utilize by use

                user = user.replaceAll("utilize", "use");

                //write into new file

                output.write(user);

                output.write("\n");


            }
        }
        finally
        {
            sc.close();
        }



        output.close();

        System.out.println("\nDone");

    }

}