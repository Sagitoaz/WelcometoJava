package ComputerSystem;

import Items.SchoolSupplies;
import Manager.SchoolSuppliesManager;
import java.util.ArrayList;
import java.util.Scanner;

public class Guess {
    public static void searchItems() {
        System.out.print("Nhap tu khoa tim kiem: ");
        String Keyword = SchoolSuppliesManager.scanner.nextLine();
        String keyword = Keyword.toLowerCase();

        ArrayList<SchoolSupplies> searchResult = SchoolSuppliesManager.searchSchoolSupplies(keyword);
        SchoolSuppliesManager.showSearchSchoolSuppliesResult(searchResult);
    }

    public static void showListOfItem() {
        SchoolSuppliesManager.showSearchSchoolSuppliesResult(SchoolSuppliesManager.getSchoolSuppliesArrayList());
    }
}
