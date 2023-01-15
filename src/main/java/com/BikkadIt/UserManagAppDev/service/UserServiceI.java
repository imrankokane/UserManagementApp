package com.BikkadIt.UserManagAppDev.service;

import java.util.List;

import com.BikkadIt.UserManagAppDev.entity.City;
import com.BikkadIt.UserManagAppDev.entity.Country;
import com.BikkadIt.UserManagAppDev.entity.State;

public interface UserServiceI {

	// get all countrys
	
	public List<Country> getAllCountries();

    public List<State> getAllStates(int countryId);
	
    public List<City> getAllCities(int stateId);
}
