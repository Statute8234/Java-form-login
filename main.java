
public class main {
    public static void main(String[] args) {
        authorisation authorisation_data = new authorisation();
        
        loginForm loginPage = new loginForm(authorisation_data.getLoginInfo());

    }
}
