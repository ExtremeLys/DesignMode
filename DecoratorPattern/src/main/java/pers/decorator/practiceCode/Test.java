package pers.decorator.practiceCode;

import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {

        String str = "hello-world--java";
        String consecutiveChars = "-";
        String[] strings = splitString(str, consecutiveChars);
        for (String string : strings) {
            System.out.println("string = " + string);
        }

    }

    public static String[] splitByConsecutiveChars(String str,String consecutiveChars){
        return str.split("(?<="+ Pattern.quote(consecutiveChars) +")(?!"+Pattern.quote(consecutiveChars)+")" );
    }

    public static String[] splitString(String input,String delimiters){
        String pattern = "["+delimiters+"]+";
        return input.split(pattern,-1);
    }
}
