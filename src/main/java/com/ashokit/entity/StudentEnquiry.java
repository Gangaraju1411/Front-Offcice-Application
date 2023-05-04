package com.ashokit.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Entity
@Data
public class StudentEnquiry {

	@Id
	@GeneratedValue
	private  Integer enquiryId ;
	
	
	private String studentName;
	private Long studentNumber;
	private String classMode;
	private String course;
	private String status;
	
	@CreationTimestamp
	private LocalDate createdDate;
	@UpdateTimestamp
	private LocalDate endDate;
	
	@ManyToOne(cascade=CascadeType.ALL )
	@JoinColumn(name="userId")
	private UserDetails userDetails;


	

	
	
	
	
	
	
	
	
	
}
