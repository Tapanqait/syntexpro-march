package com.syntexpro.qa;

public class TypePromotionInExpression {

    public static void main(String[] args) {

        byte a1 = 2; //int

        short b1 = 5;// int

        char c1 = 'a';//int

        int ans = a1 + b1 + c1; //2+5+97
        System.out.println(ans);

        byte a = 2; // promote = double =2.0
        char b = 'b';          //double = 99.0
        //float
        float c = 2.0f;

        double d = a + b + c;

        System.out.println(d);


        byte x = 2; //-127 to 128 // int
        byte y = (byte) (x * 2);
        System.out.println(y);

        short age = 23;
        long age2 = 25;
        float age3 = 26f;
        double age4 = 27;

        double sum = age + age2 + age3 + age4;

        System.out.println(sum);


    }


}
