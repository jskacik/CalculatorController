package com.company;

import static java.sql.Types.NULL;

public class CalculatorModel {
    private int currentValue;
    private int result;
    private String mode;

    public CalculatorModel(int currentValue, String mode) {
        this.currentValue = currentValue;
        this.result = NULL;
        this.mode = mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public void processNumber(int num){
        if(mode.equals("add")){
            add(currentValue, num);
        }
        else if(mode.equals("subtract")){
            subtract(currentValue, num);
        }
        else if(mode.equals("multiply")){
            multiply(currentValue, num);
        }
        else if(mode.equals("divide")){
            divide(currentValue, num);
        }
        currentValue = num;
        setMode("none");
    }

    public void add(int num1, int num2){
        result = num1 + num2;

    }

    public void subtract(int num1, int num2){
        result = num1-num2;

    }

    public void multiply(int num1, int num2){
        result = num1*num2;
    }

    public void divide(int num1, int num2){
        try {
            result = num1 / num2;
        }
        catch (ArithmeticException e){
            System.out.println("Cannot Divide by Zero!!");
        }
    }

    public void equals() {
        if (result != NULL) {
            currentValue = result;
            result = NULL;
        }
    }

    public double getCurrentNum(){
        return this.currentValue;
    }

    @Override
    public String toString() {
        return "" + currentValue;
    }
}
