import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        LoginCreator creator = new LoginCreator();
        try {
            for(int i = 0; i < 3; i++){
                creator.AddLogin();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        creator.ShowAllLogins();
        System.out.println("The number of created logins: " + creator.GetNumbersOfLogins());

        try {
            creator.DeleteLogin();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        creator.ShowAllLogins();
    }
}
