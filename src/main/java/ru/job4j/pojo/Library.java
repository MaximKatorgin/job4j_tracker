package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book headFirstJava = new Book("Head First Java", 500);
        Book effectiveJava = new Book("Effective Java", 600);
        Book javaInAction = new Book("Java in action", 400);
        Book cleanCode = new Book("Clean code", 300);
        Book[] books = new Book[4];
        books[0] = headFirstJava;
        books[1] = effectiveJava;
        books[2] = cleanCode;
        books[3] = javaInAction;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println("Book " + book.getName() + " has " + book.getPages() + " pages");
        }

        System.out.println("Books switched");
        books[0] = javaInAction;
        books[3] = headFirstJava;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println("Book " + book.getName() + " has " + book.getPages() + " pages");
        }

        System.out.println("Only \"Clean code\"");
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (book.getName().equals("Clean code")) {
                System.out.println("Book " + book.getName() + " has " + book.getPages() + " pages");
            }
        }
    }
}
