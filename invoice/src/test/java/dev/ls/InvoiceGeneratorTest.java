package dev.ls;

import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class InvoiceGeneratorTest {
    @Test
    public void shouldCalculatePriceForOneProcedure() {
        List<Procedure> procedures = List.of(
                new ConsultationProcedure("Consulta ao pediatra")
        );

        Customer customer = new Customer("Liam", procedures);

        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

        double price = invoiceGenerator.generate(customer);

        assertEquals(300.0, price);
    }

    @Test
    public void shouldCalculatePriceForAllProcedures() {
        List<Procedure> procedures = List.of(
                new ConsultationProcedure("Consulta ao pediatra"),
                new MedicationProcedure("Tylenol Bebe"),
                new SurgeryProcedure("Cirurgia de remoção do apendice")
        );

        Customer customer = new Customer("Liam", procedures);

        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

        double price = invoiceGenerator.generate(customer);

        assertEquals(10450.0, price);
    }
}
