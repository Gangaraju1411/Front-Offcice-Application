package com.ashokit.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class UserDetails {

	@Id
	@GeneratedValue
	private Integer userId;
	
	@Column(name = "Name")
	private String name;
	
	
	@Column(name = "Email")
	private String email;
	
	
	
	@Column(name="Phone_Number")
	private Long phoneNo;
	
	@Column(name="Password")
	private String password;
	
	
	@Column(name = "Account_Status")
	private String accountStatus;
	
	
	@OneToMany(cascade = CascadeType.ALL,fetch =FetchType.EAGER,mappedBy ="userDetails")
	private List<StudentEnquiry> studentEnquiry ;

}
