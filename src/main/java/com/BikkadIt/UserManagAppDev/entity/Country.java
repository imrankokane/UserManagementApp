package com.BikkadIt.UserManagAppDev.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "COUNTRY_MASTER")
public class Country {

	@Id
	@Column(name = "COUNTRY_ID")
	private int countryId;
	
	@Column(name = "COUNTRY_NAME")
	private String countryName;
}
