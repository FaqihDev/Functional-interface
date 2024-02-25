package Consumer;

import ImplementationFunctionToStream.Customer;
import ImplementationFunctionToStream.Division;
import ImplementationFunctionToStream.Gender;

import java.time.LocalDate;
import java.util.function.Consumer;

public class _Consumer2 {
    public static void main(String[] args) {
        Customer eli = new Customer(1L,"Nurlaeli","089514523914","elinurlaeli@gmail.com", Gender.FEMALE,"Watching Movie",Division.ACCOUNTING, LocalDate.of(1995,11,21));

        //Sending email
        Consumer<Customer> sendingToEmail = customer -> System.out.println("Hello, " + customer.getName() + " We are sending activation code to email " + customer.getEmail());
        sendingToEmail.accept(eli);





    }
}
