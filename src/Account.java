
public class Account {


    String firstName;
    String lastName;
    int date;
    int month;
    int year;
    double balance;
    static long nextAccountNumber=1001;
    String accountNumber;
    int pin;

    Account(String firstName, String lastName, int date, int month, int year){
        this.firstName=firstName;
        this.lastName=lastName;
        this.date=date;
        this.month=month;
        this.year=year;


        accountNumber= "ASA"+nextAccountNumber;
        nextAccountNumber++;


    }

    void displayAccountDetails(){
    System.out.println("===== Account Created Successfully =====");
    System.out.println("Account Number :"+this.accountNumber);
    System.out.println("Account HolderName : "+lastName +" "+firstName);
    System.out.println("Date of Birth : " + date+"-"+month+"-"+year);
    System.out.println("Balance        :"+this.balance);

    }
    boolean setPin(int pin, int cpin){


        if(pin==cpin) {
            this.pin = pin;
            return false;
        }

            else {
            System.out.println("PIN mismatch.");
            System.out.println("Please enter again.");
            return true;
        }
        }

    }






