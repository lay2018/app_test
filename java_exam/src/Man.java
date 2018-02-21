public class Man {
    private String name;

    public Man(String name) {
        this.name = name;
    }

    public void setName(String name){
        this.name = name; // 바꿀값을 private name에 저장.
    }
    public String getName(){
        return name;
    }

    public void tellYourName() {
        System.out.println("My name is " + name);
    }
}

class BusinessMan extends Man{
    private String company;
    private String position;
    public BusinessMan(String name, String company, String position){
        super(name);
        this.company=company;
        this.position=position;
    }

    public void tellYourInfo(){
        System.out.println("My company is" + company);
        System.out.println("My position is" + position);
        tellYourName();
    }
}

