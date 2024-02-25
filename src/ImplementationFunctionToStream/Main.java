package ImplementationFunctionToStream;

import java.time.LocalDate;

import static Combinator.CustomerRegistrationValidator.isEmailValid;
import static Combinator.CustomerRegistrationValidator.isAnAdult;
import static Combinator.CustomerRegistrationValidator.isPhoneNumberValid;


public class Main {

    public static void main(String[] args) {

        Customer faqih = new Customer(1L, "Faqih Abdul Rachman", "089514523914", "iamfaqih.rochman@gmail.com", Gender.MALE, "Coding", Division.IT, LocalDate.of(1995, 05, 29));
        Customer eli = new Customer(2L, "Eli Nurlaeli", "089514523915", "nurlaeli@gmail.com", Gender.FEMALE, "Playing socmed", Division.IT, LocalDate.of(1995, 12, 22));
        Customer abul = new Customer(3L, "Khoirunnas Syahrul", "089514523916", "Abul@gmail.com", Gender.MALE, "Playing socmed", Division.HR, LocalDate.of(1999, 12, 8));
        Customer hafidh = new Customer(4L, "Hafid Maulana R", "089514523917", "hafid@gmail.com", Gender.MALE, "Otomotif", Division.HR, LocalDate.of(1993, 05, 29));
        Customer femi = new Customer(5L, "Femi", "089514523918", "femi@gmail.com", Gender.FEMALE, "Cooking", Division.SUPPORT, LocalDate.of(1966, 05, 29));
        Customer supari = new Customer(6L, "Suparni", "089514523919", "mysuparni@gmail.com", Gender.FEMALE, "Cooking", Division.SUPPORT, LocalDate.of(1991, 05, 29));
        Customer paiman = new Customer(7L, "Paiman", "089514523910", "paiman@gmail.com", Gender.MALE, "Sport", Division.FINANCE, LocalDate.of(1960, 05, 29));
        Customer yasir = new Customer(8L, "Yasir", "089514523911", "yasir@gmail.com", Gender.MALE, "Sport", Division.FINANCE, LocalDate.of(2016, 05, 29));
        Customer kholid = new Customer(9L, "Kholid", "089514523912", "kholid@gmail.com", Gender.MALE, "Sport", Division.ACCOUNTING, LocalDate.of(2018, 05, 29));
        Customer kaindra = new Customer(10L, "Kaindra", "089514523913", "kaindra@gmail.com", Gender.MALE, "Otomotif", Division.ACCOUNTING, LocalDate.of(2021, 05, 29));

        //if valid we can store to db
        ValidationResult result =  isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(faqih);

        System.out.println(result);

        if (result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }
    }
}
