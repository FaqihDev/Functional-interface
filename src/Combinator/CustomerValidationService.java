package Combinator;

import ImplementationFunctionToStream.Customer;

import java.time.LocalDate;
import java.time.Period;


public class CustomerValidationService {


    private boolean isEmailValid(String email) {
        return email.contains("@gmail");
    }

    private boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("+62") && phoneNumber.length() >= 11;
    }

    private boolean isAdult(LocalDate dob) {
        return Period.between(dob,LocalDate.now()).getYears() > 16;
    }

    private boolean isUserValid (Customer customer) {
        return isEmailValid(customer.getEmail()) &&
                isPhoneNumberValid(customer.getPhoneNumber()) &&
                isAdult(customer.getDob());
    }
}
