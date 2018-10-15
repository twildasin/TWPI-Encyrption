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

    public String encode (String e)
    {
        char part;
        int asc;
        String bin;
        for (int i = 0; i < e.length(); i++)
        { //8 (later use)
            //Takes last char of string
            part = e.charAt(e.length());
            //converts that char to its decimal value
            asc = (int) part;
            //Adds three to that value
            asc = asc + 3;
            //converts that value from decimal to binary
            bin = Integer.toBinaryString(asc);
            if(bin.length() < 8)
            {
                //runs a loops until the "bin" string is 8 characters long
                for (int j = 1; j <= (8 - bin.length()); j++)
                {

                }
            }
        }
        return endval;
    }

    public String decode (String d)
    {
        for (int i = 0; i < d.length(); i++)
        {

        }
        return endval;
    }
}
