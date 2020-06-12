package com.galvanize;

public class SomeProgram {
    public static void main(String args[])
    {
        if(args.length < 1)
        {
            System.out.println("Please provide arguments...");
        } else {
            for(int i = 0; i < args.length; i++){
                System.out.println(String.format("Your arguments are %s", args[i]));
            }

        }
    }
}
