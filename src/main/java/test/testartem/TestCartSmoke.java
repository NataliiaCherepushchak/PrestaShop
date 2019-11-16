package main.java.test.testartem;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import main.java.pages.cart.CartPage;
import main.java.test.BasicTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
@Listeners( BasicTest.class)

public class TestCartSmoke extends BasicTest {

    @Severity(SeverityLevel.CRITICAL)
    @Description("Smoke test includes add to cart and delete from it not logged user")
    @Test
    public void itemPresentsNonLogin()  {
        //Arrange
        CartPage cartPage =
                addToCartHelper()
                .getCartPage();
        //Act
        String actual = cartPage.getShoppingCart()
                .getShoppingItemsList()
                .get(0)
                .getNameText();
        //Assert
        assertTrue(actual.toLowerCase().contains("t-shirt"));
        cartPage
                .getShoppingCart()
                .deleteAllFromCart();
        assertTrue(cartPage.getShoppingCart().getShoppingItemsList().isEmpty());

    }
}
