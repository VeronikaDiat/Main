package Lesson4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidator {
    String regExPattern;
    public RegexValidator (String pattern)
    {
        regExPattern = pattern;
    }

    public void Validate (String fieldToValidate){
        Pattern pattern = Pattern.compile (regExPattern);
        Matcher matcher = pattern.matcher(fieldToValidate);
        if (matcher.matches()){
            System.out.println("Field is valid");
        } else {
            System.out.println("Field is not valid");
        }

    }
    }

