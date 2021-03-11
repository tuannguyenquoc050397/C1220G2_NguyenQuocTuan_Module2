package _17_string_regex.thuchanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private Pattern pattern;
    private Matcher matcher;
    private final String EMAIL_REGEX="^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public EmailExample() {
        pattern=Pattern.compile(EMAIL_REGEX);
    }
    public boolean validateEmail(String s){
        matcher=pattern.matcher(s);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String email="a./sd@gami.com";
        EmailExample emailExample=new EmailExample();
        System.out.println(emailExample.validateEmail(email));
    }
}
