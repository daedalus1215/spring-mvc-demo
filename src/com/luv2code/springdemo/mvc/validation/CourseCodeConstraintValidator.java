package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator 
	implements ConstraintValidator<CourseCode, String> {

	
	private String[] coursePrefix;
	
	
	@Override
	public void initialize(CourseCode constraintAnnotation) {
		this.coursePrefix = constraintAnnotation.value();
		ConstraintValidator.super.initialize(constraintAnnotation);
	}
	

	// theCode is the actual value the user put into their field.
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		boolean result = false;
		
		if (theCode != null) {
			for (String tempPrefix : this.coursePrefix) {
				result = theCode.startsWith(tempPrefix);
						
				if (result) {
					break;
				}
			}
			
		} else {
			result = true;
		}
		
		return result;
	}
}
