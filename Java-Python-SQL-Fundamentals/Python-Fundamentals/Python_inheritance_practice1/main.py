from Gamer_Account import GamerAccount

user1 = GamerAccount("EXS_64", 'exstasy64@gmail.com', 'Gold', "Installed Games")
user2 = GamerAccount('ivar', 'ivarrotg64@gmail.com', 'Platinum', 'Favourites')

print(user1.get_gaming_info())
print(user2.get_gaming_info())

print('----------------------------------------------------------------------------')
print('Before login checks:')
user1.logout()
user1.buy_game('Avatar')
user1.uninstall_game('Avatar')
user1.reset_library()
user1.view_library()
user1.upgrade_membership('Gold')
print('----------------------------------------------------------------------------')

print('After login checks:')

user1.login()

# adding games
print('Adding games procedure:')
user1.buy_game('Avatar')
user1.buy_game('Red Death Redemption 3')
user1.buy_game('Call of duty- Black Ops')
user1.buy_game('Dragon Ball- Tenkaichi Tag team')
user1.buy_game('Gran Tourismo')
print()
user1.view_library()

print('------------------------------------------------------------')

print('Removing games procedure:')
user1.uninstall_game('Avatar')
user1.uninstall_game('Red Death Redemption 3')
print()
user1.view_library()

print('------------------------------------------------------------')

print('Clear library procedure:')
user1.reset_library()
user1.reset_library()
print()
user1.view_library()

print('------------------------------------------------------------')
print('Upgrade membership procedure:')
user1.upgrade_membership('Gold')  # already a gold membership holder, trying to trigger faulty check
user1.upgrade_membership('Platinum')  # actual upgrade
user1.get_gaming_info()

user1.logout()
user1.logout()

print('\nEND OF PROGRAM')
