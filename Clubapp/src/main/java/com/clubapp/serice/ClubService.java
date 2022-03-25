package com.clubapp.serice;

import java.util.List;

import com.clubapp.models.Club;

public interface ClubService {

	Club addClub(Club club);

	void updateClub(Club club);

	Club getClubById(int clubId);

	void deleteClub(int clubId);

	List<Club> getClubsByCity(String city);

	List<Club> getClubsByMenu(String menuName);

	List<Club> getClubsByDelivery(String partnerName);

	List<Club> getClubsByLocation(String location);

	List<Club> getClubsByLocationAndMenu(String location, String menuName);

}
