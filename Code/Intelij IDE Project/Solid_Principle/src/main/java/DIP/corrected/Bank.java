package DIP.corrected;

public class Bank {

    Money money;

    public Bank (Money money) {this.money=money; }

    public void depositsMoney(){money.depositeMoney();}

    public void withDrawlMoney(){money.withDrawlMoney();}

}
