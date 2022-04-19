package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorView extends JPanel {
    JTextField display;
    JButton zero;
    JButton one;
    JButton two;
    JButton three;
    JButton four;
    JButton five;
    JButton six;
    JButton seven;
    JButton eight;
    JButton nine;
    JButton add;
    JButton subtract;
    JButton multiply;
    JButton equals;
    JButton divide;
    JButton clear;
    JPanel keyPanel;

    CalculatorController controller;

    public static final Font mainFont = new Font(Font.SERIF, Font.BOLD, 24);

    public CalculatorView() { initializeComponents();
    }

    public void initializeComponents(){
        setLayout(new BorderLayout());


        keyPanel= new JPanel();
        keyPanel.setLayout(new GridLayout(4,4));
        zero = new JButton("0");
        zero.setFont(mainFont);
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.updateNum(0);
            }
        });
        one = new JButton("1");
        one.setFont(mainFont);
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.updateNum(1);
            }
        });
        two = new JButton("2");
        two.setFont(mainFont);
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.updateNum(2);
            }
        });
        three = new JButton("3");
        three.setFont(mainFont);
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.updateNum(3);
            }
        });
        four = new JButton("4");
        four.setFont(mainFont);
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.updateNum(4);
            }
        });
        five = new JButton("5");
        five.setFont(mainFont);
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.updateNum(5);
            }
        });
        six = new JButton("6");
        six.setFont(mainFont);
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.updateNum(6);
            }
        });
        seven = new JButton("7");
        seven.setFont(mainFont);
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.updateNum(7);
            }
        });
        eight = new JButton("8");
        eight.setFont(mainFont);
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.updateNum(8);
            }
        });
        nine = new JButton("9");
        nine.setFont(mainFont);
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.updateNum(9);
            }
        });
        add = new JButton("+");
        add.setFont(mainFont);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.add();
            }
        });
        subtract = new JButton("-");
        subtract.setFont(mainFont);
        subtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.subtract();
            }
        });
        multiply = new JButton("*");
        multiply.setFont(mainFont);
        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.multiply();
            }
        });
        equals = new JButton("=");
        equals.setFont(mainFont);
        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.equals();
            }
        });
        divide = new JButton("/");
        divide.setFont(mainFont);
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.divide();
            }
        });
        clear = new JButton("C");
        clear.setFont(mainFont);
        clear.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               controller.clear();
           }
        });
        keyPanel.add(nine);
        keyPanel.add(eight);
        keyPanel.add(seven);
        keyPanel.add(add);
        keyPanel.add(six);
        keyPanel.add(five);
        keyPanel.add(four);
        keyPanel.add(subtract);
        keyPanel.add(three);
        keyPanel.add(two);
        keyPanel.add(one);
        keyPanel.add(multiply);
        keyPanel.add(zero);
        keyPanel.add(clear);
        keyPanel.add(divide);
        keyPanel.add(equals);

        display = new JTextField(10);
        display.setText("0");
        display.setFont(new Font(Font.SERIF, Font.BOLD, 24));



        add(display, BorderLayout.NORTH);
        add(keyPanel, BorderLayout.SOUTH);
    }

    public void setDisplay(String num){
        display.setText(String.valueOf(num));
    }

    public void setController(CalculatorController c){
        this.controller = c;
    }
}
