package JAVACORE_1_Lambda_1_Calc;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.divide.apply(a, b); //деление на 0
        calc.println.accept(c);
    }
}
