import java.util.Scanner;

public class Main {
    static double a = 0;
    static double b = 0;

    public static void main(String[] args) {
        //todo Вам нужно дополнить методы так, чтобы получился рабочий калькулятор
        a = inputDouble();
        b = inputDouble();

        sum();      //Метод суммирования чисел
        multiply(); //Метод умножения чисел
        diff();     //Метод вычитания чисел
        divide();   //Метод деления чисел
    }

    private static void divide() {
        //todo дописать логику и печать результата
        String answer = (b==0) ? "Деллитель не может быть равен нулю" : String.valueOf(a/b);
        System.out.println(answer);
    }

    private static void diff() {
        //todo дописать логику и печать результата
        System.out.println(a-b);
    }

    private static void multiply() {
        //todo дописать логику и печать результата
        System.out.println(a*b);
    }

    private static void sum() {
        //todo дописать логику и печать результата
        System.out.println(a+b);
    }

    private static double inputDouble() {
        double input = new Scanner(System.in).nextDouble();
        return input;
    }
}
