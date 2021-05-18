package pl.devfoundry.testing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    public void newAccountShouldNotBeActiveAfterCreation() {

        //given+when
        Account newAccount = new Account();

        //then
        assertFalse(newAccount.isActive());
        assertThat(newAccount.isActive()).isFalse();

    }

    @Test
    public void accountShouldBeActiveAfterActivation() {

        //given
        Account newAccount = new Account();

        //when
        newAccount.activate();

        //then
        assertTrue(newAccount.isActive());
        assertThat(newAccount.isActive()).isTrue();

    }

    @Test
    void newlyCreatedAccountShouldNotHaveDefaultDeliveryAddressSet() {

        //given
        Account account = new Account();

        //when
        Address address = account.getDefaultDeliveryAddress();

        //then
        assertNull(address);
        assertThat(address).isNull();

    }

    @Test
    void defaultDeliveryAddressSshouldNotBeNullAfterBeingSet(){

        //given
        Address address = new Address("Krakowska", "67c");
        Account account = new Account();
        account.setDefaultDeliveryAddress(address);

        //when
        Address defaultAddress = account.getDefaultDeliveryAddress();

        //then
        assertNotNull(defaultAddress);
        assertThat(defaultAddress).isNotNull();

    }

}
