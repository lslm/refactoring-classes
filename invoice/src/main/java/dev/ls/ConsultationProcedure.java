package dev.ls;

public class ConsultationProcedure implements Procedure {
    private String description;
    private final double PRICE = 300;

    public ConsultationProcedure(String description) {
        this.description = description;
    }

    @Override
    public ProcedureType getProcedureType() {
        return ProcedureType.CONSULTATION;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return PRICE;
    }
}
