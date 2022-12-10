package model.patient;

import model.insuranceCustomer.InsuranceCustomer;

public class PawPatient {

    private String patientId;
    private String patientLastName;
    private String patientFirstName;
    private String socialSecurityNumber;
    private String patientAge;
    private String contactNumber;
    private String address;
    private String gender;
    private boolean isTreatmentFinished;
    private String appointmentDate;
    private String patientEmail;

    public String getPatientEmail() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }

    private InsuranceCustomer insuranceCustomer;

    public PawPatient() {

    }

    public String getPatientLastName() {
        return patientLastName;
    }

   
    
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(String patientAge) {
        this.patientAge = patientAge;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public InsuranceCustomer getInsuranceCustomer() {
        return insuranceCustomer;
    }

    public void setInsuranceCustomer(InsuranceCustomer insuranceCustomer) {
        this.insuranceCustomer = insuranceCustomer;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void setPatientFirstName(String patientFirstName) {
        this.patientFirstName = patientFirstName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    

    @Override
    public String toString() {
        return String.valueOf(patientId);
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public boolean isIsTreatmentFinished() {
        return isTreatmentFinished;
    }

    public void setIsTreatmentFinished(boolean isTreatmentFinished) {
        this.isTreatmentFinished = isTreatmentFinished;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
    
     public void setPatientLastName(String patientLastName) {
        this.patientLastName = patientLastName;
    }

    public String getPatientFirstName() {

        return patientFirstName;

    }


    
}
