package elevator_software;

public class Floor 
{

	public Integer floor_no;
	public Floor_button up_button=null;
	public Floor_button down_button=null;
	
	public Floor(Integer floor_no,Floor_button up_button,Floor_button down_button) 
	{
		// TODO Auto-generated constructor stub
		this.floor_no=floor_no;
		this.up_button=up_button;
		this.down_button=down_button;
	}
	
	
}
