class Account:

    def __init__(self, username, email_address):
        self.name = username
        self.email = email_address
        self.logged_in = False

    def login(self):

        if self.logged_in:
            print("Already Logged in")
            return

        print("Logging in....")
        print(f"Welcome {self.name}\n")
        self.logged_in = True

    def logout(self):

        if not self.logged_in:
            print("Not logged in")
            return

        print("Logging out")
        self.logged_in = False

    def _is_user_logged_in(self):
        return self.logged_in

    def get_account_info(self):
        return ('Account Details:\n'
                f'Username: {self.name}\n'
                f'Email: {self.email}\n'
                f'Login Status: {self.logged_in}')
