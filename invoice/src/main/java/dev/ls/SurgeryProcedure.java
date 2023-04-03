package dev.ls;

public class SurgeryProcedure implements Procedure {
    private String description;
    private final double PRICE = 10_000;

    public SurgeryProcedure(String description) {
        this.description = description;
    }

    @Override
    public ProcedureType getProcedureType() {
        return ProcedureType.SURGERY;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return PRICE;
    }

}
