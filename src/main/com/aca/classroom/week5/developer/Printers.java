package com.aca.classroom.week5.developer;

public class Printers {

    public static void main(String[] args) {
        Developer eric1 = new Developer("Eric");
        Developer eric2 = new Developer("Eric");

        System.out.println(eric1.equals(eric2));

        //print("sdfdsfdsfds");
       // print(564);
       // print(new Developer("sdfsdf"));
//
       // Integer;
       // Double;
       // Float;
       // Character;
       // Boolean;
       // Short;
       // Long;
       // Byte;
       // int i = 456;
       // //boxed
       // Integer i1 = 456;
    }

    public static void printAll(Object[] devs) {
        for (int i = 0; i < devs.length; i++) {
            System.out.println(devs[i].toString());
        }
    }

    public static void print(Object o) {
        System.out.println("---- " + o.toString());
    }
}
