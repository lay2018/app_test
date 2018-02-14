public class Carnumber {

    private int carNumber;  //차량 번호
    private String myAddress;  //주소

    //차량 소유자를 위한 생성자
    public Carnumber(int carNum, String myAdd){
        carNumber = carNum;
        myAddress = myAdd;
    }

    //차량 미소유자를 위한 생성자
    public Carnumber(String myAdd){
        myAddress = myAdd;
        carNumber = -1; // 미소유자
    }

    public void showInfo(){
        if ( !(carNumber == -1)) {
            System.out.println("차량번호 : " + carNumber);
        }
        else{
            System.out.println("주소: " + myAddress);
        }
    }

}
