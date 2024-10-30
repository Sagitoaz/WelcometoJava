import java.util.ArrayList;
import java.util.Scanner;

public class Guess {

    public static void searchBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap tu khoa tim kiem: ");
        String Keyword = scanner.nextLine();
        String keyword = Keyword.toLowerCase();

        ArrayList<Book> searchResult = BooksManager.searchBook(keyword);
        BooksManager.ShowSearchResult(searchResult);
    }

    public static void showListOfBook() {
        BooksManager.ShowSearchResult(BooksManager.getBookList());
    }
}
