package com.careerdevs;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
//	 write your code here
//
        ImageIcon image = new ImageIcon ("src/com/careerdevs/back.jpg");
        Border border = BorderFactory.createLineBorder ( Color.LIGHT_GRAY,3 );

        JLabel label = new JLabel ();
        label.setText ( "Coding My Is Fun 🙃");
        label.setIcon ( image );
        label.setHorizontalTextPosition ( JLabel.CENTER);
        label.setVerticalTextPosition ( JLabel.TOP );
        label.setForeground ( Color.WHITE );
        label.setFont ( new Font ( "Helvetica",Font.BOLD,20) );
        label.setIconTextGap ( -330 );
        label.setBackground ( Color.BLACK );
        label.setOpaque ( true );
        label.setBorder ( border );
        label.setVerticalAlignment ( JLabel.CENTER );
        label.setHorizontalAlignment ( JLabel.CENTER );
       // label.setBounds ( 0,0,250,250 );
//        label.setVisible ( true );

        JFrame frame = new JFrame ();
        frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        //frame.setSize ( 600,600 );
        //frame.setLayout ( null );
        frame.setVisible ( true );
        frame.add(label);
        frame.pack ();
        frame.revalidate ();



    }
}
