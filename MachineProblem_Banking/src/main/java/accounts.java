import java.awt.List;
import java.util.ArrayList;

public class accounts{
    
    //NOTE: Sir sorry late na po namin na realize na pwede pala gamitan ng array sa part na toh para 
    //makagawa ng multiple accounts na ma-aaccess via pag retrieve using yung index ng array. :<
    
    //user info
    public static String last;
    public static String first;
    public static String mi;
    public static String birthdate;
    public static String address;
    public static String email;
    public static String contact;
    public static String user_id;
    public static String pin;
    public static String confirm_pin;
    public static int gender;
    public static String acc_type;
    public static double deposit;
    
    //months
    public static int months = 0;
    public static int months_accumulate;
    
    //transaction history
    public static ArrayList<String> history = new ArrayList<String>();
    
    //METHODS
    public static String getFullName(){
        return first + " " + mi + " " + last;
    }
    
    public static String pronoun(){
        switch(gender)
        {
            case 1:
                return "Welcome Mr. " + last + "!";
            case 2:
                return "Welcome Ms. " + last + "!";
            case 3:
                return "Welcome Mx. " + last + "!";
        }
        return null;
    }
}