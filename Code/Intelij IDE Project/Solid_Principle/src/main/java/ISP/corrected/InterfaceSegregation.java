package ISP.corrected;

public class InterfaceSegregation {
    public static void main(String[] args) {
        WalkInPerson walkInPerson=new WalkInPerson();
        OrderOnline orderOnline=new OrderOnline();

        walkInPerson.takeOrderOnCounter();
        walkInPerson.payOnCounter();


        orderOnline.onLineOrderPlace();
        orderOnline.payOnlineUpi();


    }
}
