import java.util.ArrayList;
import java.util.Iterator;


public class BookListExample {
    public static void main(String[] args) {

        BookList bookList1 = new BookList("Himu", "ovi", "RedBook", 001, 01677, 500);
        BookList bookList2 = new BookList("Java", "Afzal", "SV", 002, 0156, 100);
        BookList bookList3 = new BookList("Intro", "saiful", "Lam", 003, 01467, 500);

        ArrayList<BookList> arrayList = new ArrayList<BookList>();
        arrayList.add(bookList1);
        arrayList.add(bookList2);
        arrayList.add(bookList3);

      /*  for(BookList books : arrayList){
            System.out.println("Books Name: "+books.name + " Auth Name: " +books.author);
        }*/

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            BookList bookList = (BookList) iterator.next();
            System.out.println("Name : " + bookList.author + " ID : " + bookList.id);
        }
    }

}

class BookList {
    String name, author, publication;
    int id, phoneNo, quentity;

    BookList(String name, String author, String publication, int
            id, int phoneNo, int quentity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.author = author;
        this.publication = publication;
        this.quentity = quentity;
        this.phoneNo = phoneNo;
    }
}
