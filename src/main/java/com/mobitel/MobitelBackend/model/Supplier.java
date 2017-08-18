package com.mobitel.MobitelBackend.model;

import javax.persistence.*;

@Entity
@Table
public class Supplier 
{
	
@Id
@GeneratedValue
int suppid;

String suppname,suppaddr;

public int getSuppid() {
	return suppid;
}

public void setSuppid(int suppid) {
	this.suppid = suppid;
}

public String getSuppname() {
	return suppname;
}

public void setSuppname(String suppname) {
	this.suppname = suppname;
}

public String getSuppaddr() {
	return suppaddr;
}

public void setSuppaddr(String suppaddr) {
	this.suppaddr = suppaddr;
}



}
