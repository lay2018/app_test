import java.util.Scanner;

public class Trycatch{

    public static void main(String[] args) {
        divide();
    }

        public static double divide() {
            double result = -1;

            try {
                int num1 = 10;
                int num2 = 10;

//                double result = num1 / num2; //해결필요.
                System.out.println("결과 : " + result);
            } catch (Exception e) {
                System.out.println("안내 : 에러가 발생하였습니다.");
                System.out.println(e.getMessage());
                e.printStackTrace();

            } finally {
                System.out.println("finally 부분이 실행되었습니다.");
            }
            System.out.println("프로그램이 정상적으로 수행되었습니다.");
            return result;
        }

        /*try{
            int [] arr = new int[100];
            System.out.println("피제수 입력 : ");
            Scanner kb = new Scanner(System.in);
            int num1 = kb.nextInt();
            System.out.println("제수 입력 : ");
            int num2 = kb.nextInt();
            System.out.println("연산 결과를 저장할 배열의 인덱스 입력 : ");
            int idx = kb.nextInt();
            arr[idx] = num1/num2;
            System.out.println("나눗셈 결과는 "+arr[idx]);
            System.out.println("저장된 위치의 인덱스는 " + idx);
        } catch(ArithmeticException e) {
            System.out.println("제수는 0이 될 수 없습니다.");
//            i-=1;
            continue;
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("유효하지 않은 인덱스 값입니다.");
//            i-=1;
            continue;
        }*/

//        System.out.println("프로그램이 정상적으로 수행되었습니다.");
    }


