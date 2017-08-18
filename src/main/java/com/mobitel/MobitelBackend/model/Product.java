package com.mobitel.MobitelBackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table
public class Product 
{
	
@Id
@GeneratedValue
int prodid;

@NotEmpty(message = "Please enter your Product Name.")
@Size(min = 6, max = 15, message = "Your Product Name must between 6 and 15 characters")
String prodname;

String proddesc;
int catid,suppid,price,quantity;

@Transient
MultipartFile pimage;

public MultipartFile getPimage() 
{
	return pimage;
}

public void setPimage(MultipartFile pimage) 
{
	this.pimage = pimage;
}

public int getProdid() {
	return prodid;
}

public void setProdid(int prodid) {
	this.prodid = prodid;
}

public String getProdname() {
	return prodname;
}

public void setProdname(String prodname) {
	this.prodname = prodname;
}

public String getProddesc() {
	return proddesc;
}

public void setProddesc(String proddesc) {
	this.proddesc = proddesc;
}

public int getCatid() {
	return catid;
}

public void setCatid(int catid) {
	this.catid = catid;
}

public int getSuppid() {
	return suppid;
}

public void setSuppid(int suppid) {
	this.suppid = suppid;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}


}
