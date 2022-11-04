package OCP.corrected;

public class MobileOtp implements NotificationServices{

    @Override
    public void sendOTP() {
        System.out.println("OTP shared via Mobile Number");
    }

    public void validateCustomerName(String name){

        System.out.println("Validating");

    }
}
