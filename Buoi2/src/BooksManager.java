import java.util.ArrayList;
import java.util.Scanner;

public class BooksManager {
    static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Book> bookList = new ArrayList<>();

    public static ArrayList<Book> getBookList() {
        return bookList;
    }

    public static void insertBook() {

        String bookTitle, bookAuthor, bookType, bookPublicationDate;

        System.out.print("Nhap ten sach: ");
        bookTitle = scanner.nextLine();

        System.out.print("Nhap ten tac gia: ");
        bookAuthor = scanner.nextLine();

        System.out.print("Nhap the loai sach: ");
        bookType = scanner.nextLine();

        System.out.print("Nhap ngay xuat ban: ");
        bookPublicationDate = scanner.nextLine();

        Book newBook = new Book(bookTitle, bookAuthor, bookType, bookPublicationDate);
        bookList.add(newBook);
    }

    public static ArrayList<Book> searchBook(String keyword) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getTitle().toLowerCase().contains(keyword)
                    || book.getAuthor().contains(keyword)
                    || book.getType().contains(keyword)
                    || book.getPublicationDate().contains(keyword)) {
                result.add(book);
            }
        }
        return result;
    }

    public static void ShowSearchResult(ArrayList<Book> searchBookResult) {
        System.out.println("Ket qua tim kiem: ");

        System.out.println();
        for (int i = 0; i <= 115; ++i) System.out.print("=");
        System.out.println();
        System.out.format("|| %-30s | %-30s | %-20s | %-20s ||\n","TITLE", "AUTHOR", "TYPE", "PUBLICATION DATE");
        for (int i = 0; i <= 115; ++i) System.out.print("-");
        System.out.println();

        if (searchBookResult.isEmpty()) System.out.println("Khong tim thay!!!");
        else {
            for (Book book : searchBookResult) {
                for (int i = 0; i <= 115; ++i) System.out.print("-");
                System.out.println();
                System.out.format("|| %-30s | %-30s | %-20s | %-20s ||\n",
                        book.getTitle(), book.getAuthor(), book.getType(), book.getPublicationDate());
            }
            for (int i = 0; i <= 115; ++i) System.out.print("=");
            System.out.println();
        }

    }

    public static void editAndRemoveBook() {

        System.out.print("Nhap tu khoa tim kiem: ");
        String Keyword = scanner.nextLine();
        String keyword = Keyword.toLowerCase();

        ArrayList<Book> searchBookResult = searchBook(keyword);

        ShowSearchResult(searchBookResult);

        while (true) {
            if (!searchBookResult.isEmpty()) {
                System.out.print("Nhap vi tri cuon sach can sua trong danh sach (nhap 0 de thoat):");
                int indexNeedToEdit = scanner.nextInt();
                if ((indexNeedToEdit < 0) || (indexNeedToEdit >= searchBookResult.size())) {
                    System.out.println("Khong hop le!!!");
                } else {
                    Book bookNeedToEdit = searchBookResult.get(indexNeedToEdit - 1);
                    while (true) {
                        System.out.println("Chon cac thao tac sau:");
                        System.out.println("Nhap 1: sua Title.");
                        System.out.println("Nhap 2: sua Author.");
                        System.out.println("NHap 3: sua Type.");
                        System.out.println("Nhap 4: sua Publication Date.");
                        System.out.println("Nhap 5: xoa sach!!!");
                        System.out.println("Nhap 0: thoat.");
                        int editType = scanner.nextInt();
                        if ((editType < 0) || (editType > 4)) {
                            System.out.println("Khong hop le!!!");
                        }
                        else if (editType == 0) {
                            break;
                        } else {
                            String updatedInformation;
                            switch (editType) {
                                case 1:
                                    System.out.print("Nhap Title moi: ");
                                    updatedInformation = scanner.nextLine();
                                    bookNeedToEdit.setTitle(updatedInformation);
                                    break;
                                case 2:
                                    System.out.print("Nhap Author moi: ");
                                    updatedInformation = scanner.nextLine();
                                    bookNeedToEdit.setAuthor(updatedInformation);
                                    break;
                                case 3:
                                    System.out.print("Nhap Type moi: ");
                                    updatedInformation = scanner.nextLine();
                                    bookNeedToEdit.setType(updatedInformation);
                                    break;
                                case 4:
                                    System.out.print("Nhap Publication Date moi: ");
                                    updatedInformation = scanner.nextLine();
                                    bookNeedToEdit.setPublicationDate(updatedInformation);
                                    break;
                                default:
                                    searchBookResult.remove(bookNeedToEdit);
                                    System.out.println("Sach da duoc xoa!!!");
                            }
                        }
                    }
                }
                if (indexNeedToEdit == 0) break;
            }
        }
    }
}
