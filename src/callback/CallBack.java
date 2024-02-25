package callback;

import java.util.function.Consumer;

public class CallBack {
    public static void main(String[] args) {

        hello("Faqih Abdul", "Rachman", value -> {
            System.out.println("no lastname provided for user " + value);
        });
    }

    static void hello(String firstName, String lastName, Consumer<String> callback ) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }

}
