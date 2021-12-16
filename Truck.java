package finallabproject;

public class Truck extends Vehicle
{
	int payloadCapacity;
	int towCapacity;
	
	public Truck(int towCapacity, int payloadCapacity, int seats, int topSpeed)
	{
		super(seats, topSpeed);
		this.towCapacity = towCapacity;
		this.payloadCapacity = payloadCapacity;
		
	}
	public int getPayloadCapacity() 
	{
		return payloadCapacity;
	
	}
	public void setPayloadCapacity(int payloadCapacity) 
	{
		this.payloadCapacity = payloadCapacity;
		
	}
	public int getTowCapacity() 
	{
		return towCapacity;
		
	}
	public void setTowCapacity(int towCapacity) 
	{
		this.towCapacity = towCapacity;
		
	}
	public String toString() 
	{
		return "seats: " + super.getSeats() + ", topSpeed: " + super.getTopSpeed() + ", towCapacity: " + towCapacity + ", payloadCapacity: " + payloadCapacity;
		
	}
}
