/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 barhom alko
 */

package com.assignment.ex43;
import java.io.*;
import java.util.Scanner;

//prompts user a set of questions to create a website

public class webGen
{
    public static void main(String[] args)
    {
        Scanner SC = new Scanner(System.in);
        String currentPath, author, siteName;
        char js = 'N';
        char css = 'N';
        System.out.print("website name: ");
        siteName = SC.nextLine();
        System.out.print("Author: ");
        author = SC.nextLine();
        System.out.print("Do you want a folder for JavaScript? ");
        js = SC.next().charAt(0);
        System.out.print("Do you want a folder for CSS? ");
        css = SC.next().charAt(0);
        currentPath = System.getProperty("user.dir");
        currentPath += "\\"+siteName;
        File website = new File(currentPath);
        boolean webCreate = website.mkdir();
        if(webCreate)
        {
            System.out.println("Created " + currentPath);
            try
            {
                FileWriter skeletonWriter = new FileWriter(new File(currentPath+"\\index.html"));
                skeletonWriter.write("<!ECOTYPE html>\n<html lang=\"en\">\n<head>\n");
                skeletonWriter.write("\t<meta author=\""+author+"\">\n");
                skeletonWriter.write("\t<title>"+siteName+"</title>\n");
                skeletonWriter.write("</head>\n<body>\n\n</body>\n</html>");
                skeletonWriter.close();
                System.out.println("Created " +currentPath+"\\index.html");
                if(js == 'y')
                {
                    File jsFolder = new File(currentPath+"\\js");
                    boolean jsCreated = jsFolder.mkdir();
                    if(jsCreated)
                    {
                        System.out.println("Created " +jsFolder+"\\");
                    }
                    else
                    {
                        System.out.println("Javascript folder has not been made");
                    }
                }
                if(css == 'y')
                {
                    File cssFolder = new File(currentPath+"\\css");
                    boolean cssCreated = cssFolder.mkdir();
                    if(cssCreated)
                    {
                        System.out.println("Created " +cssFolder+"\\");
                    }
                    else
                    {
                        System.out.println("CSS folder has not been made");
                    }
                }
            }
            catch(IOException e)
            {
                System.out.println("index.html has not been made");
            }
        }
        else
        {
            System.out.println("Website folder has not been made");
        }
        SC.close();
    }
}