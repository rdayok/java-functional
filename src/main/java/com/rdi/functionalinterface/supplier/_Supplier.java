package com.rdi.functionalinterface.supplier;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        //using the imperative style of java
        System.out.println(getDbConnection());

        // Supplier represents a supplier of results
        System.out.println(getDbConnectionSupplier.get());
    }

    public static String getDbConnection() {
        return "jdbc://localhost:5432/users";
    }

    public static Supplier<String> getDbConnectionSupplier = () ->
            "jdbc://localhost:5432/users";

    public static Supplier<List<String>> getDbConnectionUrlsSupplier = ()
            -> List.of("jdbc://localhost:5432/users",
            "jdbc://localhost:5432/clients",
            "jdbc://localhost:5432/admins");
}
