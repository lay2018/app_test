import java.util.Scanner;

public class exam2 {
    public static void main(String[] args){


        System.out.print("나이를 입력하세요.>");

        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();


        if(num1>20) {

            System.out.print("adult");
        }

        else
            System.out.print(20-num1+"years later");



    }

}
