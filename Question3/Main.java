import java.util.*;

public class Main {
    public static void main(String args[])
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		System.out.println("1.Four Wheeler\n2.Two Wheeler\nEnter Vehicle Type:");
		switch(choice)
		{
		case 1: System.out.println("Vehicle Make:");
				String make = sc.next();
				System.out.println("Vehicle Number:");
				String vehicleNumber = sc.next();
				System.out.println("Fuel Type:\n1.Petrol\n2.Diesel");
				int d = sc.nextInt();
				String fuelType = "";
				if (d == 1)
					fuelType = "Petrol";
				else
					fuelType = "Diesel";
				System.out.println("Fuel Capacity:");
				int fuelCapacity = sc.nextInt();
				System.out.println("Engine CC:");
				int cc = sc.nextInt();
				System.out.println("Audio System:");
				String audioSystem =  sc.next();
				System.out.println("Number of Doors:");
				int numberOfDoors = sc.nextInt();
				FourWheeler fw = new FourWheeler(make, vehicleNumber, fuelType, fuelCapacity, cc, audioSystem, numberOfDoors);
				fw.displayMake();
				fw.displayBasicInfo();
				fw.displayDetailInfo();
				break;
		case 2: System.out.println("Vehicle Make:");
				make = sc.next();
				System.out.println("Vehicle Number:");
				vehicleNumber = sc.next();
				System.out.println("Fuel Type:\n1.Petrol\n2.Diesel");
				d = sc.nextInt();
				fuelType = "";
				if (d == 1)
					fuelType = "Petrol";
				else
					fuelType = "Diesel";
				System.out.println("Fuel Capacity:");
				fuelCapacity = sc.nextInt();
				System.out.println("Engine CC:");
				cc = sc.nextInt();
				String ksa = "";
				boolean kickStartAvailable;
				System.out.println("Kick Start Available(yes/no):");
				ksa = sc.next();
				if(ksa.equals("yes")) kickStartAvailable = true;
				else
					kickStartAvailable = false;
				TwoWheeler tw = new TwoWheeler(make, vehicleNumber, fuelType, fuelCapacity, cc, kickStartAvailable);
				tw.displayMake();
				tw.displayBasicInfo();
				tw.displayDetailInfo();


		}
		
	}
}
