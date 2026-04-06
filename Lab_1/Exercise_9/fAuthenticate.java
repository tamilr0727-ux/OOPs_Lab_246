interface Authenticator {
    boolean authenticate(String user, String pass);
}

class GoogleAuth implements Authenticator{
    @Override
    public boolean authenticate(String user, String pass) {
        System.out.println("Authenticating via Google...");
        return user.equals("googleUser") && pass.equals("123");
    }
}

class FacebookAuth implements Authenticator {
    @Override
    public boolean authenticate(String user, String pass) {
        System.out.println("Authenticating via Facebook...");
        return user.equals("fbUser") && pass.equals("456");
    }
}

class OTPAuth implements Authenticator {
    @Override
    public boolean authenticate(String user, String pass) {
        System.out.println("Authenticating via OTP...");
        return pass.equals("9999"); 
    }
}

class LoginSystem {
    private Authenticator auth;

    public LoginSystem(Authenticator auth) {
        this.auth = auth;
    }

    public void login(String user, String pass) {
        if (auth.authenticate(user, pass)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
    }
}

public class fAuthenticate {
    public static void main(String[] args) {

        Authenticator google = new GoogleAuth();
        LoginSystem login1 = new LoginSystem(google);
        login1.login("googleUser", "123");

        System.out.println();

        Authenticator facebook = new FacebookAuth();
        LoginSystem login2 = new LoginSystem(facebook);
        login2.login("fbUser", "456");

        System.out.println();

        Authenticator otp = new OTPAuth();
        LoginSystem login3 = new LoginSystem(otp);
        login3.login("anyUser", "9999");
    }
}
