class ShoppingCart:

    def __init__(self, cart_name):

        self.cart_name = cart_name
        self.cart_items = []

    def add_item(self, item):

        self.cart_items.append(item)

    def remove_item(self, item):

        if len(self.cart_items) <= 0: #preferred version: if not self.cart_items:
            print('Cannot remove, Cart is empty')
            return

        if item not in self.cart_items:
            print('Item is not in the cart')
            return

        self.cart_items.remove(item)
        print('Item Removed')

    def clear_cart(self):

        if len(self.cart_items) <= 0:
            print('Cart is already empty')
            return

        self.cart_items.clear()
        print('Cart is empty')

    def display_cart(self) -> str:

        return (f'Cart Name: {self.cart_name} \n'
                f'Cart Items: {self.cart_items} \n'
                f'Total Items: {len(self.cart_items)} \n')
