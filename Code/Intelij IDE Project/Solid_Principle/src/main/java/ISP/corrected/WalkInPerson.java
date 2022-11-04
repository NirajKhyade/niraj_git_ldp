package ISP.corrected;

public class WalkInPerson implements WalkInPersonOrder,PayInPerson{


    @Override
    public void payOnCounter() {

        System.out.println("Payment received in cash");
    }

    @Override
    public void takeOrderOnCounter() {
        System.out.println("Order placed through Counter");

    }
}
