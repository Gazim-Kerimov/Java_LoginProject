public class Main {
    public static void main(String[] args) {
        LoginCreator creator = new LoginCreator();
        try {
            for(int i = 0; i < 3; i++){
                creator.AddLogin();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        creator.ShowAllLogins();
        System.out.println("The number of created logins: " + creator.GetNumbersOfLogins());
    }
}
