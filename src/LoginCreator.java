import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class LoginCreator {
    private static ArrayList<String> listOfLogins = new ArrayList<>();
    private static int countOfLogins = 0;

    public void AddLogin() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String inputLogin = reader.readLine();
            System.out.println("Please create login №" + (countOfLogins+1) +" :");
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
        reader.close();
    }
    private boolean CheckUnique(String login){
        boolean result = true;
        for(int i = 0; i < listOfLogins.size(); i++){
            if(listOfLogins.get(i).equals(login)){
                result = false;
            }
        }
        return result;
    }
    public void ShowAllLogins(){
        for(int i = 0; i < listOfLogins.size(); i++){
            System.out.println(listOfLogins.get(i));
        }
    }
    public void DeleteLogin(String login){
        for(int i = 0; i < listOfLogins.size(); i++){
            if(listOfLogins.get(i).equals(login)){
                listOfLogins.remove(i);
                System.out.println("Login was successfully deleted");
                break;
            }
        }
    }
    public int GetNumbersOfLogins(){
        return countOfLogins;
    }
}

