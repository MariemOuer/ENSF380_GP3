package edu.ucalgary.oop;

public class MedicalRecord {
	private String treatmentDetails;
	private String dateOfTreatment;
    private Location location;
	
	public MedicalRecord(String treatmentDetails, String dateOfTreatment, Location location) {
		this.treatmentDetails = treatmentDetails;
		this.dateOfTreatment = dateOfTreatment;
        this.location = location;
	}

	public String getLocation() {
		return this.location;
	}

    public String getTreatmentDetails() {
		return this.treatmentDetails;
	}

    public String getDateOfTreatment() {
		return this.dateOfTreatment;
	}

    public Location setLocation(Location location) {
        this.location = location;
    }

    public void setTreatmentDetails(String treatmentDetails) {
        this.treatmentDetails = treatmentDetails;
    }

    public void setDateOfTreatment(String dateOfTreatment) {
        this.dateOfTreatment = dateOfTreatment;
    }
}
