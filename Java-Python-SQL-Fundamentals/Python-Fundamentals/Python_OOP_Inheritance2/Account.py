class MainAccount:

    def __init__(self, username, email):

        self.username = username
        self.email = email
        self.logged_in = False

    def login(self):

        if self.logged_in:
            print('Already logged in')
            return

        print('Logging in...')
        print(f'Welcome {self.username}')
        self.logged_in = True

    def logout(self):

        if not self.logged_in:
            print('Not logged in')
            return

        print('logging out...')
        self.logged_in = False

    def _is_logged_in(self):
        return self.logged_in

    def get_account_info(self) -> str:

        return ('Account Details: \n'
                f'Username: {self.username} \n'
                f'Email: {self.email} \n'
                f'Login Status: {self.logged_in}'

                )
