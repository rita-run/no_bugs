package homework_9.exceptions.task2;

public class Divider {
    private double number1;
    private double number2;
    private double divisionResult;

    public void setNumbers(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double getDivisionResult() {
        return this.divisionResult;
    }

    public void divideNumbers() {
        if (this.number2 == 0) {
            throw new CantDivideByZeroException("Can't divide by zero!");
        } else this.divisionResult = this.number1/this.number2;
        System.out.println(this.number1 + " / " + this.number2 + " = " + this.divisionResult);
    }
}
