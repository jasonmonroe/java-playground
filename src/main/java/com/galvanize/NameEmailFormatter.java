package com.galvanize;

public class NameEmailFormatter {

    public static void main(String args[]){
        //      Angelica Schuyler <angelica@example.com>
        if(args.length == 0){
             System.out.println("Please specify a name and email");
        } else if(args.length == 1){
            System.out.println(String.format("Please specify an email for %s", args[0]));
        } else if(args.length >= 2) {
            // Jon Snow <jon@thewall.com>
            System.out.println(String.format("%s %s", args[0], args[1]));
        }


    }
}
