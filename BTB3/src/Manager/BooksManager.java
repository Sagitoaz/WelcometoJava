package Manager;

import Items.*;

import java.util.ArrayList;
import java.util.Scanner;

public class BooksManager {
    static Scanner scanner = new Scanner(System.in);

    public static void insertBook() {

        System.out.print("Nhap ten sach: ");
        String bookTitle = scanner.nextLine();

        System.out.print("Nhap ten tac gia: ");
        String bookAuthor = scanner.nextLine();

        System.out.print("Nhap the loai sach: ");
        String bookType = scanner.nextLine();

        System.out.print("Nhap ngay xuat ban: ");
        String bookPublicationDate = scanner.nextLine();

        System.out.println("Nhap NXB:");
        String bookPublisher = scanner.nextLine();

        System.out.println("Nhap ngon ngu:");
        String bookLanguage = scanner.nextLine();

        System.out.println("Nhap gia ban:");
        String stringPrice = scanner.nextLine();
        int price = Integer.parseInt(stringPrice);

        Book newBook = new Book(bookTitle, bookAuthor, bookType, bookPublicationDate, price, bookLanguage, bookPublisher);
        SchoolSuppliesManager.addSchoolSupplies(newBook);
    }

    public static void showListOfBook(Book book) {
        SchoolSuppliesManager.printEndRow();
        System.out.println();
        System.out.format("|| %-30s | %-20s | %-20s | %-30s ||\n", book.getName(), book.getPrice(), book.getBrand(), "-Tac gia: " + book.getAuthor());
        System.out.format("|| %-30s | %-20s | %-20s | %-30s ||\n", " ", " ", " ", "-The loai: " + book.getType());
        System.out.format("|| %-30s | %-20s | %-20s | %-30s ||\n", " ", " ", " ", "-Ngay xuat ban: " + book.getPublicationDate());
        System.out.format("|| %-30s | %-20s | %-20s | %-30s ||\n", " ", " ", " ", "-Ngon ngu: " + book.getLanguage());
    }

    public static void editBook(Book book, String updateInformation, ArrayList<SchoolSupplies> itemSearchResult) {
        while (true) {
            System.out.println("Chon cac thao tac sau:");
            System.out.println("Nhap 1: sua ten.");
            System.out.println("Nhap 2: sua gia.");
            System.out.println("NHap 3: sua thuong hieu.");
            System.out.println("Nhap 4: sua tac gia.");
            System.out.println("Nhap 5: sua the loai.");
            System.out.println("Nhap 6: sua ngay xuat ban.");
            System.out.println("Nhap 7: sua ngon ngu.");
            System.out.println("Nhap 8: xoa sach!!!");
            System.out.println("Nhap 0: THOAT!!!");
            int editType = scanner.nextInt();
            if ((editType < 0) || (editType > 8)) {
                System.out.println("Khong hop le!!!");
            }
            else if (editType == 0) {
                break;
            } else {
                switch (editType) {
                    case 1:
                        book.setName(updateInformation);
                        break;
                    case 2:
                        book.setPrice(Integer.parseInt(updateInformation));
                        break;
                    case 3:
                        book.setBrand(updateInformation);
                        break;
                    case 4:
                        book.setAuthor(updateInformation);
                        break;
                    case 5:
                        book.setType(updateInformation);
                        break;
                    case 6:
                        book.setPublicationDate(updateInformation);
                        break;
                    case 7:
                        book.setLanguage(updateInformation);
                        break;
                    case 8:
                        itemSearchResult.remove(book);
                        SchoolSuppliesManager.getSchoolSuppliesArrayList().remove(book);
                        System.out.println();
                        break;
                }
                System.out.println("Thao tac da duoc thuc hien!!!");
                continue;
            }
        }
    }
}