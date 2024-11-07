package ComputerSystem;

import Manager.*;

public class Admin {
    public static void addItems() {
        while (true) {
            System.out.println("Chon vat pham can them:");
            System.out.println("1. Sach");
            System.out.println("2. Vo");
            System.out.println("3. But chi");
            System.out.println("4.But bi");
            System.out.println("0. THOAT");
            int operation = SchoolSuppliesManager.scanner.nextInt();
            if (operation < 0 || operation > 4) {
                System.out.println("KHONG HOP LE!!!");
            } else if (operation == 0) {
                break;
            } else {
                switch (operation) {
                    case 1:
                        BooksManager.insertBook();
                        break;
                    case 2:
                        NoteBooksManager.insertNoteBook();
                        break;
                    case 3:
                        PencilManager.insertPencil();
                        break;
                    case 4:
                        BallpointPenManager.insertBallpointPen();
                        break;
                }
            }
        }
    }

    public static void editAndRemoveItem() {
        SchoolSuppliesManager.editAndRemoveItem();
    }

    public static void searchItem() {
        Guess.searchItems();
    }

    public static void showAllItems() {
        Guess.showListOfItem();
    }
}
