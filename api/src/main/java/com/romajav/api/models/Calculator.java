package com.romajav.api.models;

public class Calculator {
    public Integer numberOne;
    public Integer numberTwo;
    public String operation;

    public Integer calc(){

        switch(this.operation){
            
            case "+":
                return this.sum();
            
            case "-":
                return this.subtraction();
            
            case "*":
                return this.multiplication();
            
            case "/":
                return this.division();



        }
        return 0;
    }

    private Integer sum(){
        return this.numberOne + this.numberTwo;
    }

    private Integer subtraction(){
        return this.numberOne - this.numberTwo;
    }

    private Integer multiplication(){
        return this.numberOne * this.numberTwo;
    }

    private Integer division(){
        return this.numberOne / this.numberTwo;
    }
}
