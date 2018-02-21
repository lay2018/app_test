public class Extendsexam1 {

    public static void main(String[] args){
        BusinessMan man1 = new BusinessMan("Mr. Hong", "Hybrid 3D LED", "Staff Eng.");
        BusinessMan man2 = new BusinessMan("Mr. Lee", "Hybrid 3D LED", "Assist Eng.");

        System.out.println("First man info ..........");
        man1.tellYourName();
        man1.tellYourInfo();
        System.out.println("Second man info ..........");

        System.out.println(man1.getName());
        man1.setName("이몽룡");
        System.out.println(man1.getName());
    }

}
