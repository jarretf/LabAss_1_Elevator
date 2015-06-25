package elevator_software;

public class Floor_button {
	
	public Integer floor_no;

	public Floor_button(Integer floor_no) 
	{
		this.floor_no=floor_no;
	}
	
	public void request_elevator(Elevator elevator,Integer request_floor_no)
	{
		Integer current_floor=elevator.current_floor;
		if(elevator.elevator_door.state=="closed")
		{
			if(request_floor_no>current_floor)
			{
				for(Integer i=current_floor;i<=request_floor_no;i++)
				{
					System.out.print(i+"...");
				}
				System.out.println();
				elevator.current_floor=request_floor_no;
			}
			else if(request_floor_no<current_floor)
			{
				for(Integer i=current_floor;i>=request_floor_no;i--)
				{
					System.out.print(i+"...");
				}
				System.out.println();
				elevator.current_floor=request_floor_no;
			}
			else
			{
				System.out.println("Lift is already at the requested floor.");
			}
		}
		
		else
		{
			System.out.println("The lift is currently open");
		}
	}
}
