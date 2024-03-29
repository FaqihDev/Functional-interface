package ImplementationFunctionToStream;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidationService {

    private boolean isEmailValid (String email) {
        return email.contains("@");
    }

    private boolean isPhoneNumberValid (String phoneNumber) {
        return phoneNumber.startsWith("+62");
    }

    private boolean isAdult (LocalDate dob) {
        return Period.between(dob, LocalDate.now()).getYears() > 16;
    }

    public boolean isVaild (Customer customer){
        return isEmailValid(customer.getEmail()) && isPhoneNumberValid(customer.getPhoneNumber())
                && isAdult(customer.getDob());
    }
}
