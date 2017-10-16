package ru.ginzb.Sort;
import java.util.Arrays;
import java.util.Random;
import java.util.Collections; 
import java.io.FileInputStream;
import java.io.BufferedReader;  
import java.io.InputStreamReader;
import java.io.IOException;

class Sort {

    public class dot 
    {
        public int x;
        public int y;

        public dot(int x, int y) 
        {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args)
    {
        try
        {
            FileInputStream fstream = new FileInputStream("input.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null)
            {
                System.out.println(strLine);
            }
        }
        catch(IOException e)
        {
            System.out.println("Error");
        }

        System.out.println(
            String.format("Hello, Java from %s %s %s %s", 
                System.getProperty("os.name"),
                System.getProperty("os.version"),
                System.getProperty("java.version"),
                System.getProperty("java.home")
                )
            );
    }
}