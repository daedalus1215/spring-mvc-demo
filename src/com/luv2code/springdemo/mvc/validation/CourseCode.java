package com.luv2code.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;


@Constraint(validatedBy = CourseCodeConstraintValidator.class) // our constraint validator we will be using (custom one).
@Target( { ElementType.METHOD, ElementType.FIELD } ) // can use this constraint on a method or a field
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	
	// define default course code
	public String[] value() default "LUV";
	
	// define default error message
	public String message() default "must start with LUV";
	
	
	// define default groups
	public Class<?>[] groups() default {};
	// define default payloads	
	public Class<? extends javax.validation.Payload>[] payload() default {};
}
