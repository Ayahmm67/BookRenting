
package bookrenting;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class RentBook {
   private int numberOfDay;
   private Book book;
   private Customer customer;
   private double priceIs=0;

   public RentBook(int numberOfDay2,Book book2,Customer customer2){
   
   this.numberOfDay=numberOfDay2;
    this.book=new Book(book2);
   this.customer=new Customer (customer2);
   
   
   }
   public RentBook(){
   
   this.numberOfDay=0;
   this.book=null;
   this.customer=null;
   
   
   }

    public int getNumberOfDay() {
        return numberOfDay;
    }

    public void setNumberOfDay(int numberOfDay) {
        this.numberOfDay = numberOfDay;
    }

    public Book getBook() {
        return new Book(this.book);
    }

    public void setBook(Book book) {
     this.book =new Book(book);
    }

    public Customer getCustomer() {
        return new Customer(customer);
    }

    public void setCustomer(Customer customer) {
        this.customer = new Customer(customer);
    }
   public void price(){
   
   
  this.priceIs=this.numberOfDay*this.book.getPriceOfTheBook();
       
       
   };
   
  public String toString(){

      return "The rent information is:"+ this.customer +this.book+"\nThe num days  is:"+this.numberOfDay+this.priceIs;

} 
   
   
     public void rent_file()throws IOException{

      

      FileWriter f=new FileWriter("Rent.txt",true);

      PrintWriter w=new PrintWriter(f);

      w.println(this.customer.getname()+"\t\t");

      w.println(this.book.getBook_name()+"\t\t");

      w.println(this.priceIs);

      w.close();

      }
   public void display_customers_file()throws FileNotFoundException{

      System.out.println("customer name:\n the book name is:\n the priceOfTheBook is:\n");

      File Thefile=new File("Rent.txt");

      Scanner s=new Scanner(Thefile);
      int count=1;

      while(s.hasNext()){

       String scan=s.nextLine();

      System.out.println("\t"+scan);
       ++count;
      }

      s.close();

      }
    
   
   
}