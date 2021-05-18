package pl.devfoundry.testing;

public class Account {

    private boolean active;

    public Account() {
        this.active = false;
    }

    public boolean isActive() {
        return active;
    }

    public void activate() {
        this.active = true;
    }
}
