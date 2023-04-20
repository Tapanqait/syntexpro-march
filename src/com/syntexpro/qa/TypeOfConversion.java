package com.syntexpro.qa;

public class TypeOfConversion {

    public static void main(String[] args) {

        //widening or Implicit
        // type compatible
        //destination type > source type

        //byte -> short-> int -> float -> long -> double
        //1         2      4      4        8         8

        // int a = 8;
        // long b = a;
        //type of casting
        // long b = 878L;
        //  int a =(int) b;
        //  System.out.println(a);
        //widening

        byte a = 10;
        long b = a;
        // System.out.println("widening:" + b);

        double c = 10.25;
        byte d = (byte) c;
        //System.out.println("narrowing:" + d);


        //char k = 'a';
        // int m = k;
        //  System.out.println(m);

        char k = 'c';

        int m = k;
        System.out.println(m);


    }
}
