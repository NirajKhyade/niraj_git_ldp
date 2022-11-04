package ISP.voilation;

public class OnlineCustomer implements Restaurant{

    public static void main(String[] args) {

    }
    @Override
    public void acceptOnlineOrder() {
        //logic
    }

    @Override
    public void acceptWalkInCustomerOrder() { throw new UnsupportedOperationException ();

    }





    @Override
    public void payOnline() {
       // logic
    }

    @Override
    public void payInPerson() {
        throw new UnsupportedOperationException();
    }
}
