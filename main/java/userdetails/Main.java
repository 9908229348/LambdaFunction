package userdetails;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Validation firstName = (Pattern::matches);
        Validation lastName = (Pattern::matches);
        Validation email = (Pattern::matches);
        Validation mobileNumber = (Pattern::matches);
        Validation passWord = (Pattern::matches);

        final String FIRST_NAME = "([A-Z][a-zA-Z]{2,})$";
        final String LAST_NAME = "([A-Z][a-zA-Z]{2,})$";
        final String EMAIL = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        final String MOBILE_NUMBER = "^(\\d{2})( )([6-9]{1})(\\d{9})";
        final String PASSWORD = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]{1})(?=\\S+$).{8,}$";


        Validation.printResult(FIRST_NAME,"Sravanthi","FirstName Validation",firstName);
        Validation.printResult(LAST_NAME, "Kallavai","LastName Validation" , lastName);
        Validation.printResult(EMAIL, "kalavaisravanthi98@gmail.com", "Email Validation", email);
        Validation.printResult(MOBILE_NUMBER, "98 9908229348", "Mobile number Validation", mobileNumber);
        Validation.printResult(PASSWORD , "Sravanthi@446", "PassWord Validation",passWord);

    }
}
