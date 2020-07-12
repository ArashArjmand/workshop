package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        Simcart simcart1 = new Daemi();
        Simcart simcart2 = new etebari();

        Karbar karbar1 = new Karbar();
        System.out.print("3rghm aval shomare:");
        int s;
        int t = scanner.nextInt();
        karbar1.setCodemoile(t);
        karbar1.khata(t);
        System.out.print("edame shomare:");
        int y = scanner.nextInt();
        karbar1.setMobilenumber(y);

        Karbar karbar2 = new Karbar();
        System.out.print("3rghm aval shomare:");
        int l = scanner.nextInt();
        karbar2.setCodemoile(l);
        karbar2.khata(l);
        System.out.println("edame shomare:");
        int z = scanner.nextInt();
        karbar2.setMobilenumber(z);


        System.out.println();
        System.out.println("1."+karbar1.getCodemoile()+karbar1.getMobilenumber());
        System.out.println("2." + karbar2.getCodemoile() + karbar2.getMobilenumber());
        System.out.print("enter witchone:");
        int f = scanner.nextInt();

        switch (f) {
            case 1: if (t == 912) {
                ((Daemi) simcart1).etelaat();
                System.out.println();
                System.out.print("1.ghabz");
                System.out.println();
                System.out.print("2.sharj");
                int r;
                int p=scanner.nextInt();
                if(p==1)
                simcart1.ghabz();
                if (p==2)
                simcart1.kharidsharj();
            } else {
                ((etebari) simcart2).etelaat();
                System.out.println();
                System.out.println("1.ghabz");
                System.out.println("2.sharj");
                int r=scanner.nextInt();
                if (r==1)
                simcart1.ghabz();
                if (r==2)
                simcart1.kharidsharj();
            };break;
            case 2:if (l==912){
                ((Daemi) simcart1).etelaat();
                System.out.println();
                System.out.println("1.ghabz ");
                System.out.print("2.sharj");
                System.out.println();
                int w=scanner.nextInt();
                if(w==1)
                    simcart2.ghabz();
                if (w==2)
                    simcart2.kharidsharj();

            }
            else {
                ((etebari) simcart2).etelaat();
                System.out.println("\n"+"1.ghabz ");
                System.out.print("2.sharj");
                int w=scanner.nextInt();
                if(w==1)
                    simcart2.ghabz();
                if (w==2)
                    simcart2.kharidsharj();
            }

        }
    }

}
