import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);

    static char getUserChoice(){
        char choice = sc.next().charAt(0);
        return choice;
    }
    static void displayMenu(){
        System.out.println("===== Smart Bank =====");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Check Balance");
        System.out.println("5. Exit");
    }

    static void executeChoice(char choice){
        switch(choice){
            case '1':
                createAccount();
                break;
            case '2':
                System.out.println("Deposit Selected");
                break;
            case '3':
                System.out.println("Withdraw Selected");
                break;
            case '4':
                System.out.println("Check Balance Selected");
                break;

            case '5':
                System.out.println("Exit Selected");

                break;
            default:
                System.out.println("Invalid");
        }
    }

    static Account createAccount(){

        System.out.print("Enter You First Name : ");
        String firstName=sc.next();

        System.out.print("Enter You Last Name : ");
        String lastName=sc.next();

        System.out.println("===Enter DOB=== : ");
        System.out.print("Enter Date : ");
        int date=sc.nextInt();

        System.out.print("Enter Month : ");
        int month=sc.nextInt();

        System.out.print("Enter Year : ");
        int year=sc.nextInt();



        Account account = new Account(firstName, lastName, date, month, year);
        account.displayAccountDetails();
        return account;

    }

    public static void main(String[] args) {
        Register register = new Register();
        register.displayRegisterDetails();  
        while(true) {
            System.out.println("Welcome to Smart Bank");

            displayMenu();
            System.out.print("Enter your choice: ");

            //Main bank  = new Main();


            char choice = getUserChoice();
            // System.out.println("You selected: " + choice);

            executeChoice(choice);


        }
    }
}