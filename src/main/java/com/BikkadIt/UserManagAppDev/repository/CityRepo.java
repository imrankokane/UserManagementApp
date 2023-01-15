package com.BikkadIt.UserManagAppDev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIt.UserManagAppDev.entity.City;

@Repository
public interface CityRepo extends JpaRepository<City, Integer> {

	public List<City> findByStateId(int stateId);
}
