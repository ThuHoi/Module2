package baitap.validateClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameExample {
    private static final String CLASSNAME_REGEX = "^([CPA])[0-9]{4}([GHIKLM])$";

    public ClassNameExample() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASSNAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
