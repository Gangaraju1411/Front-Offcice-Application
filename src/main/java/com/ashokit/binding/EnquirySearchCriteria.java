package com.ashokit.binding;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class EnquirySearchCriteria {
	
	private String course;
	private String status;
	private String classMode;

}
