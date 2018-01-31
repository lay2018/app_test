import java.util.Scanner;

public class exam3 {

//    public static void main(String[] args){
//        int num1;
//
//        System.out.print("숫자를 입력하세요.>");
//
//        Scanner sc = new Scanner(System.in);
//        num1 = sc.nextInt();
//
//        if(num1>1000) {
//            System.out.println("1000보다 큰 숫자를 입력하셨습니다.");
//        }
//
//        else {
//            System.out.println("1부터 더한 값은: " + sum(num1) + " 입니다.");
//        }
//        System.out.println("연산 종료");
//    }
//
//    public static int sum(int num1) {
//        int result = 0;
//        for(int i=0; i<=num1 ; i++) {
//            result += i;
//        }
//        return result;
//    }
    public static void main(String[] args){
        int num;

        System.out.print("숫자를 입력하세요.>");

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        System.out.print(add2(num)+" ");

    }

    public static int add(int num) {
        int temp = 0;
        int result = 0;

        while (temp < 10) {
            temp++;
            result = num * temp;
            System.out.print(result + " ");

        }
        return result;
    }

    public static int add2(int num) {
        int result = 0;

        for (int i=0; i<10; i++) {
            result = num * i;
        }


        return result;
    }

}