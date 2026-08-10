from Account import Account
from GamesLibrary import GameLibrary  # composition


class GamerAccount(Account):

    def __init__(self, username, email, membership_level, library_title):
        super().__init__(username, email)  # related to inheritance

        self.membership_level = membership_level
        self.library = GameLibrary(library_title, self)  # related to composition
        self.games_list = []

    def buy_game(self, game):

        if not self._is_user_logged_in():
            print('Please login first!')
            return

        self.games_list.append(game)
        self.library.add_game()

    def uninstall_game(self, game):

        if not self._is_user_logged_in():
            print('Please login first!')
            return

        self.games_list.remove(game)
        self.library.remove_game()

    def reset_library(self):

        if not self._is_user_logged_in():
            print('Please login first!')
            return

        self.games_list.clear()
        self.library.clear_library()

    def view_library(self):

        if not self._is_user_logged_in():
            print('Please login first!')
            return

        print(self.library.display_library())

    def upgrade_membership(self, new_level):

        if not self._is_user_logged_in():
            print('Please login first!')
            return

        if self.membership_level == new_level:
            print(f'Already using {self.membership_level} membership.\n"')
            return

        self.membership_level = new_level
        print(f'Successfully upgraded membership to {self.membership_level} membership.\n"')

    def get_gaming_info(self) -> str:
        return f'{self.get_account_info()} \nMembership: {self.membership_level}\n'
