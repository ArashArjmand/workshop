package com.company;

import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class FramKharid extends Frametlaat{
    JLabel lbl,label1;
    JTextField txt,txt2;
    JComboBox comboBox;
    JButton button;
    JLabel label;
    public FramKharid() {
        lbl = new JLabel("kharid");
        lbl.setBounds(10, 200, 70, 50);

        String[] book={"bostan","golestan","masnavi","shahname"};
        comboBox=new JComboBox(book);
        comboBox.setBounds(100,210,70,50);

        button=new JButton("kharid");
        button.setBounds(180,210,80,50);


        label1=new JLabel("book kharideshode");
        label1.setBounds(10,300,150,50);

        txt2=new JTextField();
        txt2.setBounds(150,300,150,50);


        frame.add(label1);
        frame.add(button);
        frame.add(lbl);
        frame.add(comboBox);
        frame.add(txt2);


        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String data = "book selected "+comboBox.getItemAt(comboBox.getSelectedIndex());
                txt2.setText(data);
            }
        });

    }
}

