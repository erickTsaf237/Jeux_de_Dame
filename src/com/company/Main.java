package com.company;

import javax.swing.*;
import java.awt.*;


public class Main extends JFrame {

    public  static final int Taille = 100;

    JButton[] buttons = new JButton[Taille];



    public  Main(){
        super("Jeux de Dame");
        this.setSize(740, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pan = new JPanel();
        pan.setLayout(new GridLayout(10, 10));


        ajouteTableauButton(pan, buttons);
        this.setContentPane(pan);


        this.setVisible(true);
    }

    public static void ajouteTableauButton(JPanel pan, JButton[] buttons ){

        for (int i = 0; i < buttons.length; i++){
            buttons[i] = new JButton();
            placeCouleur(buttons[i], i);
            pan.add(buttons[i]);
        }

    }

    public static void placeCouleur(JButton button, int i){
        int colone = i / 10;
        int ligne = i % 10;
        if (colone % 2 == 1)
            if (ligne % 2 == 1)
                button.setBackground(Color.BLACK);
            else
                button.setBackground(Color.WHITE);
        else
        if (ligne % 2 == 0)
            button.setBackground(Color.BLACK);
        else
            button.setBackground(Color.WHITE);
    }



    public static void main(String[] args) {

    new Main();
	// write your code here
    }
}
