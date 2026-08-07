class Account:

    def __init__(self, usernaam, mail):
        self.username = usernaam
        self.email = mail


account_info = Account("Thato", "thato@gmail.com"
)

print(account_info.username)
print(account_info.email)