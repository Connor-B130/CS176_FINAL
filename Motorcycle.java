package finallabproject;

public class Motorcycle extends Vehicle
{
	boolean hasWindshield;
	
boolean hasWindShield;
	
	public Motorcycle(boolean hasWindShield,int seats, int topSpeed) 
	{
		super(seats, topSpeed);
		this.hasWindShield = hasWindShield;
		
	}
	
	public boolean isHasWindShield() 
	{
		return hasWindShield;
		
	}
	public void setHasWindShield(boolean hasWindShield) 
	{
		this.hasWindShield = hasWindShield;
		
	}
	
	public String toString() 
	{
		return "seats: " + super.getSeats() + ", topSpeed: " + super.getTopSpeed() + ", hasWindShield: " + hasWindShield;
	}

}
