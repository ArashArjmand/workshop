package com.company;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FramBook extends JFrame implements ActionListener {
    JFrame frame;
    JLabel lbl;
    JButton btn;
    JTextField txt,txt2,txt3,txt4;

    public FramBook(){
        frame=new JFrame();
        frame.setTitle("book shop");
        frame.setSize(600,550);
         lbl=new JLabel("namayesh book:");
        lbl.setBounds(10,10,150,50);

         txt=new JTextField("1.bostan");
        txt.setBounds(100,10,70,50);

        txt2=new JTextField("2.golestan");
        txt2.setBounds(200,10,70,50);

        txt3=new JTextField("3.masnavi");
        txt3.setBounds(300,10,70,50);

        txt4=new JTextField("4.shahname");
        txt4.setBounds(400,10,100,50);


        frame.add(lbl);
        frame.add(txt);
        frame.add(txt2);
        frame.add(txt3);
        frame.add(txt4);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
