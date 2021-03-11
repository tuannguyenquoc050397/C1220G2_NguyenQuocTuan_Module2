package _17_string_regex.baitap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexClassName {
    private static final String REGEX_NAME="^[C|A|B]\\d{4}[G|H|I|K|L|M]";
    public static boolean validate(String className){
        Pattern pattern=Pattern.compile(REGEX_NAME);
        Matcher matcher=pattern.matcher(className);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] classNames={"A1233A","B2123H","C1220G","asdasd"};
        for (String className: classNames){
            System.out.println(validate(className));
        }

    }
}
