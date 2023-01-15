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
@Table(name="CITY_MASTER")
public class City {

	@Id
	@Column(name = "CITY_ID")
	private int cityId;
	
	@Column(name="STATE_ID")
	private String stateId;
	
	@Column(name = "CITY_NAME")
	private String cityName;
	
	
	
	
}
