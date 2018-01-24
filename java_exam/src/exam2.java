import java.util.Scanner;

public class exam2 {
    public static void main(String[] args){

//        System.out.print("자연수를 입력하시오.>");
//        Scanner scanner = new Scanner(System.in);
//                int num =scanner.nextInt();
//
//            for(int i=1;i<=10; i++) {
//
//                System.out.print(num*i+" ");
//        System.out.print("자연수 두 개를 입력하시오.>");
//
//        int num1;
//        int num2;
//        Scanner scanner = new Scanner(System.in);
//                 num1 = scanner.nextInt();
//                 num2 = scanner.nextInt();
//
        System.out.print("숫자를 입력하세요.>");

        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();

        if(num<0) {
            System.out.println(num);
            System.out.print("minus");
        }

        else
            System.out.print(num);



    }

}
