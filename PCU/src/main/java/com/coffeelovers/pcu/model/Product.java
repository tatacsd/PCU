package com.coffeelovers.pcu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/***
 * this class  represents the actors (factories) products portfolio
 */
@Entity
@Table(name="product")
public class Product {
	
	/* Variables ----------------------------------------------------------------------------- */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long productID;
	
	@Column(name= "materialsID")
	private long materialsID;
	
	@Column(name= "variableCosts")
	private double variableCosts;
	
	@Column(name= "picture")
	private String picture;
	
	@Column(name= "size")
	private String size;
	
	/* Constructors --------------------------------------------------------------------------- */
	public Product() {}

	public Product(double variableCosts, String picture, String size) {
		this.variableCosts = variableCosts;
		this.picture = picture;
		this.size = size;
	}
	
	/* Getters and Setters -------------------------------------------------------------------- */
	public long getProductID() {
		return productID;
	}

	public void setProductID(long productID) {
		this.productID = productID;
	}

	public long getMaterialsID() {
		return materialsID;
	}

	public void setMaterialsID(long materialsID) {
		this.materialsID = materialsID;
	}

	public double getVariableCosts() {
		return variableCosts;
	}

	public void setVariableCosts(double variableCosts) {
		this.variableCosts = variableCosts;
	}

	public String getPicure() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
}
