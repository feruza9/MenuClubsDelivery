package com.clubapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Address {

	@Id
	@GeneratedValue(generator = "add_id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "add_id", sequenceName = "address_id")

	private Integer addressId;
	private String streetName;
	private String city;
	private long postcode;
	private String county;

	public Address(String streetName, String city, long postcode, String county) {
		super();
		this.streetName = streetName;
		this.city = city;
		this.postcode = postcode;
		this.county = county;
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", city=" + city + ", postcode=" + postcode + ", county=" + county
				+ "]";
	}

}
