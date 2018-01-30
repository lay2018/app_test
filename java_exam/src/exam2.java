import java.util.Scanner;

public class exam2 {
    public static void main(String[] args) {

        double num1;
        double num2;
        int operator;
//        double res;

        while(true) {

            System.out.print("첫 번째 숫자를 입력하세요.>");

            Scanner scanner = new Scanner(System.in);
            num1 = scanner.nextDouble();

            System.out.println("==============");
            System.out.println("[1] 더하기");
            System.out.println("[2] 빼기");
            System.out.println("[3] 곱하기");
            System.out.println("[4] 나누기");
            System.out.println("[5] 나머지");
            System.out.println("==============");
            System.out.print("연산자를 선택하세요.>");

            operator = scanner.nextInt();

            System.out.print("두 번째 숫자를 입력하세요.>");
            num2 = scanner.nextDouble();


            switch (operator) {
                case 1:
                    System.out.println("덧셈:"+num1+"+"+num2+"="+adder(num1,num2));

//                res=adder(num1,num2);
//                System.out.println(res+2);
                    break;
                case 2:
                    System.out.println("뺄셈:"+num1+"-"+num2+"="+minus(num1,num2));
                    if(minus(num1,num2)<0){
                        System.out.println("결과값이 "+minus(num1,num2)+" 입니다.");
                        System.out.println("양수로 변환한 값은"+(-minus(num1,num2))+"입니다.");
                    }
                    break;
                case 3:
                    System.out.println("곱셈:"+num1+"*"+num2+"="+multi(num1,num2));
                    break;
                case 4:
                    if(num2==0){
                        System.out.println("나눗셈을 할 수 없습니다.");
                    }
                    else {
                        System.out.println("나눗셈:" + num1 + "/" + num2 + "=" + divide(num1, num2));
                    }
                    break;
                case 5:
                    System.out.println("나머지:"+num1+"%"+num2+"="+reminder(num1,num2));
                    break;
//                case 6:
//                    System.out.println("num1의 절대값:"+absolute(num1));
//                    System.out.println("num2의 절대값:"+absolute(num2));
//                    break;
                default:
                    System.out.println("잘못 선택하셨습니다. 다시 실행하세요.");
            }

            System.out.println("계산 종료");
//

        }









//        System.out.println(adder(num1,num2));
//        System.out.println(multi(num1,num2));
//        System.out.println(minus(num1,num2));
//        System.out.println(divide(num1,num2));
//        System.out.println(reminder(num1,num2));



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

//    public static double absolute(double num1, double num2){
//        double result;
//        if (num1<=0){
//
//            return result;
////    }
//
//            num1 *= -1;
//        }
//
    }


