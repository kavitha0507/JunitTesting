package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class BookTest {
    @Test
    public void testBookEquality() {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        Book book2 = new Book("The Great Gatsby",  "F. Scott Fitzgerald");

                assertEquals(book1, book2, "Books with the same title and  author should be equal");

}

    @Test
    void getTitle() {
    }

    @Test
    void getAuthor() {
    }

    @Test
    void testGetTitle() {
    }

    @Test
    void testGetAuthor() {
    }
}