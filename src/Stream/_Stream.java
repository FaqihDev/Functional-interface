package Stream;

import ImplementationFunctionToStream.Customer;
import ImplementationFunctionToStream.Division;
import ImplementationFunctionToStream.Gender;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {


        List<Customer> customerList =
                List.of(new Customer(1L,"Nurlaeli","089514523914","elinurlaeli@gmail.com", Gender.FEMALE,"Watching Movie", Division.ACCOUNTING, LocalDate.of(1995,11,21)),
                        new Customer(2L,"Faqih Abdul Rachman","089514523915","iamfaqih.rochman@gmail.com", Gender.MALE,"Playing Games", Division.IT, LocalDate.of(1995,5,29)),
                        new Customer(3L,"Michael","089514523916","Michael.rochman@gmail.com", Gender.MALE,"Playing Games", Division.IT, LocalDate.of(1995,7,29)),
                        new Customer(4L,"Jordan","089514523917","Jordan@gmail.com", Gender.MALE,"Playing Futsal", Division.IT, LocalDate.of(1995,6,29)),
                        new Customer(5L,"Cindy","089514523918","Cindy@gmail.com", Gender.FEMALE,"Watching Movie", Division.ACCOUNTING, LocalDate.of(1995,12,21))
                        );


        System.out.println("Name");

        customerList.stream()
                .map(Customer::getName)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        boolean containsOnlyFemale = customerList.stream()
                .allMatch(customer -> Gender.FEMALE.equals(customer.getGender()));




    }
}
