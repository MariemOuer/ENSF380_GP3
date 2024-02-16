package edu.ucalgary.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.ucalgary.oop.DisasterVictim;

public class Location {
    private String name;
	private String address;
	private List<DisasterVictim> occupants;
	private List<Supply> supplies;
	
	public Location(String name, String address){
		this.name = name;
		this.address = address;
		this.occupants = new ArrayList<>();
		this.supplies = new ArrayList<>();
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public DisasterVictim[] getOccupants(){
		return occupants.toArray(new DisasterVictim[0]);
	}
	
	public void setOccupants(DisasterVictim[] occupants){
		this.occupants = Arrays.asList(occupants);
	}
	
	public Supply[] getSupplies(){
		return supplies.toArray(new Supply[0]);
	}
	
	public void setSupplies(Supply[] supplies){
		this.supplies = Arrays.asList(supplies);
	}
	
	public void addOccupant(DisasterVictim occupant){
		this.occupants.add(occupant);
	}
	
	public void removeOccupant(DisasterVictim occupant){
		this.occupants.remove(occupant);
	}
	
	public void addSupply(Supply supply){
		this.supplies.add(supply);
	}
	
	public void removeSupply(Supply supply){
		this.supplies.remove(supply);
	}
}

