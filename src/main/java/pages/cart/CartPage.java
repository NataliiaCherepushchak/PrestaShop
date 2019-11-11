package main.java.pages.cart;

import main.java.pages.header.HeaderFull;

/**
 * 
 */
public class CartPage extends HeaderFull {
    private ShoppingCart shoppingCart;

    /**
     * Default constructor
     */
    public CartPage() {
        super();
        initShoppingCart ();

    }

    public void initShoppingCart () {
        shoppingCart = new ShoppingCart();
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }
}