package dev.ls;

public class MedicationProcedure implements Procedure {
    private String description;
    private final double PRICE = 150;

    public MedicationProcedure(String description) {
        this.description = description;
    }

    @Override
    public ProcedureType getProcedureType() {
        return ProcedureType.MEDICATION;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return PRICE;
    }
}
