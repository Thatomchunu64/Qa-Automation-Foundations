from Client_Account import ClientAccount

user1 = ClientAccount('Axel234', 'axel44@gmail.com', 'GOLD', 'Favourites')

print(user1.get_client_details())
print('----------------------------------------------------------------')

# before login checks, should retrieve errors
user1.logout()
user1.add_to_cart('WWW')
user1.remove_from_cart('WWW')
user1.empty_cart()
user1.view_cart()
user1.upgrade_membership('Gold')

print('----------------------------------------------------------------')
# After Login procedures

user1.login()

# Adding to cart
user1.add_to_cart('Men Jeans')
user1.add_to_cart('Bracelet')
user1.add_to_cart('Women pants')
user1.add_to_cart('Glasses')
user1.view_cart()

print('----------------------------------------------------------------')

# Removing from cart procedures
user1.remove_from_cart('Men Jeans')
user1.remove_from_cart('Bracelet')
user1.remove_from_cart('Car')

user1.view_cart()

print('----------------------------------------------------------------')
print('CLEAR CART PROCEDURE:')
user1.empty_cart()
user1.view_cart()

print('----------------------------------------------------------------')
# Upgrade membership procedure
user1.upgrade_membership('GOLD')
user1.upgrade_membership('PLATINUM')
print('----------------------------------------------------------------')

print(user1.get_client_details())
user1.logout()
user1.logout()

print('END OF TESTS')
print('----------------------------------------------------------------')
