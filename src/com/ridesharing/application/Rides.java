package com.ridesharing.application;
import java.sql.Timestamp;
import java.util.*;
public class Rides
{
  String origin;
  String destination;
  int availableSheet;
  String vehicleName;
  String vehicleNumber;
  Timestamp startTime;
  int ride_duration;
public String getOrigin() {
	return origin;
}
public void setOrigin(String origin) {
	this.origin = origin;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public int getAvailableSheet() {
	return availableSheet;
}
public void setAvailableSheet(int availableSheet) {
	this.availableSheet = availableSheet;
}
public String getVehicleName() {
	return vehicleName;
}
public void setVehicleName(String vehicleName) {
	this.vehicleName = vehicleName;
}
public String getVehicleNumber() {
	return vehicleNumber;
}
public void setVehicleNumber(String vehicleNumber) {
	this.vehicleNumber = vehicleNumber;
}
public Timestamp getStartTime() {
	return startTime;
}
public void setStartTime(Timestamp startTime) {
	this.startTime = startTime;
}
public int getRide_duration() {
	return ride_duration;
}
public void setRide_duration(int ride_duration) {
	this.ride_duration = ride_duration;
}
@Override
public String toString() {
	return "Rides [origin=" + origin + ", destination=" + destination + ", availableSheet=" + availableSheet
			+ ", vehicleName=" + vehicleName + ", vehicleNumber=" + vehicleNumber + ", startTime=" + startTime
			+ ", ride_duration=" + ride_duration + "]";
}

}
