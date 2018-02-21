import java.util.Random;
import java.util.Scanner;

public class Exam {
    public static void main(String[] args){

        int num1;
        System.out.println("가위바위보를 합시다.");
        System.out.println("==================");
        System.out.println("(1) 가위");
        System.out.println("(2) 바위");
        System.out.println("(3) 보");
        System.out.println("==================");
        System.out.print("하나를 선택해주세요.>");


        Scanner scan = new Scanner(System.in);
        num1 = scan.nextInt();

        if (num1 == 1){
            System.out.println("당신은 가위를 냈습니다.");
        } else if(num1 == 2) {
            System.out.println("당신은 바위를 냈습니다.");
        } else if(num1 == 3) {
            System.out.println("당신은 보를 냈습니다.");
        } else {
            System.out.println("아무것도 내지 않았습니다.");
        }

        pcChoice(num1);


        }

        public static void pcChoice(int num1) {

            Random random = new Random();
            int pcrand = random.nextInt(3);
            switch (pcrand) {
                case 0:
                    System.out.println("컴퓨터는 가위를 냈습니다.");
                    break;
                case 1:
                    System.out.println("컴퓨터는 바위를 냈습니다.");
                    break;
                case 2:
                    System.out.println("컴퓨터는 보를 냈습니다.");
                    break;
            }

            if ((num1-pcrand)==1){
                System.out.println("비겼습니다.");
            } else if ((num1-pcrand)==-1 || (num1-pcrand)==2) {
                System.out.println("이겼습니다.");
            } else {
                System.out.println("졌습니다.");
            }


        }}



