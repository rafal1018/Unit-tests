package pl.devfoundry.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountTest {

    @Test
    public void myTest() {
        Account newAccount = new Account();
        assertFalse(newAccount.isActive());
    }

    @Test
    public void myTest2() {
        Account newAccount = new Account();
        assertFalse(newAccount.isActive());
        newAccount.activate();
        assertTrue(newAccount.isActive());
    }

}
