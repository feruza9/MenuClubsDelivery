package com.clubapp.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Club {

	@Id
	@GeneratedValue(generator = "club_id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "club_id", sequenceName = "club_id")

	private Integer clubId;
	private String clubName;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")

	private Address address;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "club_id")
	private Set<Menu> menuList;

	@ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinTable(name = "club_delivery", joinColumns = @JoinColumn(name = "club_id"), inverseJoinColumns = @JoinColumn(name = "delivery_id"))

	private Set<Delivery> delivery;

	public Club(String clubName, Address address, Set<Menu> menuList, Set<Delivery> delivery) {
		super();
		this.clubName = clubName;
		this.address = address;
		this.menuList = menuList;
		this.delivery = delivery;
	}

	@Override
	public String toString() {
		return "Club [clubName=" + clubName + ", address=" + address + ", menuList=" + menuList + ", delivery="
				+ delivery + "]";
	}

	public Club get() {
		// TODO Auto-generated method stub
		return null;
	}

}
