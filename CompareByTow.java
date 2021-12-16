package finallabproject;

import java.util.Comparator;

public class CompareByTow implements Comparator<Truck>
{
	
	public int compare(Truck obj, Truck obj2)
	{
			if(obj.getTowCapacity() > obj2.getTowCapacity())
			{
				return 1;
			}
			if(obj.getTowCapacity() < obj2.getTowCapacity())
			{
				return -1;
			}
			else 
			{
				return 0;
			}
	
	}
}