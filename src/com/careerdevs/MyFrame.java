package com.careerdevs;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {

    JButton button;

    MyFrame(){
        Border border = BorderFactory.createLineBorder ( Color.LIGHT_GRAY,3 );

        button = new JButton ();
        button.setBounds ( 100,100,250,100 );
        button.setText ( "Press Me I'm A Button" );
        button.setFocusable ( false );
        button.setBorder (border);
        button.setBackground ( Color.black );
        button.addActionListener ( e -> System.out.println ("Button Pressed") );
        button.validate ();

        this.setTitle ( "Testing GUI" );
        this.setSize ( 600,600 );
        this.setVisible ( true );
        this.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        this.getContentPane ().setBackground (new Color ( 100,221,106 ) );
        this.setLayout ( null );
        this.add (button);
        //this.validate ();
    }


}
