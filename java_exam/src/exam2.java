import java.util.Scanner;

public class exam2 {
    public static void main(String[] args){


        System.out.print("키와 몸무게를 입력하세요.>");

        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();

        if(num2+100-num1>0) {
            System.out.println(num2+100-num1);
            System.out.print("obesity");
        }

        else
            System.out.print(num2+100-num1);



    }

}
