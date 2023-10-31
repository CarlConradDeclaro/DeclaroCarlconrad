package SemiFinals;
 import java.util.Scanner;

class BankAccount {
    private int accountNumber;
    private String accountName;
    private double balance =0;
   
    Scanner sc = new Scanner(System.in);
    BankAccount(){}   
    // public BankAccount(int accountNumber, String accountName, double balance) {
    //     this.accountNumber = accountNumber;
    //     this.accountName = accountName;
    //     this.balance = balance;
    // }

     
    void deposit(double amt){
          System.out.println("\n[[ You've succesfully deposited: " + amt + " to your account ]]");
          balance+=amt;
     }

    void withdraw(double amt){
        if(balance == 0 || amt > balance)
            System.out.println("<<<  Insuficient balance!  >>>");
        else{
            System.out.println("\n[[ You've succesfully withdrawn: " + amt +" ]]");
            balance-=amt;
           }
        
       
     }

    double displayBalance(){
         return getBalance();
    }


    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountName() {
        return accountName;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }   

}


class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BankAccount bankAcc =  new BankAccount();
        
        System.out.println("\n\t<<< BANK ACCOUNT SYSTEM >>>");
        System.out.print("\nEnter Account Number: ");
        bankAcc.setAccountNumber(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter Account Name: ");
        bankAcc.setAccountName(sc.nextLine());

         
        System.out.println("\nAccount number: " + bankAcc.getAccountNumber());
        System.out.println("Accont name: " + bankAcc.getAccountName());
        System.out.println("Balance: "+ bankAcc.displayBalance());


        boolean run = true;
        do{
            System.out.println("\n1) Deposit");
            System.out.println("2) Withdraw");
            System.out.println("3) Balance");
            System.out.println("4) Exit");
            
            System.out.print("\n choose: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                        System.out.print("\nEnter amount: ");
                        bankAcc.deposit(sc.nextInt());
                        break;
                case 2:  
                        System.out.print("\nEnter amount: ");
                        bankAcc.withdraw(sc.nextDouble());
                        break; 
                case 3: 
                      System.out.println("\n<<< Account details >>>");
                      System.out.println("Account number: " + bankAcc.getAccountNumber());
                      System.out.println("Accont name: " + bankAcc.getAccountName());
                      System.out.println("Balance: "+ bankAcc.displayBalance());
                      
                      break;   
                case 4:
                   run = false;       
                    break;                     
                default:
                    break;
            }       
        }while(run);


    }

}