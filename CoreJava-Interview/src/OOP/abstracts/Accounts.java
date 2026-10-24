package OOP.abstracts;

abstract class Accounts {

    public void deposit() {
        System.out.println("Money Deposited");
    }

    public abstract void interest();
}

class SavingAccount extends Accounts {

    @Override
    public void interest() {
        System.out.println("Interest = 4%");
    }
}