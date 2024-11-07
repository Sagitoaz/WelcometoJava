package Manager;

import Items.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SchoolSuppliesManager {
    public static final int tableLength = 115;
    public static Scanner scanner = new Scanner(System.in);
    public static void printEndRow() {
        for (int i = 0; i < tableLength; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
    private static ArrayList<SchoolSupplies> schoolSuppliesArrayList = new ArrayList<>();

    public static ArrayList<SchoolSupplies> getSchoolSuppliesArrayList() {
        return schoolSuppliesArrayList;
    }

    public static void addSchoolSupplies(SchoolSupplies schoolSupply) {
        schoolSuppliesArrayList.add(schoolSupply);
    }

    public static ArrayList<SchoolSupplies> searchSchoolSupplies(String keyword) {
        ArrayList<SchoolSupplies> resultOfSearching = new ArrayList<>();
        for (SchoolSupplies schoolSupply : schoolSuppliesArrayList) {
            if (schoolSupply.getName().contains(keyword) || schoolSupply.getBrand().contains(keyword)) {
                resultOfSearching.add(schoolSupply);
            } else {
                if (schoolSupply.getClass() == Book.class) {
                    if (((Book) schoolSupply).getAuthor().contains(keyword)
                            || ((Book) schoolSupply).getType().contains(keyword)
                            || ((Book) schoolSupply).getLanguage().contains(keyword)
                            || ((Book) schoolSupply).getPublicationDate().contains(keyword)) {
                        resultOfSearching.add(schoolSupply);
                    }
                } else if (schoolSupply.getClass() == NoteBook.class) {
                    if (((NoteBook) schoolSupply).getType().toLowerCase().contains(keyword)
                            || ((NoteBook) schoolSupply).getNumberOfPage().toLowerCase().contains(keyword)
                            ||((NoteBook) schoolSupply).getColor().toLowerCase().contains(keyword)
                            || ((NoteBook) schoolSupply).getMaterial().toLowerCase().contains(keyword)
                            || ((NoteBook) schoolSupply).getSize().toLowerCase().contains(keyword)) {
                        resultOfSearching.add(schoolSupply);
                    }
                } else if (schoolSupply.getClass() == Pencil.class) {
                    if (((Pencil) schoolSupply).getColor().toLowerCase().contains(keyword)
                            || ((Pencil) schoolSupply).getMaterial().toLowerCase().contains(keyword)
                            || ((Pencil) schoolSupply).getHardness().toLowerCase().contains(keyword)) {
                        resultOfSearching.add(schoolSupply);
                    }
                } else if (schoolSupply.getClass() == BallpointPen.class) {
                    if (((BallpointPen) schoolSupply).getMaterial().toLowerCase().contains(keyword)
                            || ((BallpointPen) schoolSupply).getColor().toLowerCase().contains(keyword)
                            || ((BallpointPen) schoolSupply).getSmoothness().toLowerCase().contains(keyword)
                            || ((BallpointPen) schoolSupply).getInkType().toLowerCase().contains(keyword)) {
                        resultOfSearching.add(schoolSupply);
                    }
                }
            }
        }
        return resultOfSearching;
    }

    public static void showSearchSchoolSuppliesResult(ArrayList<SchoolSupplies> resultOfSearching) {
        System.out.println("KET QUA TIM KIEM:...");
        for (int i = 0; i < tableLength; i++) {
            System.out.print("=");
        }
        System.out.println();
        if (resultOfSearching.isEmpty()) {
            System.out.println("KHONG TIM THAY!!!");
        } else {
            System.out.println();
            System.out.format("|| %-30s | %-20s | %-20s | %-30s ||", "NAME", "PRICE", "BRAND", "MORE INFORMATIONS");
            System.out.println();
            printEndRow();
            for (SchoolSupplies schoolSupply : resultOfSearching) {
                if (schoolSupply.getClass() == Book.class) {
                    BooksManager.showListOfBook((Book) schoolSupply);
                } else if (schoolSupply.getClass() == NoteBook.class) {
                    NoteBooksManager.showListOfNoteBook((NoteBook) schoolSupply);
                } else if (schoolSupply.getClass() == Pencil.class) {
                    PencilManager.showListOfPencil((Pencil) schoolSupply);
                } else if (schoolSupply.getClass() == BallpointPen.class) {
                    BallpointPenManager.showBallpointPen((BallpointPen) schoolSupply);
                }
            }
        }
        for (int i = 0; i < tableLength; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    public static void editAndRemoveItem() {
        String nextSpace = scanner.nextLine();
        System.out.println("Nhap thong tin tim kiem: ");
        String KeyWord = scanner.nextLine();
        String keyword = KeyWord.toLowerCase();
        ArrayList<SchoolSupplies> itemSearchResult = searchSchoolSupplies(keyword);
        showSearchSchoolSuppliesResult(itemSearchResult);

        while (true) {
            if (!schoolSuppliesArrayList.isEmpty()) {
                System.out.println("Nhap vị tri do dung can chinh sua: ");
                int indexNeedToEdit = scanner.nextInt();
                String getChar = scanner.nextLine();
                if (indexNeedToEdit < 0 || indexNeedToEdit > itemSearchResult.size()) {
                    System.out.println("VI TRI KHONG HOP LE!!!");
                } else if (indexNeedToEdit == 0) {
                    break;
                } else {
                    SchoolSupplies itemsNeedToEdit = itemSearchResult.get(indexNeedToEdit - 1);
                    System.out.println("Nhap thong tin can thay doi: ");
                    String updateInformation = scanner.nextLine();
                    if (itemsNeedToEdit.getClass() == Book.class) {
                        BooksManager.editBook((Book) itemsNeedToEdit, updateInformation, itemSearchResult);
                    } else if (itemsNeedToEdit.getClass() == NoteBook.class) {
                        NoteBooksManager.editNoteBook((NoteBook) itemsNeedToEdit, updateInformation, itemSearchResult);
                    } else if (itemsNeedToEdit.getClass() == Pencil.class) {
                        PencilManager.editPencil((Pencil) itemsNeedToEdit, updateInformation, itemSearchResult);
                    } else if (itemsNeedToEdit.getClass() == BallpointPen.class) {
                        BallpointPenManager.editBallpointPen((BallpointPen) itemsNeedToEdit, updateInformation, itemSearchResult);
                    }
                }
            } else {
                break;
            }
        }
    }
}
