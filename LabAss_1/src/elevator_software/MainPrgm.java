package elevator_software;

public class MainPrgm {

	public static void main(String []args)
	{
		Integer total_floors=7;
		Elevator elevator;
		Floor []floors;
		
		//initializing the floors
		floors=new Floor[total_floors];
		floors[0]=new Floor(0, new Floor_button(0), null);
		for(Integer i=1;i<total_floors-1;i++)
		{
			floors[i]=new Floor(i, new Floor_button(i), new Floor_button(i));
		}
		floors[total_floors-1]=new Floor(total_floors-1, null, new Floor_button(total_floors-1));
		
		elevator=new Elevator(total_floors, 0);
		
		floors[5].up_button.request_elevator(elevator,5);
		elevator.door_toggle();
		floors[2].up_button.request_elevator(elevator,2);
	}
	
}
