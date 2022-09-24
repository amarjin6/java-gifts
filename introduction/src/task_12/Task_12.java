package task_12;

import task_12.comparator.AuthorComparator;
import task_12.comparator.PriceComparator;
import task_12.comparator.TitleComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task_12 {

    private static final Book book1 = new Book("Title1", "Author1", 10, 25);
    private static final Book book2 = new Book("Title2", "Author2", 5, 55);
    private static final Book book3 = new Book("Title3", "Author3", 56, 66);

    private static List<Book> bookList = new ArrayList<>();

    public static final Comparator<Book> titleComparator = new TitleComparator();
    public static final Comparator<Book> titleAndAuthorComparator = new TitleComparator()
            .thenComparing(new AuthorComparator());
    public static final Comparator<Book> titleAndAuthorAndPriceComparator = new TitleComparator()
            .thenComparing(new AuthorComparator()
                    .thenComparing(new PriceComparator()));

    public static void main(String[] args) {
        updateList();
        bookList.sort(titleComparator);
        System.out.println("Sorting by title:\n");
        bookList.forEach(System.out::println);
        System.out.println();

        updateList();
        bookList.sort(titleAndAuthorComparator);
        System.out.println("Sorting by title and author:\n");
        bookList.forEach(System.out::println);
        System.out.println();

        updateList();
        bookList.sort(titleAndAuthorAndPriceComparator);
        System.out.println("Sorting by title, author and price:\n");
        bookList.forEach(System.out::println);
    }

    private static void updateList() {
        bookList.clear();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
    }

}

