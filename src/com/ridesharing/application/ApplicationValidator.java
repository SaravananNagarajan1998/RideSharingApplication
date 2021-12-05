package com.ridesharing.application;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplicationValidator
{
  private static ApplicationValidator validator=null;
  Map<String,Users> userMap=new HashMap();
  public static ApplicationValidator getInstance()
  {
	 if(validator==null)
	 {
		 validator=new ApplicationValidator();
	 }
	 return validator;
  }
  
  public void addUser(String name,char sex,int age)
  {
	  Users user=new Users();
	  user.setName(name);
	  user.setSex(sex);  //Need to handle for other chars
	  user.setAge(age);
	  userMap.put(name, user);  //Need to handle for multiple user with same name
  }
  public void addVehicle(String userName,String vehicleName,String vehicleNumber)
  {
	//if the user is not present means need to block
	  
	  Users user=userMap.get(userName);
	  Vehicle vehicle=new Vehicle();
	  vehicle.setName(vehicleName);
	  vehicle.setNumber(vehicleNumber);
	  user.vehiclesList.add(vehicle);
  }
  public void offerRide(String userName,String origin,String destination,int availableSheet,String vehicleName,String vehicleNumber,String timeVal,int duration)
  {
	 //if the user is not present means need to block
	  
	  Users user=userMap.get(userName);
	  Rides ride=new Rides();
	  ride.setOrigin(origin);
	  ride.setDestination(destination);
	  ride.setAvailableSheet(availableSheet);
	  ride.setVehicleName(vehicleName);
	  ride.setVehicleNumber(vehicleNumber);
	  Timestamp timeStamp=Timestamp.valueOf(timeVal);
	  ride.setStartTime(timeStamp);
	  ride.setRide_duration(duration);
	  user.rideList.add(ride);
  }
  public Rides selectRide(String userName,String origin,String destination,String modeOfRide)
  {
	  return takenRides(userName,origin,destination,modeOfRide);
  }
  
  public Rides takenRides(String userName,String origin,String destination,String modeOfRide)
  {
	  long duration=Long.MAX_VALUE;
	  Rides toRet=null;
	  Users userObj=null;
	  for(String user : userMap.keySet())
	  {
		  if(!user.equalsIgnoreCase(userName))
		  {
			 List<Rides> ridesOffered=userMap.get(user).rideList;
			 for(Rides rides : ridesOffered)
			 {
				 if(rides.getOrigin().equalsIgnoreCase(origin)&&rides.getDestination().equalsIgnoreCase(destination))
				 {
					 if(modeOfRide.equalsIgnoreCase("fastestride"))
					 {
					    if(rides.getRide_duration()<duration)
					     {
						 userObj=userMap.get(user);
						 toRet=rides;
						 duration=rides.getRide_duration();
					     }
					 }
					 else
					 {
						 //long val=rides.getStartTime().getTime()+rides.getRide_duration()*3600000;
						// System.out.println(val+"   "+duration);
						 if(rides.getStartTime().getTime()+rides.getRide_duration()*3600000<duration)
						 {
							 userObj=userMap.get(user);
							 toRet=rides;
							 duration=rides.getStartTime().getTime()+rides.getRide_duration()*3600000;
						 } 
					 }
				 }
			 }
		  }
	  }
	  if(userObj!=null)
	  {
		  userObj.ridesAccepted++;
		  userMap.get(userName).ridesTaken++;
	  }
	 
	  return toRet;
  }
  
  public void Summary()
  {
	  for(String user: userMap.keySet())
	  {
		  System.out.println(userMap.get(user));
	  }
  }
}
