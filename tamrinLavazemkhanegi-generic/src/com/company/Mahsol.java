package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mahsol<Name,Code,Jens,Weight,Price> {
    Scanner scanner=new Scanner(System.in);

    private Name name;
    private Code code;
    private Jens jens;
    private Weight weight;
    private Price price;

    public Mahsol(Name name, Code code, Jens jens, Weight weight, Price price) {
        this.name = name;
        this.code = code;
        this.jens = jens;
        this.weight = weight;
        this.price = price;
    }

    public String imformaion(){

        System.out.println(name);
        System.out.println(jens);
        System.out.println(weight);
        System.out.println(price);
        return "aa";
    }



    public void finalprice(int i){
        System.out.println(i+"tomn takhfif darad");
    }
    public void tedadmahsol(int a,int b){
        System.out.print("tedad mojod==");
        System.out.println(a-b);
    }
}
