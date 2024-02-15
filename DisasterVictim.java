package edu.ucalgary.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisasterVictim {
    private static int counter = 0;
    private int ASSIGNED_SOCIAL_ID;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String comments;
    private List<MedicalRecord> medicalRecords;
    private List<FamilyRelation> familyConnections;
    private String ENTRY_DATE;
    private List<Supply> personalBelongings;
    private String gender;

    public DisasterVictim(String firstName, String ENTRY_DATE) {
        this.ASSIGNED_SOCIAL_ID = ++counter;
        this.firstName = firstName;
        if (ENTRY_DATE.charAt(4) != '-' && ENTRY_DATE.charAt(6) != '-') {
            throw new IllegalArgumentException();
        }
        this.ENTRY_DATE = ENTRY_DATE;
        this.medicalRecords = new ArrayList<>();
        this.familyConnections = new ArrayList<>();
        this.personalBelongings = new ArrayList<>();
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    
    public String getComments() {
        return comments;
    }
    
    public MedicalRecord[] getMedicalRecords() {
        return medicalRecords.toArray(new MedicalRecord[0]);
    }
    
    public String getEntryDate() {
        return ENTRY_DATE;
    }
    
    public int getAssignedSocialID() {
        return ASSIGNED_SOCIAL_ID;
    }
    
    public Supply[] getPersonalBelongings() {
        return personalBelongings.toArray(new Supply[0]);
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        if (dateOfBirth.charAt(4) != '-' && dateOfBirth.charAt(6) != '-') {
            throw new IllegalArgumentException();
        }
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setMedicalRecords(MedicalRecord[] medicalRecords) {
        this.medicalRecords = Arrays.asList(medicalRecords);
    }

    public void setPersonalBelongings(Supply[] supplies) {
        this.personalBelongings = Arrays.asList(supplies);
    }

    public FamilyRelation[] getFamilyConnections() {
        return familyConnections.toArray(new FamilyRelation[0]);
    }

    public void setFamilyConnections(FamilyRelation[] relation) {
        this.familyConnections = Arrays.asList(relation);
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void addPersonalBelonging(Supply supply) {
        this.personalBelongings.add(supply);
    }

    public void removePersonalBelonging(Supply supply) {
        this.personalBelongings.remove(supply);
    }

    public void addFamilyConnection(FamilyRelation familyConnection) {
        this.familyConnections.add(familyConnection);
    }

    public void removeFamilyConnection(FamilyRelation familyConnection) {
        this.familyConnections.remove(familyConnection);
    }

    public void addMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecords.add(medicalRecord);
    }
}
