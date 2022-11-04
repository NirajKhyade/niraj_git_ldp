package LSP.corrected;


public class MainSocialMedia {

    public static void main(String[] args) {
        SocialMedia sm=new Facebook();
        sm.shareMultiMedia();
        sm.chat();
        sm.call();

        sm=new paymentMethod();
        sm.call();
        sm.chat();
        sm.shareMultiMedia();
        sm.sendMoney();

    }
}
