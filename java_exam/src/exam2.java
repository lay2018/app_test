import java.util.Scanner;

public class exam2 {
    public static void main(String[] args){


    int num =1;
    //6과 14의 최소공배수를 구하는 방법.
    while(true){
        if (num%6==0 && num%14==0) {
            break;
        }
        num++;
    }

    System.out.print(num);

    }

}
