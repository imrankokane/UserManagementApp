package com.BikkadIt.UserManagAppDev.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIt.UserManagAppDev.entity.State;

@Repository
public interface StateRepo extends JpaRepository<State, Integer> {

	public List<State> findByCountryId(int countryId);
	
}
