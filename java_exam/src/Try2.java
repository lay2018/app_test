import java.util.Scanner;

public class Try2 {
    public static void main(String[] args){

        try{
            System.out.print("나이를 입력하세요.>");

            int age = readAge();
            System.out.println("당신의 나이는 " + age + "살 입니다.");
        } catch(AgeInputException e){
            e.printStackTrace();
            System.out.println("에러 발생하였습니다.");
        }
    }

    public static int readAge() throws AgeInputException{
        Scanner kb  = new Scanner(System.in);
        int age = kb.nextInt();
        if(age <= 0) {
            AgeInputException ageInputException = new AgeInputException(); //나이가 음수일때 조건으로 객체 생성.
            throw ageInputException;
        }
        return age;
    }
}
