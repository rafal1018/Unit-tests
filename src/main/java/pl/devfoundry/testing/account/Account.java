package pl.devfoundry.testing.account;

import java.util.Objects;

public class Account {

    private boolean active;
    private Address defaultDeliveryAddress;

    public Account() {
        this.active = false;
    }

    public Account(Address defaultDeliveryAddress) {
        this.defaultDeliveryAddress = defaultDeliveryAddress;
        if (defaultDeliveryAddress != null) {
            activate();
        } else {
            this.active = false;
        }
    }

    public boolean isActive() {
        return active;
    }

    public void activate() {
        this.active = true;
    }

    public Address getDefaultDeliveryAddress() {
        return defaultDeliveryAddress;
    }

    public void setDefaultDeliveryAddress(Address defaultDeliveryAddress) {
        this.defaultDeliveryAddress = defaultDeliveryAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return active == account.active && Objects.equals(defaultDeliveryAddress, account.defaultDeliveryAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(active, defaultDeliveryAddress);
    }
}
