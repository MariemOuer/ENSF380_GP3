package edu.ucalgary.oop;

public class MedicalRecord {
    private String treatmentDetails;
    private String dateOfTreatment;
    private Location location;

    public MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment) {
        if (treatmentDetails == null || dateOfTreatment == null || location == null
                || !dateOfTreatment.matches("\\d{4}-\\d{2}-\\d{2}")) {
            throw new IllegalArgumentException("Invalid arguments provided");
        }
        this.treatmentDetails = treatmentDetails;
        this.dateOfTreatment = dateOfTreatment;
        this.location = location;
    }

    public Location getLocation() {
        return this.location;
    }

    public String getTreatmentDetails() {
        return this.treatmentDetails;
    }

    public String getDateOfTreatment() {
        return this.dateOfTreatment;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setTreatmentDetails(String treatmentDetails) {
        this.treatmentDetails = treatmentDetails;
    }

    public void setDateOfTreatment(String dateOfTreatment) {
        if (dateOfTreatment == null || !dateOfTreatment.matches("\\d{4}-\\d{2}-\\d{2}")) {
            throw new IllegalArgumentException("Invalid date format");
        }
        this.dateOfTreatment = dateOfTreatment;
    }
}
