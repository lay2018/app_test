import java.util.Scanner;

public class exam3 {

    public static void main(String[] args){

        int num1;

        Scanner sc = new Scanner(System.in);

        System.out.println("반지름을 입력하세요.");
        num1 = sc.nextInt();

        System.out.println("원의 넓이는 ?");
        System.out.println(area(num1));
    }

    public static double area(int radian) {
        double temp;
        double result;

        temp=multi(radian, radian);
        result=multi(temp, 3.14);

        return result;
    }

    public static double multi(double num1, double num2) {
        double result;
        result = num1 * num2;

        return result;
    }



//    public static void main(String[] args){
//        double radius;
//
//        System.out.print("반지름의 값을 입력하세요.>");
//        Scanner sc = new Scanner(System.in);
//        radius=sc.nextDouble();
//
//        System.out.println("반지름: "+radius);
//        System.out.println("원의 넓이: "+circle(radius));
//    }
//
//
//    public static double circle(double radius){
//        double result;
//        result = radius * radius * 3.14f;
//        return result;
//    }
}
