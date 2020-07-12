package com.company;

import javax.swing.*;

public class Frametlaat extends FramBook {
   JTextField txt,txt2,txt3,txt4,txt5,txt6,txt7,txt8;
   JLabel lbl;
    public Frametlaat(){
        lbl=new JLabel("etelaat");
        lbl.setBounds(10,100,70,50);


        txt=new JTextField("1)4adad mojod");
        txt.setBounds(100,100,100,50);
        txt5=new JTextField("shaer sadi");
        txt5.setBounds(100,150,100,50);

        txt2=new JTextField("2).6adad mojod");
        txt2.setBounds(200,100,100,50);
        txt6=new JTextField("shaer sadi");
        txt6.setBounds(200,150,100,50);

        txt3=new JTextField("3)2adad mojod");
        txt3.setBounds(300,100,100,50);
        txt7=new JTextField("shaer molavi");
        txt7.setBounds(300,150,100,50);

        txt4=new JTextField("4)10adad mojod");
        txt4.setBounds(400,100,100,50);
        txt8=new JTextField("nevisande ferdosi");
        txt8.setBounds(400,150,105,50);

        frame.add(lbl);
        frame.add(txt);
        frame.add(txt2);
        frame.add(txt3);
        frame.add(txt4);
        frame.add(txt5);
        frame.add(txt6);
        frame.add(txt7);
        frame.add(txt8);

    }
}
