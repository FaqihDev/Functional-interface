package Combinator;

import ImplementationFunctionToStream.Customer;
import ImplementationFunctionToStream.ValidationResult;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static ImplementationFunctionToStream.ValidationResult.*;

public interface CustomerRegistrationValidator extends Function<Customer, ValidationResult> {

    //Check email if email is valid
    static CustomerRegistrationValidator isPhoneNumberValid() {
        return customer -> customer.getPhoneNumber().startsWith("+62") || customer.getPhoneNumber().startsWith("0")
                ? SUCCESS : PHONE_NUM_NOT_VALID;
    }

    static CustomerRegistrationValidator isEmailValid() {
        return customer -> customer.getEmail().contains("@") && customer.getEmail().endsWith(".com")
                ? SUCCESS : EMAIL_NOT_VALID;
    }

    static CustomerRegistrationValidator isAnAdult() {
        return customer -> Period.between(customer.getDob(), LocalDate.now())
                .getYears() > 17 ? SUCCESS : NOT_AN_ADULT;
    }

    default CustomerRegistrationValidator and (CustomerRegistrationValidator other) {
        return customer -> {
            ValidationResult result = this.apply(customer);
            return result.equals(SUCCESS) ? other.apply(customer) : result;
        };
    }
}
