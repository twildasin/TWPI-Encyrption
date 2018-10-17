package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String input = "";
        String ende = "";
        Scanner kkbin = new Scanner(System.in);
        boolean con1 = false;


        System.out.println("Welcome, would you like to encode or decode a word?");

        //While loops makes sure user types in an appropriate input
        while(con1 == false)
        {
            //Gets input from user and stores in "ende"
            ende = kkbin.nextLine();

            if(Objects.equals(ende.toLowerCase(), "encode")) {

                con1 = true;

                System.out.println("Please input the word you would like to encode:");
                input = kkbin.nextLine();
                Encrypt en = new Encrypt(input);
                System.out.println("\nInput: " + input + "\nEncoded: " + en.encode());


            }
            else if(Objects.equals(ende.toLowerCase(), "decode")) {

                con1 = true;

                System.out.println("Please input the word you would like to decode:");
                input = kkbin.nextLine();
                Encrypt en = new Encrypt(input);
                System.out.println("\nInput: " + input + "\nDecoded: " + en.decode());

            }
            else
                System.out.println("Invalid input, please input \"encode\" or \"decode\"");
        }




    }
}
