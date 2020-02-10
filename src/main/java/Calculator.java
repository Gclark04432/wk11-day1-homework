public class Calculator {
    private int num1;
    private int num2;
    private double double1;
    private double double2;

    public Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public Calculator(double num1, double num2){
        this.double1 = num1;
        this.double2 = num2;
    }

    public int add(){
        return num1 + num2;
    }

    public int subtract(){
        return num2 - num1;
    }

    public int multiply(){
        return num1 * num2;
    }

    public double divide(){
        return double2/double1;
    }
}
