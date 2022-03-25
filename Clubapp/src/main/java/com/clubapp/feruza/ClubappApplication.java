package com.clubapp.feruza;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.clubapp.models.Address;
import com.clubapp.models.Club;
import com.clubapp.models.Delivery;
import com.clubapp.models.Menu;
import com.clubapp.serice.ClubService;

@SpringBootApplication
public class ClubappApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ClubappApplication.class, args);
	}

	@Autowired
	ClubService clubService;

	@Override
	public void run(String... args) throws Exception {
		Address address = new Address("ABC Rd", "London", 115, "LON");
		Menu menu1 = new Menu("Pizza", 7);
		Menu menu2 = new Menu("Chicken", 12);
		Set<Menu> menuList = new HashSet<>(Arrays.asList(menu1, menu2));
		Delivery del1 = new Delivery("bolt", 11);
		Delivery del2 = new Delivery("uber", 14);
		Set<Delivery> deliveryList = new HashSet<>(Arrays.asList(del1, del2));
		Club club = new Club(" A2B", address, menuList, deliveryList);

		clubService.addClub(club);

	}

}
