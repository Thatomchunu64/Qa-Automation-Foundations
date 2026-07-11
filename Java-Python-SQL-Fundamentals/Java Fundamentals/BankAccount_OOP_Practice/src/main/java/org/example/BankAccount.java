package org.example;

public class BankAccount {

    private String accHolderName;
    private int accNumber, balance;
    private boolean isAccActive = true;


    //Constructor
    public BankAccount(String accHolderName, int accNumber) {
        this.accHolderName = accHolderName;
        this.accNumber = accNumber;
        balance = 0;
    }// end of constructor


    //Method1
    public void deposit(int amount) {

        if (isAccActive) {
            if (amount <= 0) {
                amount = 0;
                System.out.println("Cant deposit negative value \n");
            }
            balance = balance + amount;

            System.out.println("Deposit successful.\n" +
                    "New balance: R" + balance + "\n");
        } else {
            System.out.println("Cannot deposit. Account is inactive. \n");
        }//end of IF AND ELSE statement


    }// end of method 1

    /* CHAT_GPT VERSION OF METHOD 1
    public void deposit(int amount) {

    // First check if the account is active
    if (!isAccActive) {
        System.out.println("Cannot deposit. Account is inactive.\n");
        return;
    }

    // Then check if the amount is valid
    if (amount <= 0) {
        System.out.println("Deposit amount must be greater than 0.\n");
        return;
    }

    // If all checks passed, perform the deposit
    balance += amount;

    System.out.println("Deposit successful.");
    System.out.println("New balance: R" + balance + "\n");
}
     */

    //Method 2
    public void withdraw(int amount) {
        if (!isAccActive) {
            System.out.println("Cannot withdraw. Account is inactive. \n");
        } else {
            //if statement within else statement(IF2)
            if (amount > balance) {
                System.out.println("Insufficient funds. \n");
            } else {

                if (amount <= 0) {
                    amount = 0;
                    System.out.println("Cant enter negative value \n");
                }

                balance = balance - amount;
                System.out.println("Withdrawal successful.\n" +
                        "Remaining balance: R" + balance + "\n");
            }


        }// END OF ELSE STATEMENT
    }//end of method 2

    /* CHAT_GPT VERSION OF METHOD 2
   public void withdraw(int amount) {

    // First check if the account is active
    if (!isAccActive) {
        System.out.println("Cannot withdraw. Account is inactive.\n");
        return;
    }

    // Check if the amount is valid
    if (amount <= 0) {
        System.out.println("Withdrawal amount must be greater than 0.\n");
        return;
    }

    // Check if enough money exists
    if (amount > balance) {
        System.out.println("Insufficient funds.\n");
        return;
    }

    // Everything is valid
    balance -= amount;

    System.out.println("Withdrawal successful.");
    System.out.println("Remaining balance: R" + balance + "\n");
}

     */

    //METHOD 3
    public void freezeAcc() {
        if (!isAccActive) {
            System.out.println("Account is already inactive. \n");


        } else {
            System.out.println("Account has been frozen. \n");
            isAccActive = false;
        }// END OF ELSE STATEMENT


    }//END OF METHOD 3

    //METHOD 4
    public void activateAcc() {
        if (isAccActive) {
            System.out.println("Account is already active. \n");
        } else {
            System.out.println("Account has been activated. \n");
            isAccActive = true;
        }//END OF ELSE STATEMENT

    }// END OF METHOD 4

    //RETURN METHOD
    public String accInfo() {
        return "Account Details: \n" +
                "Account Holder: " + accHolderName +
                "\nAccount Number: " + accNumber +
                "\nBalance: " + balance +
                "\nStatus: " + isAccActive +
                "\n";
    }// End of METHOD


}//End of CLass
