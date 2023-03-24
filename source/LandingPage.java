package source;

import java.util.Scanner;

public class LandingPage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cont = 1;
        while (cont==1) {

            System.out.print("""
                =====================================
                1. register
                2. Reset Password
                3. Login
                4. List of test result
                5. User typing test
                6. About Us
                =====================================
                Choose an option:  """);
            int option = sc.nextInt();
            sc.nextLine();

            switch(option){
                case 1: Register.main(args); break;
                case 2: ResetPw.main(args); break;
                case 3: userlogin.main(args); break;
                case 4: ResultList.main(args); break;
                case 5: usertyping.main(args); break;
                case 6: AboutUs.main(args); break;
            }
            
            System.out.print("Write 1 to continue, 0 to end: ");            
            cont = sc.nextInt();            
        }

        sc.close();
    }
}