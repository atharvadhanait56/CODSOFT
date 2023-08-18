import java.util.Scanner;
class Bank_account
{   
    protected double balance;
}

class ATM extends Bank_account
{
    Scanner S=new Scanner(System.in);
    void  withdraw(double amount)
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
    
    void deposit(double amount)
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

    void checkBalance()
    {
        System.out.println("Your Balance is "+balance);
    }

    void run()
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
                System.exit(1);
            }
        }
        while(choice!=4);
    }
}

public class ATM_Interface
{
    public static void main(String[] args) 
    {
        ATM atm=new ATM();
        atm.run();
    }
}