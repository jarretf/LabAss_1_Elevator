package elevator_software;

public class Elevator 
{
	public Integer total_floors;
	public Integer current_floor;
	public Elevator_door elevator_door;
	
	
	public Elevator(Integer total_floors,Integer current_floor) 
	{
		this.total_floors=total_floors;
		this.current_floor=current_floor;
		elevator_door=new Elevator_door();
	}
	
	public void request_floor(Integer floor)
	{
		if(floor<0 && floor>=total_floors)
		{
			System.out.println("Kindly try a floor between 0 & "+(total_floors-1));
		}
		else if(floor==current_floor)
		{
			System.out.println("You are already at the requested floor.");
		}
		else
		{
			
		}
	}
	
	public void door_toggle()
	{
		elevator_door.door_toggle();
	}
	
}
