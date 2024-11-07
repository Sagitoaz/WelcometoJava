package Manager;

import Items.*;

import java.util.ArrayList;
import java.util.Scanner;

public class PencilManager {
    static Scanner scanner = new Scanner(System.in);

    public static void insertPencil() {

        System.out.print("Nhap ten but: ");
        String pencilName = scanner.nextLine();

        System.out.print("Nhap ten thuong hieu: ");
        String pencilBrand = scanner.nextLine();

        System.out.print("Nhap mau sac: ");
        String pencilColor = scanner.nextLine();

        System.out.print("Nhap chat lieu: ");
        String pencilMaterial = scanner.nextLine();

        System.out.println("Nhap do cung:");
        String pencilHardness = scanner.nextLine();

        System.out.println("Nhap gia ban:");
        String stringPrice = scanner.nextLine();
        int pencilPrice = Integer.parseInt(stringPrice);

        Pencil newPencil = new Pencil(pencilName, pencilPrice, pencilBrand, pencilColor, pencilMaterial, pencilHardness);
        SchoolSuppliesManager.addSchoolSupplies(newPencil);
    }

    public static void showListOfPencil(Pencil pencil) {
        SchoolSuppliesManager.printEndRow();
        System.out.println();
        System.out.format("|| %-30s | %-20s | %-20s | %-30s ||\n", pencil.getName(), pencil.getPrice(), pencil.getBrand(), "-Mau sac: " + pencil.getColor());
        System.out.format("|| %-30s | %-20s | %-20s | %-30s ||\n", " ", " ", " ", "-Chat lieu: " + pencil.getMaterial());
        System.out.format("|| %-30s | %-20s | %-20s | %-30s ||\n", " ", " ", " ", "-Do cung: " + pencil.getHardness());
    }

    public static void editPencil(Pencil pencil, String updateInformation, ArrayList<SchoolSupplies> itemSearchResult) {
        while (true) {
            System.out.println("Chon cac thao tac sau:");
            System.out.println("Nhap 1: sua ten.");
            System.out.println("Nhap 2: sua gia.");
            System.out.println("NHap 3: sua thuong hieu.");
            System.out.println("Nhap 4: sua mau sac.");
            System.out.println("Nhap 5: sua nguyen lieu.");
            System.out.println("Nhap 6: sua do cung.");
            System.out.println("Nhap 7: xoa sach!!!");
            System.out.println("Nhap 0: THOAT!!!");
            int editType = scanner.nextInt();
            if ((editType < 0) || (editType > 7)) {
                System.out.println("Khong hop le!!!");
            }
            else if (editType == 0) {
                break;
            } else {
                switch (editType) {
                    case 1:
                        pencil.setName(updateInformation);
                        break;
                    case 2:
                        pencil.setPrice(Integer.parseInt(updateInformation));
                        break;
                    case 3:
                        pencil.setBrand(updateInformation);
                        break;
                    case 4:
                        pencil.setColor(updateInformation);
                        break;
                    case 5:
                        pencil.setMaterial(updateInformation);
                        break;
                    case 6:
                        pencil.setHardness(updateInformation);
                        break;
                    case 7:
                        itemSearchResult.remove(pencil);
                        SchoolSuppliesManager.getSchoolSuppliesArrayList().remove(pencil);
                        System.out.println("But da duoc xoa!!!");
                        System.out.println();
                        break;
                }
                System.out.println("Thao tac da duoc thuc hien!!!");
                continue;
            }
        }
    }
}
