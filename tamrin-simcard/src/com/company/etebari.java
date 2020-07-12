package com.company;

import java.util.Scanner;

public class etebari implements Simcart {
    Scanner scanner=new Scanner(System.in);

    public void etelaat(){
        System.out.println();
        System.out.print("enter sal tolid mobilee 13__");
        int c;
        int b=scanner.nextInt();
        if(b>90)
            System.out.println("4G ast");
        else System.out.println("3G ast");
        System.out.println("sim shoma etebari va irancell ast :))");
    }
    @Override
    public void kharidsharj() {
        System.out.println();
        System.out.println("1.2000");
        System.out.println("2.5000");
        System.out.println("3.10000");
        System.out.println("4.20000");

        System.out.println();
        int i=scanner.nextInt();
        switch (i){
            case 1:
                System.out.println("hesab etebar shoma 1800");break;
            case 2:
                System.out.println("hesab etebar shoma 47500");break;
            case 3:
                System.out.println("hesab etebar shoma 98000");break;
            case 4:
                System.out.println("hesab etebar shoma 198000");break;
        }
    }

    @Override
    public void ghabz() {
       try {
           throw new RuntimeException();
       }catch (RuntimeException e){
           System.out.println("u can t do it because your sim cart is etebari!!!");
       }
    }
}
