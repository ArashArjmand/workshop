package com.company.View;

import com.company.Controller.PoshakViewController;
import com.company.Model.Entity.PoshakEnti;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PoshakView {
   public JFrame frame;
    private JTextField txt1,txt2,txt3,txt4;
    private JLabel label;
    private JButton button;

    public PoshakView(){
        JFrame frame;
        JTextField txt1,txt2,txt3,txt4;
        JLabel label;
        JButton button;

        frame=new JFrame("poshak");
        frame.setSize(500,500);

     label=new JLabel("sabt etelaat");
        label.setBounds(10,10,80,50);

        txt1=new JTextField();
        txt1.setBounds(95,10,70,50);
        String name=txt1.getText();

        txt2=new JTextField();
        txt2.setBounds(170,10,70,50);
        String color=txt2.getText();

        txt3=new JTextField();
        txt3.setBounds(245,10,70,50);
        String id=txt3.getText();

        txt4=new JTextField();
        txt4.setBounds(320,10,70,50);
        String gheimat=txt4.getText();

        button=new JButton("sabt");
        button.setBounds(175,70,100,50);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PoshakViewController poshakViewController=new PoshakViewController();
                poshakViewController.Name=txt1.getText();
                poshakViewController.Color=txt2.getText();
                poshakViewController.Id=txt3.getText();
                poshakViewController.Gheimat=txt4.getText();
                poshakViewController.saveData();
            }
        });

        JTextField text1,text2,text3,text4;
        JLabel lbl;
        JButton botton;

        lbl=new JLabel("update etellaat");
        lbl.setBounds(10,150,80,50);

        text1=new JTextField();
        text1.setBounds(95,130,70,50);
        String naame=text1.getText();

        text2=new JTextField();
        text2.setBounds(170,130,70,50);
        String coolor=text2.getText();

        text3=new JTextField();
        text3.setBounds(245,130,70,50);
        String id1=text3.getText();

        text4=new JTextField();
        text4.setBounds(320,130,70,50);
        String gheiimat=text4.getText();

        botton=new JButton("sabt up");
        botton.setBounds(175,190,100,50);

        botton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PoshakViewController poshakViewController=new PoshakViewController();
                poshakViewController.Nameup=text1.getText();
                poshakViewController.Colorup=text2.getText();
                poshakViewController.Colorup=text3.getText();
                poshakViewController.Gheimatup=text4.getText();
                poshakViewController.updateData();
            }
        });

        JLabel lbl1=new JLabel("delete");
        lbl1.setBounds(10,250,100,50);


         JTextField textField=new JTextField();
        textField.setBounds(100,250,50,50);
        String Id=textField.getText();

        JButton button1=new JButton("sabt delete");
        button1.setBounds(200,250,100,50);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PoshakViewController poshakViewController=new PoshakViewController();
                poshakViewController.Id=textField.getText();
                poshakViewController.DeleteData();
            }
        });


        frame.add(lbl1);
        frame.add(textField);
        frame.add(button1);
        frame.add(lbl);
        frame.add(botton);
        frame.add(text1);
        frame.add(text2);
        frame.add(text3);
        frame.add(text4);
       frame.add(label);
        frame.add(button);
        frame.add(txt1);
        frame.add(txt2);
        frame.add(txt3);
        frame.add(txt4);
        frame.setLayout(null);
        frame.setVisible(true);
    }

}
