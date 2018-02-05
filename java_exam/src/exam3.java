import java.util.Scanner;

public class exam3 {


    public static void main(String[] args){
        int num;

        System.out.print("숫자를 입력하세요.>");

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

//        System.out.print(add(num)+" ");
        add(num);

//        int temp = 0;
//        int sum = 0;
//        while(temp < 10) {
//            sum = add3(num, sum);
//            System.out.print(sum+" ");
//            temp++;
        }

    }

    public static void add(int num) {
        int temp = 0;
        int result = 0;

        while (temp < 10) {
            temp++;
            result = num * temp;
            System.out.print(result + " ");

        }
//        return result;
    }

    public static int add2(int num) {
        int result = 0;

        for (int i=0; i<10; i++) {
            result = num * i;
            System.out.print(result + " ");
        }


        return result;
    }

    public static int add3(int num, int sum){
        int result = 0;

        result = num + sum;

        return result;

    }

}