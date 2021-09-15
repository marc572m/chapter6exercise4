package com.company;

import java.util.Scanner;

public class Main {

    public static boolean isAbecedarian(String s){
        String  testString = s.toLowerCase();
        for (int index = 1;index < testString.length(); index++){

            if (testString.charAt(index-1) <= testString.charAt(index))
            {

            }
            else{
                return false;
            }
        }
        return true;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        boolean result = isAbecedarian(s);
        if (result){
            System.out.println(s + " is Abecedarian");
        }else{
            System.out.println(s + " isn't Abecedarian");

        }


    }
}
