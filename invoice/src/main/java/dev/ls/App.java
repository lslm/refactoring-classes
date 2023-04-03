package dev.ls;

import java.util.List;

public class App {
    public static void main( String[] args ) {
        List<Procedure> procedures = List.of(
                new ConsultationProcedure("Consulta ao pediatra"),
                new MedicationProcedure("Tylenol Bebe")
        );

        Customer customer = new Customer("Lucas", procedures);

        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

        double price = invoiceGenerator.generate(customer);

        System.out.println(price);
    }
}
