package DAY6;

import java.util.*;  

class Book {  
    int bookId;  
    String title;  
    int pages;  

    Book(int bookId, String title, int pages) {  
        this.bookId = bookId;  
        this.title = title;  
        this.pages = pages;  
    }  
}  

class PageComparator implements Comparator<Book> {  
    public int compare(Book b1, Book b2) {  
        return Integer.compare(b1.pages, b2.pages);  
    }  
}  

class TitleComparator implements Comparator<Book> {  
    public int compare(Book b1, Book b2) {  
        return b1.title.compareTo(b2.title);  
    }  
}  

public class BookSortComparator {  
    public static void main(String args[]) {  
        ArrayList<Book> books = new ArrayList<>();  
        books.add(new Book(301, "The Alchemist", 200));  
        books.add(new Book(304, "Atomic Habits", 320));  
        books.add(new Book(303, "Rich Dad Poor Dad", 250));  

        System.out.println("Sorting by Title:");  
        Collections.sort(books, new TitleComparator());  
        for (Book b : books) {  
            System.out.println(b.bookId + " " + b.title + " " + b.pages + " pages");  
        }  

        System.out.println("\nSorting by Page Count:");  
        Collections.sort(books, new PageComparator());  
        for (Book b : books) {  
            System.out.println(b.bookId + " " + b.title + " " + b.pages + " pages");  
        }  
    }  
}  
