class BankAccount:


    def __init__(self,acc_holder,acc_num ):

        self.acc_holder_name= acc_holder
        self.acc_number= acc_num
        self.balance= 0
        self.account_active=True





    def deposit(self, amount):


        if not self.account_active:
            print("Cannot deposit, Account is inactive")
            return

        if amount <= 0:
            print('Cant deposit negative value')
            return

        self.balance += amount
        print('deposit successful')
        print(f'New balance= R{self.balance}')


    def withdraw(self, amount):

        if not self.account_active:
            print("Cannot withdraw, Account is inactive")
            return

        if amount <= 0:
            print('Withdrawal amount must be greater than 0')
            return

        if amount > self.balance:
            print('Insufficient funds')
            return

        self.balance -= amount
        print('Withdrawal successful')
        print(f'New balance= R{self.balance}')


    def freeze_account(self):
        if not self.account_active: #guard clause
            print("Account is already inactive")
            return

        print('Freezing account')
        self.account_active = False


    def activate_account(self):
        if self.account_active:
            print("Account is already active")
            return

        print('Activating account')
        self.account_active = True

    def get_account_info(self)-> str:#return method
        return (
            f"Account Holder: {self.acc_holder_name}\n"
            f"Account Number: {self.acc_number}\n"
            f"Balance: R{self.balance}\n"
            f"Account Active: {self.account_active}"
        )


user_account= BankAccount("Jeremy", 3908888)

user_account.deposit(-99)
user_account.deposit(100)
print()

user_account.withdraw(200)
user_account.withdraw(50.70)
print()

user_account.freeze_account()
user_account.freeze_account()
print()

user_account.activate_account()
user_account.activate_account()
print()

print(user_account.get_account_info())


