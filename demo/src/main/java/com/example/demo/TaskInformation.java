package com.example.demo;

public class TaskInformation {
private int Id;
private String name;
private String Description;
private int duration;
private String Date;


public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
public String getDate() {
	return Date;
}
public void setDate(String date) {
	Date = date;
}

}
