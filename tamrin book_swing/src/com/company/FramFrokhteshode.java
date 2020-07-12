package com.company;

import javax.swing.*;

public class FramFrokhteshode extends FramKharid{
    JLabel label;
    JTextField txt1,txt2,txt3,txt4;
    public FramFrokhteshode(){
        label=new JLabel("ketab haye forkhte shode");
        label.setBounds(10,400,150,50);

        txt1=new JTextField("2ta bostan forokhteshode");
        txt1.setBounds(180,400,155,50);

        txt2=new JTextField("3ta golestan forokhteshode");
        txt2.setBounds(380,400,155,50);

        txt3=new JTextField("4ta masnavi forokhteshode");
        txt3.setBounds(180,450,155,50);

        txt4=new JTextField("6ta shahname forokhteshode");
        txt4.setBounds(380,450,165,50);

        frame.add(label);
        frame.add(txt1);
        frame.add(txt2);
        frame.add(txt3);
        frame.add(txt4);

    }
}
