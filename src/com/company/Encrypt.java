package com.company;

/**
 * Created by tw073 on 10/15/18.
 */
public class Encrypt {

    private String val;
    private String endval;

    public Encrypt (String i)
    {
        val = i;
    }

    public String encode ()
    {
        char part;
        int asc;
        String hex;
        String wrd = val;
        endval = "";
        for (int i = 0; i < val.length(); i++)
        { //8 (later use)
            //Takes last char of string
            part = wrd.charAt(wrd.length()-1);

            //Removes last character from word to prepare for next run through for loop
            wrd = wrd.substring(0,wrd.length() - 1);

            //converts that char to its decimal value
            asc = (int) part;

            //Adds three to that value
            asc = asc + 3;

            //converts that value from decimal to binary
            hex = Integer.toHexString(asc);

            //If the hex value only has one character, it will add a zero to the beginning (this is used for decoding)
            if(hex.length() == 1)
                hex = "0" + hex;

            endval = endval + hex;

        }
        return endval;
    }

    public String decode ()
    {
        char prt;
        int dec;
        String lst2;
        String wrd = val;
        endval = "";

        for (int i = 0; i < (val.length())/2; i++)
        {
            //Takes last two hex values from phrase
            lst2 = wrd.substring(wrd.length()-2, wrd.length());

            //Removes last two characters to prepare for next run through for loop
            wrd = wrd.substring(0, wrd.length()-2);

            //Converts those last two characters from hex to dec
            dec = Integer.parseInt(lst2, 16);

            //Subtracts 3, part of decoding
            dec = dec - 3;

            //Converts that decimal value to its ascii character
            prt = (char) dec;

            //Adds that character on to the end value
            endval = endval + prt;
        }
        return endval;
    }
}
