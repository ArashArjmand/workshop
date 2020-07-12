package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);

        Mahsol<String,Integer,String,String,String> mahsol=new Mahsol<>("yakhchal",
                10,"dogholo","250kg","5mil");
        int a=200;
        int c=10;
        int n=2;
        Mahsol<String,Integer,String,String,String> mahsol2=new Mahsol<>("TV",11,"LED",
                "50kg","1.2mil");
        int b=125;
        int w=13;
        int r=5;
        Mahsol<String,Integer,String,String,String> mahsol3=new Mahsol<>("mashin lebas shoii",12,
                "samsung","300kg","3mil");
        int s=150;
        int g=17;
        int h=7;
        System.out.println("code 10 is yakhchal:");
        System.out.println("code 11 is TV:");
        System.out.println("code 12 is mashin lebas shoii");
        int i=scanner.nextInt();

        Map<Integer, String> map = new HashMap<>();
        switch (i) {
            case 10:map.put(10,mahsol.imformaion());
            mahsol.finalprice(a);
            mahsol.tedadmahsol(c,n);break;
            case 11:map.put(11,mahsol2.imformaion());
            mahsol2.finalprice(b);
            mahsol2.tedadmahsol(w,r);break;
            case 12:map.put(12,mahsol3.imformaion());
            mahsol3.finalprice(s);
            mahsol3.tedadmahsol(g,h);break;
        }

    }
}
