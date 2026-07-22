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
            System.out.println("Create Account Selected");

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
    public static void main(String[] args) {
        System.out.println("Welcome to Smart Bank");

        displayMenu();
        System.out.print("Enter your choice: ");

        //Main bank  = new Main();


        char choice = getUserChoice();
       // System.out.println("You selected: " + choice);

        executeChoice(choice);
    }
}
