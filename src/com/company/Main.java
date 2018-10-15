package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String input = "";
        String output = "";
        String ende = "";
        Scanner kkbin = new Scanner(System.in);
        boolean con1 = false;
        boolean encd = true;

        System.out.println("Welcome, would you like to encode or decode a word?");

        //While loops makes sure user types in an appropriate input
        while(con1 == false)
        {
            //Gets input from user and stores in "ende"
            ende = kkbin.nextLine();

            if(Objects.equals(ende.toLowerCase(), "encode")) {
                encd = true;
                con1 = true;
            }
            else if(Objects.equals(ende.toLowerCase(), "decode")) {
                encd = false;
                con1 = true;
            }
            else
                System.out.println("Invalid input, please input \"encode\" or \"decode\"");
        }



    }
}
