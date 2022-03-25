package com.clubapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clubapp.models.Club;
import com.clubapp.repository.ClubRepository;
import com.clubapp.serice.ClubService;

@Service

public class ClubServiceImpl implements ClubService {

	@Autowired
	ClubRepository clubRepository;

	@Override
	public Club addClub(Club club) {
		return clubRepository.save(club);

	}

	@Override
	public void updateClub(Club club) {
		clubRepository.save(club);

	}

	@Override
	public Club getClubById(int clubId) {
		return clubRepository.findById(clubId).get();
	}

	@Override
	public void deleteClub(int clubId) {
		clubRepository.deleteById(clubId);

	}

	@Override
	public List<Club> getClubsByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Club> getClubsByMenu(String menuName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Club> getClubsByDelivery(String partnerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Club> getClubsByLocation(String location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Club> getClubsByLocationAndMenu(String location, String menuName) {
		// TODO Auto-generated method stub
		return null;
	}

}
