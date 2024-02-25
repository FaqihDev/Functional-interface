package Consumer;


import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer faqih =  new Customer("Faqih Abdul Rachman", "089514523914");
        greetCustomer(faqih);
        System.out.println(faqih);


        //Take one argument and no producing result
        Consumer<Customer> greetCustomer = customer ->
            System.out.println("Hello" + customer.getCustomerName()
            + ", Thanks for registering phone number " + customer.customerPhone);

        //Take 2 argument and producing no result
        BiConsumer<Customer, Boolean> greetCustomerV2 = (customer,showPhoneNumber) ->
                System.out.println("Hello" + customer.getCustomerName()
                + ", Thanks for registering phone number " +(showPhoneNumber ? customer.customerPhone : "********"));

        System.out.println("Consumer");
        greetCustomer.accept(faqih);
        System.out.println("BiConsumer");
        greetCustomerV2.accept(faqih,false);
    }

    static class Customer {
        private final String customerName;

        private final String customerPhone;

        public Customer(String customerName, String customerPhone) {
            this.customerName = customerName;
            this.customerPhone = customerPhone;
        }

        public String getCustomerName() {
            return customerName;
        }

        public String getCustomerPhone() {
            return customerPhone;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "customerName='" + customerName + '\'' +
                    ", customerPhone='" + customerPhone + '\'' +
                    '}';
        }
    }

    static void greetCustomer (Customer customer) {
        System.out.println("Hello" + customer.getCustomerName() +
        ", thank for registering" + customer.customerPhone);

    }


}
