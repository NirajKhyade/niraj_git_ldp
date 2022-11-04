package DIP.Voilation;

public class Money implements BankingServices {


    @Override
    public void depositeMoney() {

        System.out.println("Cash Deposits through CDM");

    }

    @Override
    public void withDrawlMoney() {


        System.out.println("Money Widrawl through ATM");
    }
}
