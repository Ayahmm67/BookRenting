/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author user
 */
public class emtest {

    
    public static void main(String[] args) {
       Employee r=new Employee("s",41,"acc","vi");
       Employee r2=new Employee("m",3);
       r2.setD("it");
       r2.setP("p");
       Employee r3=new Employee();
       r3.setName("j");
       r3.setId(8);
       r3.setP("e");
       r3.setD("m");
       System.out.printf("%-16s%-13s%-10s%-11p","name","id","d","p");
       System.out.printf("%-16s%-13s%-10s%-11p",r.getName(),r.getId(),r.getD(),r.getP());
       
       
    }
    
}
