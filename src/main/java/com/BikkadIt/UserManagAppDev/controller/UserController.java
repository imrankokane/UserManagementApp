package com.BikkadIt.UserManagAppDev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIt.UserManagAppDev.entity.City;
import com.BikkadIt.UserManagAppDev.entity.Country;
import com.BikkadIt.UserManagAppDev.entity.State;
import com.BikkadIt.UserManagAppDev.service.UserServiceI;

@RestController
public class UserController {

	@Autowired
	private UserServiceI userServiceI;
	
	@GetMapping(value = "/getAllCounteries" , produces = "application/json")
	public ResponseEntity<List<Country>> getAllCountry(){
		List<Country> allCountries = userServiceI.getAllCountries();
		return new ResponseEntity<>(allCountries,HttpStatus.OK);
		
	}
	
	@GetMapping(value = "/getAllState/{countryId}" , produces = "application/json")
	public ResponseEntity<List<State>> getAllState(@PathVariable int countryId){
		List<State> allStates = userServiceI.getAllStates(countryId);
		return new ResponseEntity<>(allStates,HttpStatus.OK);
		
	}
	
	@GetMapping(value = "/getAllCity/{stateId}",produces = "application/json")
	public ResponseEntity<List<City>> getAllCity(@PathVariable int stateId){
		List<City> allCities = userServiceI.getAllCities(stateId);
		
		return new ResponseEntity<List<City>>(allCities,HttpStatus.OK);
		
	}
	
}
