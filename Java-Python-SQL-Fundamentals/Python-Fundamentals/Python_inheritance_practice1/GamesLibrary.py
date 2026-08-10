class GameLibrary:
    """
        def add_game(self, game):
            self.games.append(game)
            self.games_owned += 1
            return game
    """

    def __init__(self, library_name, game_acc):
        self.library_name = library_name

        self.game_acc = game_acc
        self.games_owned = 0

    def add_game(self):

        print("Adding new game...")
        self.games_owned = len(self.game_acc.games_list)

    def remove_game(self):

        if self.games_owned <= 0:
            print('Library is empty')
            return

        print("Removing game...")
        self.games_owned = len(self.game_acc.games_list)

    def clear_library(self):

        if self.games_owned <= 0:
            print('Library is empty')
            return

        print("Clearing library")

        self.games_owned = len(self.game_acc.games_list)

    def display_library(self) -> str:
        return (f"Library Name: {self.library_name}\n"
                f'Games: {self.game_acc.games_list}\n'
                f"Games Owned: {self.games_owned}")
