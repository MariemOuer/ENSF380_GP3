package edu.ucalgary.oop;

public class Supply {
	private String type;
	private int quantity;
	
	public Supply(String type, int quantity) {
		this.type = type;
		this.quantity = quantity;
	}

	public String getType() {
		return type;
	}

    public String getQuantity() {
		return type;
	}

    public void setType(String type) {
        this.type = type;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
