package model.taskbuffer;

import model.patient.PawPatient;
import model.userAccount.User;

public class PawPatientTreatmentWorkRequest extends TaskRequest {

    private String labResult;
    private User labAssistant;
    private String labTestMessage;
    private String prescription;
    private String registrationDate;
    private String reasonForVisit;
    private PawPatient patient;
    private String labTestType;
    private double billAmount;
    private User assignedDoctor;

    public PawPatientTreatmentWorkRequest(String Date, String reasonForVisit, PawPatient patient) {
        this.registrationDate = Date;
        this.reasonForVisit = reasonForVisit;
        this.patient = patient;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String Date) {
        this.registrationDate = Date;
    }

    public String getReasonForVisit() {
        return reasonForVisit;
    }

    public void setReasonForVisit(String reasonForVisit) {
        this.reasonForVisit = reasonForVisit;
    }

    public PawPatient getPatient() {
        return patient;
    }

    public void setPatient(PawPatient patient) {
        this.patient = patient;
    }

    public String getLabTestType() {
        return labTestType;
    }

    public void setLabTestType(String labTestType) {
        this.labTestType = labTestType;
    }

    public String getLabResult() {
        return labResult;
    }

    public void setLabResult(String labResult) {
        this.labResult = labResult;
    }

    public User getLabAssistant() {
        return labAssistant;
    }

    public void setLabAssistant(User labAssistant) {
        this.labAssistant = labAssistant;
    }

    public String getLabTestMessage() {
        return labTestMessage;
    }

    public void setLabTestMessage(String labTestMessage) {
        this.labTestMessage = labTestMessage;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public User getAssignedDoctor() {
        return assignedDoctor;
    }

    public void setAssignedDoctor(User assignedDoctor) {
        this.assignedDoctor = assignedDoctor;
    }

    @Override
    public String toString() {
        return reasonForVisit;
    }

}
