public class PersonInfo {
    String name;
    String gender;
    String address;
    String school;
    String company;
    String phone_number;
    boolean phone_number_is_cellphone;  //휴대폰과 집전화번호 구분하는 변수
    boolean isStudent;

    PersonInfo(String aName, String aGender, String aAddress, String aSchoolOrCompany, boolean isStudent, String aPhone_number, boolean isCellPhone){
        name = aName;
        gender = aGender;
        address = aAddress;

        //학생과 직장인을 구분하기 위한 if구문.
        if(isStudent){
            school = aSchoolOrCompany;
            company = "";
        } else {
            school = "";
            company = aSchoolOrCompany;
        }

        phone_number = aPhone_number;
        phone_number_is_cellphone = isCellPhone;
    }


}
