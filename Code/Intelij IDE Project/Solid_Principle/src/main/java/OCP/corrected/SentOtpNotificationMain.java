package OCP.corrected;

public class SentOtpNotificationMain {

    public static void main(String[] args) {
        MobileOtp otp=new MobileOtp();
        otp.validateCustomerName("Nira");
        otp.sendOTP();

    }
}
