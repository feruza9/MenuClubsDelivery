package com.clubapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clubapp.models.Club;

@Repository
public interface ClubRepository extends JpaRepository<Club, Integer> {

}
