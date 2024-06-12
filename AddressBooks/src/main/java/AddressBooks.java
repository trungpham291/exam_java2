import java.util.Scanner;

public class AddressBooks {
    public static void main(String[] args) {
        createrMenu();
    }
    public static void createrMenu() {
        Scanner scanner = new Scanner(System.in);
        ContactController contactController = new ContactController();
        while (true){
            System.out.println("1. Thêm liên hệ mới");
            System.out.println("2. Tìm liên hệ theo tên");
            System.out.println("3. Hiện thị liên hệ");
            System.out.println("4. Thoát");
            System.out.println("Chọn chức năng trên (1-4): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    contactController.addContact();
                    break;
                case 2:
                    contactController.findContacts();
                    break;
                case 3:
                    contactController.displayContacts();
                    break;
                case 4:
                    System.out.println("Tạm biệt, hẹn gặp lại.");
                    break;
                default:
                    System.out.println("Vui lòng lựa chọn từ 1 đến 4");
                    break;
            }
        }
    }
}
