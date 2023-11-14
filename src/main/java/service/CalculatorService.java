package service;

public class CalculatorService {
    private float num1;
    private float num2;
    private char mathSymbol;

    public char getMathSymbol() {
        return mathSymbol;
    }

    public void setMathSymbol(char mathSymbol) {
        this.mathSymbol = mathSymbol;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }
    public double add() {
        return this.num1 + this.num2;
    }

    public double subtract() {
        return this.num1 - this.num2;
    }
    public double multiply() {
        return this.num1 * this.num2;
    }
    public double divide() {
        return this.num1 / this.num2;
    }
}
