
package bookrenting;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class BookRenting {
//sultana sami altheab 2211066
//Ayah mohammed Mujahed 2211454
    
    public static void main(String[] args)throws IOException {
        
       Scanner n=new Scanner(System.in);
       
       ArrayList<Customer> customer=new ArrayList<Customer>();
       ArrayList<Book> book=new ArrayList<Book>();
      
   
       RentBook r=new RentBook();
       Customer c=new Customer();
       Book b=new Book();
       
       
       
       int option;
       
       
       while(true){
           System.out.println("choose 1 to add a new customer");
           System.out.println("choose 2 to add a new Book");
           System.out.println("choose 3 for a new rent");
           System.out.println("choose 4 to desplay all customer");
           System.out.println("choose 5 to desplay all books");
           System.out.println("choose 6 to desplay all rent");
           System.out.println("please enter your choice:");
           
           option=n.nextInt();
           
          switch(option){
            
          
              case 1:
            int id;
            String name;
            int age;
           n.nextLine();
          System.out.println("please enter name:");
          name=n.nextLine();
          System.out.println("please enter id number:");
          id=n.nextInt();
          System.out.println("please enter your age : ");
             age=n.nextInt();
         if(age<18){
             System.out.println("sorry we only rent for adults.");
             break;
                     }
      
         Customer cu=new Customer(name,id,age);
          customer.add(cu);
          cu.customers_file();
          break;
              case 2:
          
          String book_Typ;
           String book_name;
           double priceofTheBook;
           n.nextLine();
          System.out.println("enter the book type:");
          book_Typ=n.nextLine();
          System.out.println("enter the book name:");
          book_name=n.nextLine();
           System.out.println("enter price of the book per day:");
           priceofTheBook=n.nextDouble();
           Book bo=new Book(book_Typ,book_name,priceofTheBook);
           book.add(bo);
           bo.customers_file();
           break;
           
           
           
              case 3:
                  
                  int book_numb,customer_n,num_day;
                  b.display_customers_file();
                  System.out.println("\t\t\t\t\t\t\t\t\t\t");
                  c.display_customers_file();
                  
                  
                  System.out.println("please enter the book number:");
                  book_numb=n.nextInt();
                  System.out.println("please enter the customer number:");
                 customer_n=n.nextInt();
                   System.out.println("please enter number of days:");
                  num_day=n.nextInt();
                  if (num_day>7){
                   System.out.println("sorry we do not rent the book for more than 7 days:");
                    System.out.println("please enter number of days:");
                  num_day=n.nextInt();
                  }
                  RentBook rent=new RentBook(num_day,book.get(book_numb-1),customer.get(customer_n-1));
                  rent.price();
                  System.out.println("New rent for the customer:");
                  System.out.println(customer.get(customer_n-1));
                  System.out.println("for the book:");
                  System.out.println(book.get(book_numb-1));
                  rent.rent_file();
                  break;
                  
                   case 4:
                  c.display_customers_file();
                  break;
                  
                  
                   case 5:
                   b.display_customers_file();
                   break;
                   
                   case 6:
                   r.display_customers_file();
                   break;
          }}}}