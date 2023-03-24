package source;

import java.util.Scanner;

public class LandingPage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cont = 1;

        while (cont==1){

            System.out.print("""
                =====================================
                1. register
                2. Reset Password
                3. Login
                4. List of test result
                5. User typing test
                =====================================
                Choose an option:  """);
            int option = sc.nextInt();

            if (option==1){
                Register.main(args);
                
            }
            else if (option==2){
                
            }
            else if (option==3){
                
            }
            else if (option==4){
                
            }
            else if (option==5){

            }

            System.out.print("Continue? write 1=>yes or 0=>no: ");
            cont = sc.nextInt();
        }

        sc.close();
    }
}