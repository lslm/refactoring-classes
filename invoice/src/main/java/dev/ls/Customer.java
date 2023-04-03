package dev.ls;

import java.util.List;

public class Customer {
    private String name;
    private List<Procedure> procedures;

    public Customer(String name, List<Procedure> procedures) {
        this.name = name;
        this.procedures = procedures;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Procedure> getProcedures() {
        return procedures;
    }

    public void setProcedures(List<Procedure> procedures) {
        this.procedures = procedures;
    }

    public double getTotalPriceForProcedures() {
        double totalPrice = 0.0;

        for (Procedure procedure : procedures) {
            totalPrice += procedure.getPrice();
        }

        return totalPrice;
    }
}
