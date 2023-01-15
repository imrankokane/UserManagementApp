package com.BikkadIt.UserManagAppDev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIt.UserManagAppDev.entity.Country;

@Repository
public interface CountryRepo extends JpaRepository<Country, Integer> {

}
