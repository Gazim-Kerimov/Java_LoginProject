import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class LoginCreator {
    private static ArrayList<String> listOfLogins = new ArrayList<>();
    private static int countOfLogins = 0;
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void AddLogin() throws IOException {
        while(true){
            System.out.println("Please create login №" + (countOfLogins+1) +" :");
            String inputLogin = reader.readLine();
            if(CheckUnique(inputLogin)){
                listOfLogins.add(inputLogin);
                System.out.println("Your login was successfully created");
                countOfLogins++;
                break;
            }
            else{
                System.out.println("Such login already exist. Please try create another login");
            }
        }
    }
    private boolean CheckUnique(String login){
        boolean result = true;
        for (String element : listOfLogins) {
            if (element.equals(login)) {
                result = false;
                break;
            }
        }
        return result;
    }
    public void ShowAllLogins(){
        System.out.println("All currently existing logins: ");
        for (String element : listOfLogins) {
            System.out.println(element);
        }
    }
    public void DeleteLogin() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please type in the login you would like to delete: ");
        String login = reader.readLine();
        for(int i = 0; i < listOfLogins.size(); i++){
            if(listOfLogins.get(i).equals(login)){
                listOfLogins.remove(i);
                System.out.println("Login was successfully deleted");
                countOfLogins--;
                break;
            }
        }
    }
    public int GetNumbersOfLogins(){
        return countOfLogins;
    }
}

