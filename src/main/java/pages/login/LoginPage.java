package main.java.pages.login;


import main.java.pages.common.APageParent;

/**
 * 
 */
public class LoginPage extends APageParent {
    /**
     * Default constructor
     */
    public LoginPage() {
        getLoginForm ();
    }
    
    public LoginForm getLoginForm () {
        return new LoginForm ();
    }
}