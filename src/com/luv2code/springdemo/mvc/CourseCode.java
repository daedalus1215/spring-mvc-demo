package com.luv2code.springdemo.mvc;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;

@Constraint(validatedBy=CourseCodeConstraintValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD } ) // can use this constraint on a method or a field
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	
}
