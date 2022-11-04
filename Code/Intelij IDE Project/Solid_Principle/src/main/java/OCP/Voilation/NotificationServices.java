package OCP.Voilation;

public class NotificationServices {

    public void sendOTP(String medium) {
        if ("email".equals(medium)) {
            System.out.println("Email sent to Register EmailId");

        } else if ("sms".equals(medium)){
            System.out.println("Confirmation sent to register Mobile Number");
        }

        //else if (whatsap,Telegram)
    }
}