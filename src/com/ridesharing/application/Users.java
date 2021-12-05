package com.ridesharing.application;

import java.util.ArrayList;
import java.util.List;

public class Users 
{
  String name;
  char sex;
  int age;
  List<Vehicle> vehiclesList=new ArrayList();
  List<Rides> rideList=new ArrayList();
  int ridesTaken=0;
  int ridesAccepted=0;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public char getSex() {
	return sex;
}
public void setSex(char sex) {
	this.sex = sex;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public List<Vehicle> getVehiclesList() {
	return vehiclesList;
}
public List<Rides> getRideList() {
	return rideList;
}
@Override
public String toString() {
	return "Users [name=" + name + ", sex=" + sex + ", age=" + age + ", vehiclesList=" + vehiclesList + ", rideList="
			+ rideList + ", ridesTaken=" + ridesTaken + ", ridesAccepted=" + ridesAccepted + "]";
}


}
