import java.util.Scanner;

class Vender {

    String tea = "";     // 사용자가 선택한 커피

    int user_money = 0;     //사용자가 넣은 돈을 저장
    int money = 50000;      // 자판기가 가지고 있는 값

    // 자판기가 판매하는 커피의 값
    int sugar = 200;
    int cream = 100;
    int cocoa = 200;

    public void runVender() {
        inputMoney(); //돈입력
        selectTea(); //커피 선택
        makeTea(tea); //커피 만들기 변수를 가져다가 사용.
        int return_money = retrunMoney(tea,user_money); //잔돈 계산하기.

        System.out.println("");
        System.out.println("거스름 돈은 "+return_money+"원 입니다."); //리턴머니에 잔돈을 저장한 후에 출력.
    }

    public void inputMoney(){
        Scanner kb = new Scanner(System.in);

        System.out.println("커피가격을 입력하세요.");
        user_money = kb.nextInt();

        System.out.println("커피 값 "+user_money+"원을 입력받았습니다.");
    }



    //출력할 내용이 없으니 void로?
    public void selectTea() {
        Scanner kb = new Scanner(System.in);
        System.out.println("커피를 선택하세요.");
        System.out.println("크림커피, 설탕커피, 코코아");
        tea = kb.nextLine();
        System.out.println(tea);

        while(true)
            if(tea.equals("크림커피")) {

                break;
            }
            else if(tea.equals("설탕커피")) {
                break;
            }
            else if(tea.equals("코코아")) {
                break;
            }
            else {
                System.out.println("잘못된 선택입니다. 다시 입력하세요.");
                tea = kb.nextLine();
            }
    }


// 커피를 만드는 함수
    public void makeTea(String aTea) {
        String message = "";

        switch(aTea) {
            case "크림커피":
                message = "크림 커피가 만들어졌습니다.";
                break;
            case "설탕커피":
                message = "설탕 커피가 만들어졌습니다.";
                break;
            case "코코아":
                message = "코코아가 만들어졌습니다.";
                break;
        }

        System.out.println(message);
    }

    public int retrunMoney(String aTea, int aCharge) {
        int return_money = 0;

        switch(aTea){
            case "크림커피":
                return_money = aCharge - 100;
                break;
            case "설탕커피": case "코코아":
                return_money = aCharge - 200;
                break;
        }
        return return_money;
    }
}
