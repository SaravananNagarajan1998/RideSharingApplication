package com.ridesharing.application;

public class Vehicle
{
  String name;
  String number;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
@Override
public String toString() {
	return "Vehicle [name=" + name + ", number=" + number + "]";
}

}
