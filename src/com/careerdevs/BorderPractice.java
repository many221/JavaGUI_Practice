package com.careerdevs;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BorderPractice {

    public static void borderLayout(){

        JFrame frame =  new JFrame ();
        frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        frame.setSize ( 500,500 );
        frame.setLayout ( new BorderLayout (10,10) );
        frame.setVisible ( true );


        JPanel jPanel1 = new JPanel ();
        JPanel jPanel2 = new JPanel ();
        JPanel jPanel3 = new JPanel ();
        JPanel jPanel4 = new JPanel ();
        JPanel jPanel5 = new JPanel ();

        jPanel1.setBackground ( Color.red );
        jPanel2.setBackground ( Color.green );
        jPanel3.setBackground ( Color.yellow );
        jPanel4.setBackground ( Color.magenta );
        jPanel5.setBackground ( Color.cyan);

        jPanel1.setPreferredSize ( new Dimension (100,100) );
        jPanel2.setPreferredSize ( new Dimension (100,100) );
        jPanel3.setPreferredSize ( new Dimension (100,100) );
        jPanel4.setPreferredSize ( new Dimension (100,100) );
        jPanel5.setPreferredSize ( new Dimension (100,100) );

        //-------------Sub Panels
        JPanel jPanel6 = new JPanel ();
        JPanel jPanel7 = new JPanel ();
        JPanel jPanel8 = new JPanel ();
        JPanel jPanel9 = new JPanel ();
        JPanel jPanel10 = new JPanel ();

        jPanel6.setBackground ( Color.black );
        jPanel7.setBackground ( Color.DARK_GRAY );
        jPanel8.setBackground ( Color.gray );
        jPanel9.setBackground ( Color.LIGHT_GRAY );
        jPanel10.setBackground ( Color.white);

        jPanel5.setLayout ( new BorderLayout ());

        jPanel6.setPreferredSize ( new Dimension (50,50) );
        jPanel7.setPreferredSize ( new Dimension (50,50) );
        jPanel8.setPreferredSize ( new Dimension (50,50) );
        jPanel9.setPreferredSize ( new Dimension (50,50) );
        jPanel10.setPreferredSize ( new Dimension (50,50) );

        jPanel5.add ( jPanel6,BorderLayout.NORTH );
        jPanel5.add ( jPanel7,BorderLayout.WEST );
        jPanel5.add ( jPanel8,BorderLayout.EAST );
        jPanel5.add ( jPanel9,BorderLayout.SOUTH );
        jPanel5.add ( jPanel10,BorderLayout.CENTER );


        //------------------------------------------------


        frame.add ( jPanel1,BorderLayout.NORTH );
        frame.add ( jPanel2,BorderLayout.WEST);
        frame.add ( jPanel3,BorderLayout.EAST );
        frame.add ( jPanel4,BorderLayout.SOUTH);
        frame.add ( jPanel5,BorderLayout.CENTER);

        frame.validate ();
    }

    public static void flowLayout(){

        JFrame frame =  new JFrame ();
        frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        frame.setSize ( 500,500 );
        frame.setLayout ( new FlowLayout (FlowLayout.CENTER,10,10) );


        JPanel panel = new JPanel ();
        panel.setPreferredSize ( new Dimension (250,250) );
        panel.setBackground ( Color.lightGray );
        panel.setLayout ( new FlowLayout () );

        panel.add ( new JButton ("1") );
        panel.add ( new JButton ("2") );
        panel.add ( new JButton ("3") );
        panel.add ( new JButton ("4") );
        panel.add ( new JButton ("5") );
        panel.add ( new JButton ("6") );
        panel.add ( new JButton ("7") );
        panel.add ( new JButton ("8") );
        panel.add ( new JButton ("9") );

        frame.add ( panel );

        frame.setVisible ( true );
    }


    public static void main(String[] args) {

       // borderLayout ();

        flowLayout ();
    }
}
