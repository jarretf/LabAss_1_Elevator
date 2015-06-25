package elevator_software;

public class Elevator_door {

	public String state;
	
	public Elevator_door() {
		// TODO Auto-generated constructor stub
		state="closed";
	}
	
	public void door_toggle()
	{
		if(state=="closed")
		{
			state="open";
			System.out.println("Opening door...");
		}
		else
		{
			state="closed";
			System.out.println("Closing door...");
		}
	}
}
