
package book;

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        Author ali = new Author(); 
        Scanner inp = new Scanner(System.in) ; 
        System.out.println("Enter Email : ");
        String str = inp.next();
        inp.nextLine();
        ali.setEmail(str);
        System.out.println("Enter your sex : ");
        String sex = inp.next();
        char cha = sex.charAt(0);
        if(cha!='m' && cha!= 'f'){
            System.out.println("dorost vared konid ! ");
        }
        ali.setGenerate(cha);
        System.out.println("Enter your name : ");
        String nam = inp.next();
        ali.setName(nam);
        System.out.println("Enter book name : ");
        String book = inp.next();
        System.out.println("Enter price of book : ");
        double price = inp.nextDouble();
        System.out.println("Enter quality of book : ");
        int Quality = inp.nextInt();
        Book book1 = new Book(nam, ali, price, Quality) ; 
        System.out.println(book1);
        
    }
}
