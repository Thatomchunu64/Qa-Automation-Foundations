from Account import MainAccount
from Shopping_cart import ShoppingCart


class ClientAccount(MainAccount):

    def __init__(self, username, email, membership_level, shopping_exs):

        super().__init__(username, email)
        self.membership_level = membership_level
        self.shopping_cart = ShoppingCart(shopping_exs)

    def add_to_cart(self, item):

        if not self._is_logged_in():
            print('Need to login first!')
            return

        self.shopping_cart.add_item(item)

    def remove_from_cart(self, item):

        if not self._is_logged_in():
            print('Need to login first!')
            return

        self.shopping_cart.remove_item(item)

    def empty_cart(self):

        if not self._is_logged_in():
            print('Need to login first!')
            return

        self.shopping_cart.clear_cart()

    def view_cart(self):

        if not self._is_logged_in():
            print('Need to login first!')
            return

        print(self.shopping_cart.display_cart())

    def upgrade_membership(self, new_level):

        if not self._is_logged_in():
            print('Need to login first!')
            return

        if self.membership_level == new_level:
            print(f'Already a {self.membership_level} member \n')
            return

        self.membership_level = new_level
        print(f'Successfully upgraded to {self.membership_level}')

    def get_client_details(self) -> str:

        return f'{self.get_account_info()} \nMembership Level: {self.membership_level} \n'
