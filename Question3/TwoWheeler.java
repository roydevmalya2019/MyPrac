
public class TwoWheeler extends Vehicle{
    private boolean kickStartAvailable;

	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}

	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}

	public TwoWheeler() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TwoWheeler(String make, String vehicleNumber, String fuelType,
			int fuelCapacity, int cc, boolean kickStartAvailable) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.kickStartAvailable = kickStartAvailable;
		// TODO Auto-generated constructor stub
	}
	public void displayDetailInfo()
	{
		System.out.println("---Detail Information---");
		System.out.print("Kick Start Available:");
		if(isKickStartAvailable())System.out.println("YES");
		else
			System.out.println("NO");
	}
	
}
