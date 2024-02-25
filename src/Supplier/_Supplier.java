package Supplier;

import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        System.out.println(getJdbcUrl());
        System.out.println(getJdbcUrlSupplier.get());
    }


    static String getJdbcUrl () {
        return "jdbc://localhost::8080/users";
    }

   static Supplier<String> getJdbcUrlSupplier = () -> "jdbc://localhost::8080/users";
}
