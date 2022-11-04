package ISP.corrected;

public class OrderOnline implements PayOnline,OnlineOrder{
    @Override
    public void onLineOrderPlace() {
        System.out.println("Order place through Zomato");
    }

    @Override
    public void payOnlineUpi() {
        System.out.println("Payment done through Gpay");

    }
}
