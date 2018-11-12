import java.util.*;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CourseFile {
    private String bookTitle;
    private String author;
    private String isbn;

    public CourseFile(String bookTitle, String author, String isbn) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.isbn = isbn;
    }
    public CourseFile(String bookTitle) {
        this.bookTitle=bookTitle;

    }
    public String getBookTitle() {
        return bookTitle;
    }
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean equals(Object b) {
        if(b != null && this.getClass() == b.getClass())
            return this.isbn.equals(((CourseFile) b).isbn);
        return false;
    }

    public String toString() {
        return author+" - "+bookTitle;
    }

    public void serialize(Vector<CourseFile> v) {
        try {
            FileOutputStream f = new FileOutputStream("book.txt");
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(v);
            o.flush();
            o.close();
            f.close();
        }catch(IOException e) {
          System.out.println("No files found!");
        }
    }
}

