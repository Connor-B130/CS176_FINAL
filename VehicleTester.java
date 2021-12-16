package finallabproject;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class VehicleTester 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		ArrayList<Vehicle> arrVeh = new ArrayList<Vehicle>();
		ArrayList<Truck> arrTruck = new ArrayList<Truck>();
		
		Car car1 = new Car("4WD", 4, 5, 120);
		Car car2 = new Car("FWD", 2, 4, 90);
		Car car3 = new Car("RWD", 2, 4, 180);
		
		Truck Truck1 = new Truck(5000, 1000, 5, 100);
		Truck Truck2 = new Truck(4000, 1500, 5, 95);
		Truck Truck3 = new Truck(6000, 2000, 5, 120);
		
		Motorcycle Motorcycle1 = new Motorcycle(false, 1,220);
		Motorcycle Motorcycle2 = new Motorcycle(true, 2,130);
		
		arrVeh.add(car1);
		arrVeh.add(car2);
		arrVeh.add(car3);
		arrVeh.add(Truck1);
		arrVeh.add(Truck2);
		arrVeh.add(Truck3);
		arrVeh.add(Motorcycle1);
		arrVeh.add(Motorcycle2);
		
		arrTruck.add(Truck1);
		arrTruck.add(Truck2);
		arrTruck.add(Truck3);
		
		PrintWriter out = new PrintWriter("output.txt");
		
		for (int i = 0; i< arrVeh.size();i++)
		{
			out.println(arrVeh.get(i));
		}
		out.println("====================");
		
		Collections.sort(arrVeh);
		for (int i = 0; i< arrVeh.size();i++)
		{
			out.println(arrVeh.get(i));
		}
		out.println("====================");
		
		for (int i = 0; i< arrTruck.size();i++)
		{
			out.println(arrTruck.get(i));
		}
		out.println("====================");
		
		Collections.sort(arrTruck, new CompareByPayload());
		for (int i = 0; i< arrTruck.size();i++)
		{
			out.println(arrTruck.get(i));
		}
		out.println("====================");
		
		Collections.sort(arrTruck, new CompareByTow());
		
		for (int i = 0; i< arrTruck.size();i++)
		{
			out.println(arrTruck.get(i));
		}
		out.println("====================");
		out.close();
		
	}

}