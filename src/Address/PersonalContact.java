package Address;

public class PersonalContact extends Contact{
    public String relationship;

    public PersonalContact(String name, String phoneNumber, String relationship){
        super(name,phoneNumber);
        this.relationship = relationship;
    }
    public String toString() {
        return "이름: " + name + ", 전화번호: " + phoneNumber + ", 관계: " + relationship;
    }
}
