package DIP.corrected;

public class MainClass {
    public static void main(String[] args) {


        Money money=new Money();

        Bank bank=new Bank(money);

        bank.withDrawlMoney();
        bank.depositsMoney();

        BankServices bankser= (BankServices) new Money();


    }


}
