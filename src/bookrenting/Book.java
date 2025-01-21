
package bookrenting;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Book{ 
private String book_typ;
private String book_name;
private double priceOfTheBook;

public Book(String book_typ, String book_name, double priceOfTheBook) {
this.book_typ = book_typ;
 this.book_name = book_name;
 this.priceOfTheBook = priceOfTheBook;
 }


public Book() {
this.book_typ="";
this.book_name="";
this.priceOfTheBook=0; 
 }
public Book(Book book) {
this.book_typ=book.book_typ;
this.book_name=book.book_name;
this.priceOfTheBook=book.priceOfTheBook;
}

 public String getBook_typ() {
return book_typ;
 }

public void setBook_typ(String book_typ) {
this.book_typ = book_typ;
}

 public String getBook_name() {
return book_name;
 }

public void setBook_name(String book_name) {
 this.book_name = book_name;
 }

public double getPriceOfTheBook() {
 return priceOfTheBook;
}

 public void setPriceOfTheBook(double priceOfTheBook) {
this.priceOfTheBook = priceOfTheBook;
 }

public String toString(){

return "The book typ is:"+ this.book_typ +"\nThe book name is;"+this.book_name+"\nThe priceOfTheBook is;"+this.priceOfTheBook;

}
public void customers_file()throws IOException{

FileWriter f=new FileWriter("book.txt",true);


PrintWriter w=new PrintWriter(f);

 w.print("\t"+book_typ+"\t\t");

 w.print("\t"+book_name+"\t\t");

w.println("\t"+priceOfTheBook+"\t\t");

 w.close();

 }


 public void display_customers_file()throws FileNotFoundException{

System.out.println("the book typ is:\t the book name is:\t the priceOfTheBook  is;\t");

 File Thefile=new File("book.txt");

Scanner s=new Scanner(Thefile);
int num=1;
 while(s.hasNext()){

String scan=s.nextLine();

System.out.println("\t\t"+scan);
num++;
}
s.close();
 }

}