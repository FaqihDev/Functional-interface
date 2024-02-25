package Predicate;


import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("089514523914"));
        System.out.println(isPhoneNumberValid("099514523914"));
        System.out.println("Using Function Interface");

        System.out.println(isPhoneNumberValid.test("089514523914"));
        System.out.println(isPhoneNumberValid.test("092993748883"));


        System.out.println(isPhoneNumberValid.and(isContain3).test("089514523914"));
        System.out.println(isPhoneNumberValid.or(isContain3).test("089514523914"));


    }


    static boolean isPhoneNumberValid (String phoneNumber) {
        return phoneNumber.startsWith("08") && phoneNumber.length() == 12;
    }

    static Predicate<String> isPhoneNumberValid = phoneNumber ->
            phoneNumber.startsWith("08") && phoneNumber.length() == 12;

    static Predicate<String> isContain3 = phoneNumber -> phoneNumber.contains("3");


}
