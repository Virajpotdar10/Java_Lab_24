package Experiment_5;

import Experiment_5.LibraryManagement.Book;
import Experiment_5.LibraryManagement.Member;

public class LibraryDemo {

    public static void main(String[] args) {
        

        Book b1 = new Book("Java Programming", "James Gosling", "12345");
        Member m1 = new Member("Viraj", 101);

        System.out.println("----- Library System -----");

        b1.displayBook();
        System.out.println();
        m1.displayMember();
    }
}