package com.company;

import java.io.IOException;

public class Karbar {
    private String name;
    private int codemoile;
    private int mobilenumber;

    public void setName(String name) {

        this.name = name;
    }
    public void khata(int i){
        int b=0,q;
        try {
            int s=i/10;
            if(s>10) {
                q = s / 10;
                if (q>10) {
                    throw new Exception();
                }
            }
        }catch (Exception e){
            System.out.println("namotabar");
        }
    }

    public void setCodemoile(int codemoile)   {
        this.codemoile = codemoile;
    }
    public void setMobilenumber(int mobilenumber)   {
        this.mobilenumber = mobilenumber;

    }

    public String getName() {
        return name;
    }

    public int getCodemoile() {

        return codemoile;
    }

    public int getMobilenumber() {
        return mobilenumber;
    }
}
