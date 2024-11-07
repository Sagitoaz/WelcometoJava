package ComputerSystem;

import java.util.Scanner;

public class AccountManager {
    static Scanner scanner = new Scanner(System.in);

    public static void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static void adminAcess() {
        while (true) {
            System.out.println("Chon cac thao tac sau:");
            System.out.println("1. Them vat pham.");
            System.out.println("2. Sua hoac xoa vat pham.");
            System.out.println("3. Tim kiem vat pham.");
            System.out.println("4. Xem danh sach vat pham.");
            System.out.println("0. Log out");

            int adminEditType = scanner.nextInt();

            if (adminEditType == 0) {
                clearScreen();
                break;
            } else {
                switch (adminEditType) {
                    case 1:
                        Admin.addItems();
                        break;
                    case 2:
                        Admin.editAndRemoveItem();
                        break;
                    case 3:
                        Admin.searchItem();
                        break;
                    case 4:
                        Admin.showAllItems();
                        break;
                    default:
                        System.out.println("Khong hop le!!!");
                        break;
                }
            }
        }
    }

    public static void guessAcess() {
        while (true) {
            System.out.println("Chon cac thao tac sau:");
            System.out.println("1. Tim kiem vat pham.");
            System.out.println("2. Xem danh vat pham.");
            System.out.println("0. Log out");

            int guessEditType = scanner.nextInt();

            if (guessEditType == 0) {
                clearScreen();
                break;
            } else {
                switch (guessEditType) {
                    case 1:
                        Guess.searchItems();
                        break;
                    case 2:
                        Guess.showListOfItem();
                        break;
                    default:
                        System.out.println("Khong hop le!!!");
                        break;
                }
            }
        }
    }

    public static void login() {
        while (true) {
            System.out.println("Nhap LOGOUT de thoat!!!");
            System.out.print("Account: ");
            String account = scanner.next();
            if (account.equals("admin")) {
                System.out.print("Password: ");
                String password = scanner.next();
                if (password.equals("admin")) {
                    adminAcess();
                } else {
                    System.out.println("Tai khoan hoac mat khau khong chinh xac!!!");
                }
            } else if (account.equals("khach")) {
                guessAcess();
            } else if (account.equals("LOGOUT")) {
                break;
            } else {
                System.out.println("Tai khoan hoac mat khau khong chinh xac!!!");
            }
        }
    }
}
