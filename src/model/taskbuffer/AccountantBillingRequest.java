package model.taskbuffer;


import model.patient.PawPatient;

public class AccountantBillingRequest extends TaskRequest {

    private double billingAmount;
    private boolean hasInsurance;
    private boolean isInsuranceClaimSettled;

    PawPatient patient;

    public double getBillingAmount() {
        return billingAmount;
    }

    public void setBillingAmount(double billingAmount) {
        this.billingAmount = billingAmount;
    }

    public PawPatient getPatient() {
        return patient;
    }

    public void setPatient(PawPatient patient) {
        this.patient = patient;
    }

    public boolean isHasInsurance() {
        return hasInsurance;
    }

    public void setHasInsurance(boolean hasInsurance) {
        this.hasInsurance = hasInsurance;
    }

    public boolean isIsInsuranceClaimSettled() {
        return isInsuranceClaimSettled;
    }

    public void setIsInsuranceClaimSettled(boolean isInsuranceClaimSettled) {
        this.isInsuranceClaimSettled = isInsuranceClaimSettled;
    }

    @Override
    public String toString() {
        return String.valueOf(billingAmount);
    }

}
