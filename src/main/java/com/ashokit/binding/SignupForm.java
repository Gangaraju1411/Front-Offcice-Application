package com.ashokit.binding;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class SignupForm {

	
	private String name;
	
	private String email;
	
	
	private Long phoneNo;
	
	
	
	
}
