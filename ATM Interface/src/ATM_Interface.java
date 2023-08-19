import java.util.Scanner;
class Bank_account  //Base class 
{   
    protected double balance;
}

class ATM extends Bank_account      //sub class derived from base class
{
    Scanner S=new Scanner(System.in);

    void  withdraw(double amount) // Method to withdraw money from the account
    {
        if(amount<balance && amount>0)
        {
            balance-=amount;
            System.out.println("Withdrawn Successfully!!");
        }
        else{
            System.out.println("Insufficient balance or Invalid Amount");
        }
    }
    
    void deposit(double amount) // Method to deposit money into the account
    {
        if(amount>0)
        {
            balance+=amount;
            System.out.println("Deposited Successfully!!!");
        }
        else
        {
            System.out.println("Invalid Amount");
        }
    }

    void checkBalance()  // Method to check and display the account balance
    {
        System.out.println("Your Balance is "+balance);
    }

    void run()  // Method to run the ATM interface
    {
        int choice;
        do
        {
            System.out.println("\n*************ATM Options***************");
            System.out.println("1.Withdraw \n2.Deposite \n3.Check Balance \n4.Exit");
            System.out.print("\nEnter choice:");
            choice=S.nextInt();
            switch(choice)
            {
                case 1:
                System.out.print("Enter Amount to Withdraw:");
                double amount_withdraw=S.nextDouble();
                withdraw(amount_withdraw);
                break;

                case 2:
                System.out.print("Enter the Amount to Deposit:");
                double amount_deposit=S.nextDouble();
                deposit(amount_deposit);
                break;

                case 3:
                checkBalance();
                break;

                case 4:
                System.exit(1);  // Exit the program

                default:
                System.out.println("Wrong Choice!!!!!!!");
            }
        }
        while(choice!=4); // Repeat until the user chooses to exit
    }
}

public class ATM_Interface
{
    public static void main(String[] args) 
    {
        ATM atm=new ATM();  // Create an instance of the ATM class
        atm.run(); 
    }
}