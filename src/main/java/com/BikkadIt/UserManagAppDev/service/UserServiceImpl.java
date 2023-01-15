package com.BikkadIt.UserManagAppDev.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIt.UserManagAppDev.entity.City;
import com.BikkadIt.UserManagAppDev.entity.Country;
import com.BikkadIt.UserManagAppDev.entity.State;
import com.BikkadIt.UserManagAppDev.repository.CityRepo;
import com.BikkadIt.UserManagAppDev.repository.CountryRepo;
import com.BikkadIt.UserManagAppDev.repository.StateRepo;

@Service
public class UserServiceImpl implements UserServiceI {

	@Autowired
	private CountryRepo countryRepo;
	
	@Autowired
	private StateRepo stateRepo;
	
	@Autowired
	private CityRepo cityRepo;

	@Override
	public List<Country> getAllCountries() {
List<Country> findAll = countryRepo.findAll();		
return findAll;
	}

	@Override
	public List<State> getAllStates(int countryId) {
		List<State> findByCountryId = stateRepo.findByCountryId(countryId);
		return findByCountryId;
	}

	@Override
	public List<City> getAllCities(int stateId) {
		List<City> findByStateId = cityRepo.findByStateId(stateId);
		return findByStateId;
	}

	
	
		

}
