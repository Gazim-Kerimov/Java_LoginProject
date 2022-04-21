import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class LoginCreator {
    static ArrayList<String> listOfLogins = new ArrayList<>();
    static int countOfLogins = 0;

    public void AddLogin() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String inputLogin = reader.readLine();
            if(CheckUnique(inputLogin)){
                listOfLogins.add(inputLogin);
                System.out.println("Your login was successfully created");
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

}
