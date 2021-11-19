package com.hccs.advweb;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_information")
public class Product implements Serializable {

	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "image")
	private String image;
	@Column(name = "proName")
	private String proName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public Product(int id, String image, String proName) {
		super();
		this.id = id;
		this.image = image;
		this.proName = proName;
	}

	public Product() {
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", image=" + image + ", proName=" + proName + "]";
	}
	
}
