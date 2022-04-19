package com.company;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
        view.setController(this);
    }

    public void updateNum(int num){
        model.processNumber(num);
        view.setDisplay(model.toString());
    }

    public void add(){
        model.setMode("add");
        view.setDisplay("+");
    }

    public void subtract(){
        model.setMode("subtract");
        view.setDisplay("-");
    }

    public void multiply(){
        model.setMode("multiply");
        view.setDisplay("*");
    }

    public void divide(){
        model.setMode("divide");
        view.setDisplay("/");
    }

    public void equals(){
        model.setMode("equals");
        model.equals();
        view.setDisplay(model.toString());
    }

    public void clear(){
        model.setMode("clear");
        view.setDisplay("");
    }

}
