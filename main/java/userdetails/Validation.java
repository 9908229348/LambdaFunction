package userdetails;

import java.util.regex.Pattern;

@FunctionalInterface
interface Validation {
    boolean validation(String a, String b);
    static void printResult(String a, String b, String function, Validation fobj){
        System.out.println(function + " is " + fobj.validation(a, b));
    }
}
