import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int getUserChoice(){
        int choice = sc.nextInt();
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


    public static void main(String[] args) {
        System.out.println("Welcome to Smart Bank");

        displayMenu();
        System.out.print("Enter your choice: ");

        //Main bank  = new Main();


        int choice = getUserChoice();
        System.out.println("You selected: " + choice);
    }
}
