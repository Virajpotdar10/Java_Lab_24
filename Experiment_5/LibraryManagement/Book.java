package Experiment_5.LibraryManagement;

public class Book {
    String title,author,ISBN;
    public Book(String t,String a, String i){
        this.title=t;
        this.author=a;
        this.ISBN=i;
    }

    public void displayBook(){
        System.out.println("Book name "+title);
        System.out.println("Author "+author);
        System.out.println("ISBN is:"+ISBN);
    }

}    

