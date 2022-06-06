package com.company;

public class Main {

    public static void main(String[] args) {
    Formula formula = new Formula(8, 11, 3);
    Converter a = x -> new Formula2(formula.num1, formula.num2, formula.num3);
    Formula2 second = (Formula2) a.conv(formula);
    second.displayFormula();
    }
}
class Formula{
    int num1;
    int num2;
    int num3;
    Formula(int num1, int num2, int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    public void displayFormula(){
        double vector = num1 * Math.pow(num2, num3);
        System.out.println(vector);
    }
}
class Formula2{
    int num4;
    int num5;
    int num6;
    Formula2(int num4, int num5, int num6){
        this.num4 = num4;
        this.num5 = num5;
        this.num6 =  num6;
   }
   public void displayFormula(){
        double vector = num4 * Math.pow(num5, num6);
        System.out.println(vector);
   }
}
@FunctionalInterface
interface Converter <Formula, Formula2>{
    Formula2 conv(Formula b);
}