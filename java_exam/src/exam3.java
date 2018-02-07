import java.util.Scanner;

public class exam3 {

    public static void main(String[] args){

        Car myCar = new Car();

//        String myCarColor = myCar.color;
        System.out.println(myCar.name+" "+myCar.color);
        System.out.println("시작위치: "+myCar.x_pos);
        myCar.goForward(10);
        System.out.println("현재위치: "+myCar.x_pos);
        System.out.println("현재 소유중인 차가"+myCar.name+"군요. 바꿔보죠. 동의하세요?(Yes or No)");

        Scanner scan = new Scanner(System.in);
        String ans = scan.nextLine();

        if(ans=="Yes") {
            System.out.println("욕심을 부리셨군요. 바꿔드리죠.");
//            myCar.getCarName("spark");
            System.out.println("현재 소유중인 차를"+myCar.name+"로 바꿔드렸습니다.");

        }

        System.out.println("현재 소유중인 차를 그대로 유지합니다.");


    }
}






//    class FruitBuyer
//    {
//        int myMoney=5000;
//        int numofApple=0;
//
//        public void buyApple(FruitSeller seller, int money)
//    }

