package task_12;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
public class ProgrammerBook extends Book {
    private String language;
    private int level;

    @Builder
    public ProgrammerBook(String title, String author, int price, int isbn, String language, int level) {
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        ProgrammerBook programmerBook = (ProgrammerBook) obj;
        return level == programmerBook.level && (Objects.equals(language, programmerBook.language));
    }

    @Override
    public int hashCode() {
        return (int) (Math.sin(level) * (int) language.charAt(0));
    }

    @Override
    public String toString() {
        return "Programmer Book: { language = " + language + "; level = " + level + " }";
    }

}