package edu.ucalgary.oop;

public class MedicalRecord {
	private String treatmentDetails;
	private String dateOfTreatment;
    private Location location;
	
	public MedicalRecord(String treatmentDetails, String dateOfTreatment, location Location) {
		this.treatmentDetails = treatmentDetails;
		this.dateOfTreatment = dateOfTreatment;
        this.location = location;
	}

	public String getLocation() {
		return location;
	}

    public String getTreatmentDetails() {
		return treatmentDetails;
	}

    public String geDateOfTreatment() {
		return dateOfTreatment;
	}

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setTreatmentDetails(String treatmentDetails) {
        this.treatmentDetails = treatmentDetails;
    }

    public void setDateOfTreatment(String dateOfTreatment) {
        this.dateOfTreatment = dateOfTreatment;
    }
}
