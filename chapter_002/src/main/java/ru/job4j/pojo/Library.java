package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 750);
        Book book2 = new Book("Necronomicon", 500);
        Book book3 = new Book("The Call of Cthulhu ", 406);
        Book book4 = new Book("At the Mountains of Madness", 480);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;

        for (Book bk : books) {
            System.out.println(bk.getName() + " - " + bk.getPage());
        }

        System.out.println(System.lineSeparator() + "Поменяем местами 0 и 3 элемет массива" + System.lineSeparator());
        books[0] = book4;
        books[3] = book1;

        for (Book bk : books) {
            System.out.println(bk.getName() + " - " + bk.getPage());
        }

        System.out.println(System.lineSeparator() + "Выведем книги с названием клин код" + System.lineSeparator());

        for (Book bk : books) {
            if ("Clean code".equals(bk.getName())) {
                System.out.println(bk.getName() + " - " + bk.getPage());
            }
        }
    }
}
