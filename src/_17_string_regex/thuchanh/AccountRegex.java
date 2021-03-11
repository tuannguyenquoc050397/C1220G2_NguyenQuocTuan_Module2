package _17_string_regex.thuchanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountRegex {
    private static final String ACCOUNT_REGEX="^[_a-z0-9]{6,}$";
    public AccountRegex(){

    }
    public static boolean validate(String accountName){
        Pattern pattern=Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher=pattern.matcher(accountName);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String accountName="ads";
        System.out.println(validate(accountName));
    }
}
