package com.tgt.igniteplus;

public class custom extends Exception
{
    custom(String s)
    {
        super(s);
    }
}
class TestCustomException1
{

    static void validate(int zip)throws custom
    {
        if(String.valueOf(zip).length()<5)
            throw new custom("not valid");
        else
            System.out.println("Delivery available in your area");
    }

    public static void main(String args[])
    {
        System.out.println("Valid zip code:");
        try
        {
            validate(13054);
        }
        catch(Exception m)
        {
            System.out.println("Exception occurred: "+m);
        }
        System.out.println("\n\n\nInvalid zip code:");
        try
        {
            validate(123);
        }
        catch(Exception m)
        {
            System.out.println("Exception occurred: "+m);
        }
    }
}