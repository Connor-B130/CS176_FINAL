package finallabproject;

public class Car extends Vehicle
{
	String driveTrain;
	int doors;
	
	public Car(String driveTrain, int doors,int seats, int topSpeed) 
	{
		super(seats, topSpeed);
		this.driveTrain = driveTrain;
		this.doors = doors;
	}
	
	public int getDoors() 
	{
		return doors;
		
	}

	public void setDoors(int doors) 
	{
		this.doors = doors;
		
	}

	public String getDriveTrain() 
	{
		return driveTrain;
		
	}

	public void setDriveTrain(String driveTrain) 
	{
		this.driveTrain = driveTrain;
		
	}
	
	public String toString() 
	{
		return  "topSpeed: " + super.getTopSpeed() + " seats: " + super.getSeats() + ", driveTrain: " + getDriveTrain() + ", doors: " + getDoors();
		
	}

}
