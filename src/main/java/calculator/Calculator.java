package calculator;

public class Calculator {

    private Calculator() {
    }

    // methods
    public float add(float num1, float num2){
        return num1 + num2;

    }  public float subtract(float num1, float num2){
        return num1 - num2;
    }
    public float divide(float num1, float num2){
        if(num1 == 0 || num2 == 0){
            throw new IllegalArgumentException("Cannot divide with 0");
        }
        return num1 / num2;
    }
    public float multiply(float num1, float num2){
        return num1 * num2;
    }
}
