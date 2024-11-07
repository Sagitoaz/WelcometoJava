package Manager;

import Items.*;

import java.util.ArrayList;
import java.util.Scanner;

public class BallpointPenManager {
    static Scanner scanner = new Scanner(System.in);

    public static void insertBallpointPen() {

        System.out.print("Nhap ten but bi: ");
        String ballpointPenName = scanner.nextLine();

        System.out.print("Nhap ten thuong hieu: ");
        String ballpointPenBrand = scanner.nextLine();

        System.out.print("Nhap mau sac: ");
        String ballpointPenColor = scanner.nextLine();

        System.out.print("Nhap chat lieu: ");
        String ballpointPenMaterial = scanner.nextLine();

        System.out.println("Nhap loai muc:");
        String ballpointPenInkType = scanner.nextLine();

        System.out.println("Nhap do min:");
        String ballpointPenSmoothness = scanner.nextLine();

        System.out.println("Nhap gia ban:");
        String stringPrice = scanner.nextLine();
        int ballpointPenPrice = Integer.parseInt(stringPrice);

        BallpointPen newBallpointPen = new BallpointPen(ballpointPenName, ballpointPenPrice, ballpointPenBrand, ballpointPenColor, ballpointPenMaterial, ballpointPenInkType, ballpointPenSmoothness);
        SchoolSuppliesManager.addSchoolSupplies(newBallpointPen);
    }

    public static void showBallpointPen(BallpointPen ballpointPen) {
        SchoolSuppliesManager.printEndRow();
        System.out.println();
        System.out.format("|| %-30s | %-20s | %-20s | %-30s ||\n", ballpointPen.getName(), ballpointPen.getPrice(), ballpointPen.getBrand(), "-Mau sac: " + ballpointPen.getColor());
        System.out.format("|| %-30s | %-20s | %-20s | %-30s ||\n", " ", " ", " ", "-Chat lieu: " + ballpointPen.getMaterial());
        System.out.format("|| %-30s | %-20s | %-20s | %-30s ||\n", " ", " ", " ", "-Loai muc: " + ballpointPen.getInkType());
        System.out.format("|| %-30s | %-20s | %-20s | %-30s ||\n", " ", " ", " ", "-Do min: " + ballpointPen.getSmoothness());
    }

    public static void editBallpointPen(BallpointPen ballpointPen, String updateInformation, ArrayList<SchoolSupplies> itemSearchResult) {
        while (true) {
            System.out.println("Chon cac thao tac sau:");
            System.out.println("Nhap 1: sua ten.");
            System.out.println("Nhap 2: sua gia.");
            System.out.println("NHap 3: sua thuong hieu.");
            System.out.println("Nhap 4: sua mau sac.");
            System.out.println("Nhap 5: sua nguyen lieu.");
            System.out.println("Nhap 6: sua loai muc.");
            System.out.println("Nhap 7: sua do min.");
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
                        ballpointPen.setName(updateInformation);
                        break;
                    case 2:
                        ballpointPen.setPrice(Integer.parseInt(updateInformation));
                        break;
                    case 3:
                        ballpointPen.setBrand(updateInformation);
                        break;
                    case 4:
                        ballpointPen.setColor(updateInformation);
                        break;
                    case 5:
                        ballpointPen.setMaterial(updateInformation);
                        break;
                    case 6:
                        ballpointPen.setInkType(updateInformation);
                        break;
                    case 7:
                        ballpointPen.setSmoothness(updateInformation);
                        break;
                    case 8:
                        itemSearchResult.remove(ballpointPen);
                        SchoolSuppliesManager.getSchoolSuppliesArrayList().remove(ballpointPen);
                        System.out.println();
                        break;
                }
                System.out.println("Thao tac da duoc thuc hien!!!");
                continue;
            }
        }
    }
}
