package _17_string_regex.baitap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexNumberPhone {
    private static final String REGEX_NUMBERPHONE="[(]\\d{2}[)][-][(][0]\\d{9}[)]";
    public static boolean validate(String numberPhone){
        Pattern pattern = Pattern.compile(REGEX_NUMBERPHONE);
        Matcher matcher=pattern.matcher(numberPhone);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(validate("(84)-(0978489648)"));
        System.out.println(validate("(a8)-(22222222)"));
    }

}
