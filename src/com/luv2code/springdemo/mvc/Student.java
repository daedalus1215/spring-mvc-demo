package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	
	private String country;
	
	private LinkedHashMap<String, String> countryOptions;
	
	
	private String favoriteLanguage;
	
	private LinkedHashMap<String, String> favoriteLanguageOptions;
	
	
	public Student() {
		this.initCountryOptions();
		this.initFavoriteLanguageOptions();
	}
	
	
	
	private void initCountryOptions() {
		// populate country options: used ISO country code
		this.countryOptions = new LinkedHashMap<>();
		
		this.countryOptions.put("BR", "Brazil");
		this.countryOptions.put("FR", "France");
		this.countryOptions.put("DE", "Germany");
		this.countryOptions.put("IN", "India");
		this.countryOptions.put("US", "United States of America");
	}

	
	private void initFavoriteLanguageOptions() {
		this.favoriteLanguageOptions = new LinkedHashMap<>();
		
		this.favoriteLanguageOptions.put("php", "PHP");
		this.favoriteLanguageOptions.put("java", "Java");
		this.favoriteLanguageOptions.put("C#", "C#");
		this.favoriteLanguageOptions.put("ruby", "Ruby");
	}
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}



	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}



	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}



	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}



	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}	
	
}
