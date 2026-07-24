import java.util.Scanner;

public class Register {

    String firstName;
    String lastName;
    String mail;
    int mobileNumber; 
    String password;
    String confirmPassword;
    String country;

    public Register() {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("===== Welcome to Smart Bank Registration =====");

        System.out.print("Enter Your First Name : ");
        firstName = sc.nextLine();

        System.out.print("Enter Your Last Name : ");
        lastName = sc.nextLine();

        System.out.print("Enter Your Mail : ");
        mail = sc.nextLine();

        System.out.print("Enter Your Mobile Number : ");
        mobileNumber = sc.nextInt(); 

        System.out.print("Enter Your Password : ");
        password = sc.nextLine();

        System.out.print("Enter Your Confirm Password : ");
        confirmPassword = sc.nextLine();

        System.out.print("Enter Your Country : ");
        country = sc.nextLine();

        
        System.out.println("\n===== Registration Successful =====\n");
    }

    public void displayRegisterDetails() {
        System.out.println("----- User Details -----");
        System.out.println("First Name : " + firstName);
        System.out.println("Last Name : " + lastName);
        System.out.println("Mail : " + mail);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("Password : " + password);
        System.out.println("Confirm Password : " + confirmPassword);
        System.out.println("Country : " + country);
    }
}