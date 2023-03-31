import java.util.Scanner;

public class atm {

    public static int Withdraw(int withdraw, int balance){
        if(withdraw >= balance){
            System.out.println("\nInsufficient Balance");
        }
        else{
            System.out.println("\nCollect your cash!!");
            balance = balance - withdraw;
            System.out.println("\nBalance after Withdrawal: " + balance);
        }
        return balance;
    }
    public static int deposit(int deposit, int balance){
        System.out.println("\nAmount has been deposited successfully!! ");
        balance = balance + deposit;
        System.out.println("\nBalance after deposition: " + balance);
        return balance;
    }
    public static int transfer(int transfer, int balance){
        if(transfer >= balance){
            System.out.println("\nInsufficient Balance");
        }
        else{
            System.out.println("\nAmount has been transfer successfully!!");
            balance = balance - transfer;
            System.out.println("\nBalance after transfer: " + balance);
        }
        return balance;
    }
    public static int balance(int balance){ 
           return balance; 
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int user_id = 25;
            int user_pin = 2510;
            int balance = 50000;
            int attempt = 3;
            int withdraw, deposit, transfer, i;
            System.out.println("Welcome to Automated Teller Machine !!");

    for(i = 1; i <= 3; i++){
    System.out.println("\nEnter User ID & User Pin");
    System.out.println("\nEnter User Id: ");
    user_id = sc.nextInt();
    System.out.println("\nEnter User Pin: ");
    user_pin = sc.nextInt();
        if(user_id != 25 || user_pin != 2510){
            if(i == 3 || (attempt - i) == 0){
                System.out.println("\nSorry, Authentication Failed. ");
                System.exit(0);
                }
                    else{
                            System.out.println("\nPlease Enter valid details in " + (attempt - i) + " attempt");
                        }
}

else{
System.out.println("\nAuthentication Successful!!");
while(true){
System.out.println("\nChoose the operation you want to perform. \n1.Withdraw\n2.Deposit\n3.Transfer\n4.Check balance\n5.Exit");
int choice = sc.nextInt();
switch(choice){
case 1:
System.out.println("\nEnter the amount to withdraw: ");
withdraw = sc.nextInt();
balance = Withdraw(withdraw, balance);
break;
case 2:
System.out.println("\nEnter the amount to deposit: ");
deposit = sc.nextInt();
balance = deposit(deposit, balance);
break;
case 3:
System.out.println("\nEnter the amount to transfer: ");
transfer = sc.nextInt();
System.out.println("\nEnter the Beneficiary account number: ");
int account = sc.nextInt();
balance = transfer(transfer, balance);
break;
case 4:
System.out.println("\nBalance is: " + balance(balance));
break;
case 5:
System.out.println("\nThanks For using Me!!");
System.exit(0);
}
}
}
}
}
}



