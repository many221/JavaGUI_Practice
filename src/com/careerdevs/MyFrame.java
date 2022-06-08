package com.careerdevs;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {


    MyFrame(){

        this.setTitle ( "Testing GUI" );

        this.setSize ( 420,420 );

        this.setVisible ( true );

        this.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );

        this.setResizable ( false );

        this.getContentPane ().setBackground (new Color ( 100,221,106 ) );

    }
}
