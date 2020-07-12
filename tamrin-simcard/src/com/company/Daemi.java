package com.company;

import java.util.Scanner;

public class Daemi implements Simcart {

    Scanner scanner=new Scanner(System.in);

    public void etelaat(){
        System.out.println();
        System.out.print("enter sal tolid mobilee 13__");
        int c=scanner.nextInt();
        if(c>90)
            System.out.println("4G ast");
        else System.out.println("3G ast");
        System.out.println("sim shoma daemi va hamrah aval ast :))");
    }

    @Override
    public void kharidsharj() {
       try {
           throw new RuntimeException();
       }catch (RuntimeException e){
           System.out.println("daemi sharj nmishvd");
       }
    }

    @Override
    public void ghabz() {
        System.out.println();
        System.out.println("1.moshahede ghbz:");
        System.out.println("2.pardakht ghabz:");

        int i=scanner.nextInt();
        switch (i){
            case 1:
                System.out.print("mablagh pardakhti:");
                System.out.println("55000tomn");break;
            case 2:
                System.out.println("pardkht shod");break;
        }

    }


}
