package com.aditya.example;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="alien")
public class Alien {

@Id
int aid;
String aname;
@Override
public String toString() {
	return "Alien [aid=" + aid + ", aname=" + aname + "]";
}
public Alien(int aid, String aname) {
	super();
	this.aid = aid;
	this.aname = aname;
}
public int getAid() {
	return this.aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getAname() {
	return this.aname;
}
public void setAname(String aname) {
	this.aname = aname;
}


}
