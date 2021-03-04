package com.company;

import java.util.Base64;
import java.util.Scanner;



public class Decoder {
    public static String decode(){
        Scanner sNum = new  Scanner(System.in);
        System.out.print(" DECODE : ");

        return sNum.nextLine();
    }

    public static void main(String[] args){
        while (true) {
            String stard = decode();
            byte[] decode = Base64.getDecoder().decode(stard.getBytes());
            String decof = new String(decode);
            System.out.println("DECODED-TEXT: " + decof);
        }


    }
}