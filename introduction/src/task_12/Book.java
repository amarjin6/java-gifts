package task_12;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Book implements Comparable<Book>, Cloneable {
    private String title;
    private String author;
    private int price;
    private int isbn;
    private static int edition = 5;

    @Override
    public int compareTo(Book book) {
        return this.isbn - book.isbn;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == this){
            return true;
        } if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Book book = (Book) obj;
        return title.equals(book.title) && author.equals(book.author) && Integer.compare(price, edition) == 0;
    }

    @Override
    public String toString(){
        return "Book: { title = " + title + "; author = " + author + "; price = " + price + "; edition = " + edition +" }";
    }

    @Override
    public int hashCode() { return (int) (Math.tan(price) + Math.sqrt(edition)); }

    @Override
    public Book clone() throws CloneNotSupportedException {
        return (Book) super.clone();
    }
}
