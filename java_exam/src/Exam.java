import java.util.Scanner;

public class Exam {
    public static void main(String[] args){

        String str1 = "cSmart";
        String str2 = "b and ";
        String str3 = "Simple";

        String result = str1.concat(str2).concat(str3);
        System.out.println(result);
        System.out.println("문자열 길이: "+result.length());

        int result2 = str1.compareTo(str2);
        System.out.println(result2);

        if (result2<0) {
            System.out.println("str1이 앞선다.");
        } else {
            System.out.println("str2가 앞선다");
        }

        int[] array = new int[3];

        array[0] = 54;

        System.out.println(array[0]);

        String[] strArray = new String[3];
        strArray[0] = new String("Java");
        strArray[1] = new String("Flex");
        strArray[2] = new String("ruby");

        for(int i=0; i<strArray.length; i++){
            System.out.println(strArray[i]);
        }

    }
}


