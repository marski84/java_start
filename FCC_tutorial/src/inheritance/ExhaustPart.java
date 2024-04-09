package inheritance;

public class ExhaustPart extends Part {
    private Boolean complianceWithEuropeanStandard;
    public ExhaustPart(String manufacturer, String model, int serialNumber, Boolean complianceWithEuropeanStandard) {
        super(manufacturer, model, serialNumber);
        this.complianceWithEuropeanStandard = complianceWithEuropeanStandard;
    }

    public Boolean getComplianceWithEuropeanStandard() {
        return complianceWithEuropeanStandard;
    }

    public void setComplianceWithEuropeanStandard(Boolean complianceWithEuropeanStandard) {
        this.complianceWithEuropeanStandard = complianceWithEuropeanStandard;
    }
}
