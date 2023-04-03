package dev.ls;

import java.util.List;

public class InvoiceGenerator {
    public Double generate(Customer customer) {
        return customer.getTotalPriceForProcedures();
    }
}
