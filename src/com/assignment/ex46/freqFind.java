/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 barhom alko
 */

package com.assignment.ex46;

import java.nio.charset.*;
import java.util.*;
import java.io.*;

public class freqFind {

    //counts the frequency of each word in the text file and displays histogram
    static void wordFreq(String str)
    {
        Map<String,Integer> mp=new TreeMap<>();
        String arr[]=str.split(" ");

        for(int i=0;i<arr.length;i++)
        {
            if(mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i])+1);
            }
            else
            {
                mp.put(arr[i],1);
            }
        }

        for(Map.Entry<String,Integer> entry:
                mp.entrySet())
        {
            System.out.print(entry.getKey()+
                    " : ");
            for(int i=0;i<entry.getValue();i++)
            {
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }

    public static String readFileIntoString(String path, Charset encoding) throws IOException
    {
        String content;
        try (Scanner scanner = new Scanner(new File(path), String.valueOf(encoding))) {
            content = scanner.useDelimiter("\\A").next();
        }

        return content;
    }

    public static void main(String[] args)
    {

        String filePath = "exercise46_input.txt";

        String fileContent = null;
        try {
            fileContent = readFileIntoString(filePath, StandardCharsets.UTF_8);
            int thing=0;
            fileContent = fileContent.replaceAll("(\\r|\\n|\\t)", " ");
            fileContent=fileContent.replaceAll("\\s+"," ").trim();
            int b=0;
        } catch (IOException e) {
            e.printStackTrace();
        }


        assert fileContent != null;
        wordFreq(fileContent);
    }
}