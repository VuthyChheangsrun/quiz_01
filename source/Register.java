package source;

import java.util.Scanner;

public class Register {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.print("Please enter your name: ");
      String name = sc.nextLine();
      System.out.print("Please enter your email: ");
      String email = sc.nextLine();
      System.out.print("Please enter your password: ");
      String password = sc.nextLine();
      System.out.println("Your name: "+name+", email: "+email+" and password: " +password);
   }
}
