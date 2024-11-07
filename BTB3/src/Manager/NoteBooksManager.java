package Manager;

import Items.*;

import java.util.ArrayList;
import java.util.Scanner;

public class NoteBooksManager {
    static Scanner scanner = new Scanner(System.in);

    public static void insertNoteBook() {

        System.out.print("Nhap ten vo:: ");
        String noteBookName = scanner.nextLine();

        System.out.print("Nhap ten thuong hieu: ");
        String noteBookBrand = scanner.nextLine();

        System.out.print("Nhap so trang: ");
        String noteBookNumberOfPage = scanner.nextLine();

        System.out.print("Nhap loai vo: ");
        String noteBookType = scanner.nextLine();

        System.out.println("Nhap mau sac:");
        String noteBookColor = scanner.nextLine();

        System.out.println("Nhap chat lieu:");
        String noteBookMaterial = scanner.nextLine();

        System.out.println("Nhap kich thuoc:");
        String noteBookSize = scanner.nextLine();

        System.out.println("Nhap gia ban:");
        String stringPrice = scanner.nextLine();
        int noteBookPrice = Integer.parseInt(stringPrice);

        NoteBook newNoteBook = new NoteBook(noteBookName, noteBookPrice, noteBookBrand, noteBookNumberOfPage, noteBookType, noteBookColor, noteBookMaterial, noteBookSize);
        SchoolSuppliesManager.addSchoolSupplies(newNoteBook);
    }

    public static void showListOfNoteBook(NoteBook noteBook) {
        SchoolSuppliesManager.printEndRow();
        System.out.println();
        System.out.format("|| %-30s | %-20s | %-20s | %-30s ||\n", noteBook.getName(), noteBook.getPrice(), noteBook.getBrand(), "-So trang: " + noteBook.getNumberOfPage());
        System.out.format("|| %-30s | %-20s | %-20s | %-30s ||\n", " ", " ", " ", "-Loai vo: " + noteBook.getType());
        System.out.format("|| %-30s | %-20s | %-20s | %-30s ||\n", " ", " ", " ", "-Mau sac: " + noteBook.getColor());
        System.out.format("|| %-30s | %-20s | %-20s | %-30s ||\n", " ", " ", " ", "-Chat lieu: " + noteBook.getMaterial());
        System.out.format("|| %-30s | %-20s | %-20s | %-30s ||\n", " ", " ", " ", "-Kich thuoc: " + noteBook.getSize());
    }

    public static void editNoteBook(NoteBook noteBook, String updateInformation, ArrayList<SchoolSupplies> itemSearchResult) {
        while (true) {
            System.out.println("Chon cac thao tac sau:");
            System.out.println("Nhap 1: sua ten.");
            System.out.println("Nhap 2: sua gia.");
            System.out.println("NHap 3: sua thuong hieu.");
            System.out.println("Nhap 4: sua so trang.");
            System.out.println("Nhap 5: sua loai.");
            System.out.println("Nhap 6: sua mau sac.");
            System.out.println("Nhap 7: sua nguyen lieu.");
            System.out.println("Nhap 8: sua kich thuoc.");
            System.out.println("Nhap 9: xoa sach!!!");
            System.out.println("Nhap 0: THOAT!!!");
            int editType = scanner.nextInt();
            if ((editType < 0) || (editType > 9)) {
                System.out.println("Khong hop le!!!");
            }
            else if (editType == 0) {
                break;
            } else {
                switch (editType) {
                    case 1:
                        noteBook.setName(updateInformation);
                        break;
                    case 2:
                        noteBook.setPrice(Integer.parseInt(updateInformation));
                        break;
                    case 3:
                        noteBook.setBrand(updateInformation);
                        break;
                    case 4:
                        noteBook.setNumberOfPage(updateInformation);
                        break;
                    case 5:
                        noteBook.setType(updateInformation);
                        break;
                    case 6:
                        noteBook.setColor(updateInformation);
                        break;
                    case 7:
                        noteBook.setMaterial(updateInformation);
                        break;
                    case 8:
                        noteBook.setSize(updateInformation);
                        break;
                    case 9:
                        itemSearchResult.remove(noteBook);
                        SchoolSuppliesManager.getSchoolSuppliesArrayList().remove(noteBook);
                        System.out.println();
                        break;
                }
                System.out.println("Thao tac da duoc thuc hien!!!");
            }
            continue;
        }
    }
}
