package finallabproject;

import java.util.Comparator;

public class CompareByPayload implements Comparator<Truck>
{
	public int compare(Truck obj, Truck obj2)
	{
		if(obj.getPayloadCapacity() > obj2.getPayloadCapacity())
		{
			return 1;
		}
		if(obj.getPayloadCapacity() < obj2.getPayloadCapacity())
		{
			return -1;
		}
		else 
		{
			return 0;
		}

	}
	
}
