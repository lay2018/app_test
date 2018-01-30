import java.util.Scanner;

public class exam2 {
    public static void main(String[] args) {

        double num1;
        double num2;
        System.out.print("계산이 필요한 숫자를 2개 입력하시오.>");

        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();


        System.out.println(adder(num1,num2));
        System.out.println(multi(num1,num2));
        System.out.println(minus(num1,num2));
        System.out.println(divide(num1,num2));
        System.out.println(reminder(num1,num2));

        System.out.println("계산 종료");

    }


    public static double adder(double num1, double num2) {
        double result;
        result = num1 + num2;
        return result;
    }

    public static double multi(double num1, double num2){
        double result;
        result = num1 * num2;
        return result;
    }

    public static double minus(double num1, double num2){
        double result;
        result = num1 - num2;
        return result;
    }

    public static double divide(double num1, double num2){
        double result;
        result = num1 / num2;
        return result;
    }

    public static double reminder(double num1, double num2){
        double result;
        result = num1 % num2;
        return result;
    }

    }


