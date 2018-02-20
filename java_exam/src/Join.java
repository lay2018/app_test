import java.util.Scanner;

public class Join {

    public static void main(String[] args) {

        String Password;
//        String getPassword;

        System.out.println("비밀 번호를 입력하세요.>");

        Scanner scan = new Scanner(System.in);
        Password = scan.nextLine();

        pwLength(Password);
//        comparepw(Password);

        System.out.println("비밀 번호를 한번 더 입력하세요.>");
        String re_pw = scan.nextLine();
        comparepw(Password, re_pw);

    }
    public static void pwLength(String pw) {

        if(pw.length()>=8) {
            System.out.println("올바른 입력입니다.");
        }
        else {
            System.out.println("8글자 이상 입력해 주세요.");
        }

    }

    public static void comparepw (String pw, String getpw){
        if(pw.compareTo(getpw)==0){
            System.out.println("입력 내용이 같습니다.");
        }
        else{
            System.out.println("재입력해 주세요.");
        }
    }


}
