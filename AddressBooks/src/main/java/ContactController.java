import java.util.ArrayList;
import java.util.Scanner;

public class ContactController {
    ArrayList<Contact> contacts = new ArrayList<Contact>();
    Scanner sc = new Scanner(System.in);

    public void addContact(){

        System.out.print("Nhập Tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập công ty: ");
        String company = sc.nextLine();
        System.out.print("Nhập email: ");
        String email = sc.nextLine();
        System.out.print("Nhập phone: ");
        int phone = sc.nextInt();

        contacts.add(new Contact(name, company, email, phone));
        System.out.println("Thêm Thành Công! ");
    }

    public void findContacts(){
        System.out.println("Nhập tên cần tìm: ");
        String name = sc.nextLine();
        for (Contact c : contacts) {
            if (c.getName().equals(name)) {
                System.out.println("Số điện thoại của " + name + ":" + c.getPhone());
                return;
            }
        }
        System.out.println("Không tìm thấy!");
    }

    public void displayContacts(){
        System.out.printf("%-15s %-10s %-20s %-15s%n", "Tên", "Công ty", "Email", "Số điện thoại");
        for(int i=0; i<contacts.size(); i++){
            Contact c = contacts.get(i);
            System.out.printf("%-15s %-10s %-20s %-15s%n", c.getName(), c.getCompany(), c.getEmail(), c.getPhone());
        }
    }

}
