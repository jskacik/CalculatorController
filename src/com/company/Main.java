package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel(0, "none");
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(model,view);
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(view);
        frame.pack();
        frame.setVisible(true);
    }
}
