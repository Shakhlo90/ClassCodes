package Class18;

public class Book {
    String name;
    String author;
    int year;
    String language;

    Book(String name, String author){
        this.name=name;
        this.author=author;


    }
    Book(String name, String author, int year, String language){
        this(name, author);
        this.year= year;
        this.language=language;
    }
    void info(){
        System.out.println("The name of the book is "+ this.name+" the author is "+ this.author);

    }
    void  info2(){
        System.out.println("Published year is "+ this.year+" the laguage is "+ this.language);
    }
}
