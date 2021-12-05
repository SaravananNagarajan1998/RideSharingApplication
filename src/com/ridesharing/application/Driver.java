package com.ridesharing.application;

public class Driver {

	public static void main(String[] args)
	{
	 final ApplicationValidator validApplication=ApplicationValidator.getInstance();
	 
	 //Add users and Vehicles
	 validApplication.addUser("Rohan", 'M', 36);
	 validApplication.addVehicle("Rohan", "Swift", "KA-01-12345");
	 validApplication.addUser("Shashank", 'M', 29);
	 validApplication.addVehicle("Shashank", "Baleno", "TS-05-62395");
	 validApplication.addUser("Nandini", 'F', 29);
	 validApplication.addUser("Shipra", 'F', 27);
	 validApplication.addVehicle("Shipra", "Polo", "KA-05-41491");
	 validApplication.addVehicle("Shipra", "Scooty", "KA-12-12332");
	 validApplication.addUser("Gaurav", 'M', 29);
	 
	 validApplication.offerRide("Rohan", "Hydrebad", "Bangalore", 1, "Swift", "KA-01-12345", "2019-01-25 08:00:00", 13);
	 validApplication.offerRide("Shipra", "Bangalore", "Mysore", 1, "Scooty", "KA-12-12332", "2019-01-29 18:00:00", 10);
	 validApplication.offerRide("Shipra", "Bangalore", "Mysore", 2, "Polo", "KA-05-41491", "2019-01-30 18:00:00", 4);
	 validApplication.offerRide("Shashank", "Hydrebad", "Bangalore", 2, "Baleno", "TS-05-62395", "2019-01-27 10:00:00", 14);
	
	 
	 validApplication.selectRide("Nandini", "Bangalore", "Mysore", "FastestRide");
	 validApplication.selectRide("Gaurav", "Bangalore", "Mysore", "EarliestRide");
	 validApplication.selectRide("Shasank", "Mumbai", "Bangalore", "FastestRide");
	 validApplication.selectRide("Rohan", "Hydrebad", "Bangalore", "FastestRide");
	 
	 
	 validApplication.Summary();
	}

}
