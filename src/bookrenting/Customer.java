/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookrenting;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Customer {
    private String name;
    private int ID;
    private int age;
    public int Phone_num;
    
    public Customer()
    {
    name=null;
    ID=0;
    age=0;
    }
   
    public Customer(String n,int ID,int age )
    {
    name=n;
    this.ID=ID;
    this.age=age;
    }
    
    
    public Customer(Customer c)
    {
    name=c.name;
    ID=c.ID;
    age=c.age;
    }
    
    
    
    
    
    
    public void setname(String n){
        name=n;
    }
     public void setID(int i){
        ID=i;
    }
      public void setage(int n){
       age=n;
    }
      public String getname()
      {
          return name;
      }
      public int getid()
      {
      return ID;
      }
      public int getage()
      {
      return age;
      }
      public String toString(){
      return "The customer name is:"+ this.name +"\nThe customer ID is;"+this.ID+"\nThe customer age is;"+this.age;
}
      
      public void customers_file()throws IOException{
      
      FileWriter f=new FileWriter("customers.txt",true);
      PrintWriter w=new PrintWriter(f);
      w.print(name+"\t\t");
      w.print(ID+"\t\t");
      w.println(age);
      w.close();
      }
      public void display_customers_file()throws FileNotFoundException{
      System.out.println("the customer name is:\t the customer ID is:\t the customer age is;\t");
      File Thefile=new File("customers.txt");
      Scanner s=new Scanner(Thefile);
      int count=1;
      while(s.hasNext()){
       String scan=s.nextLine();
      System.out.println(count+"\t"+scan);
      count++;
      }
      s.close();
      }}
      
    