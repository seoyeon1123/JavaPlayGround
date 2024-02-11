package Address;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    static List<Contact> contacts;
    public AddressBook() {
        contacts = new ArrayList<>();
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. 비즈니스 연락처 추가");
            System.out.println("2. 개인 연락처 추가");
            System.out.println("3. 연락처 출력");
            System.out.println("4. 연락처 검색");
            System.out.println("5. 종료");
            System.out.print("메뉴를 선택해주세요: ");
            int number = scanner.nextInt();

            switch (number) {
                case 1:
                    contacts.add(businessContactPlus());

                    break;
                case 2:
                    contacts.add(personalContactPlus());
                    break;
                case 3:
                    print();
                    break;
                case 4:
                    search();
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("유효하지 않은 메뉴 번호입니다. 다시 입력해주세요.");
            }
        }

    }

    private static BusinessContact businessContactPlus(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요");
        String name = scanner.nextLine();
        System.out.print("전화번호를 입력하세요");
        String phoneNumber = scanner.nextLine();
        System.out.print("회사명을 입력하세요");
        String company = scanner.nextLine();
        return new BusinessContact(name,phoneNumber,company);
    }

    private static PersonalContact personalContactPlus(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요");
        String name = scanner.nextLine();
        System.out.print("전화번호를 입력하세요");
        String phoneNumber = scanner.nextLine();
        System.out.print("관계를 입력하세요");
        String company = scanner.nextLine();
        return new PersonalContact(name,phoneNumber,company);
    }

    private static void print(){
        if(contacts.isEmpty()) {
            System.out.println("연락처가 비어있습니다");
        } else {
            System.out.println("연락처 목록: ");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }

    }
    private static void search(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("검색할 이름을 입력하세요");
        String searchName = scanner.nextLine();
        for (Contact contact : contacts) {
            if(contact.getName().equalsIgnoreCase(searchName)){
                System.out.println(contact);
                break;
            } else {
                System.out.println("연락처를 찾을 수 없습니다.");
            }
        }

    }
}
