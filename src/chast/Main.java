package chast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;


public class Main {
    public static void main (String args []) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input file name: ");

        String name = in.next();

        System.out.println("Entered file name: " + name);

        try
        {
            Numbers a = new Numbers();
            a.Start(name);
        }
        /*catch (FileNotFoundException ex)
        {
            System.out.println("File not found");
        }*/
        catch (IOException ex)
        {
            System.out.println("Incorrect input");
        }

    }
}
