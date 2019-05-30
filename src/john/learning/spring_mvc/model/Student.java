package john.learning.spring_mvc.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	private LinkedHashMap<String, String> favoriteLanguageOptions;
	private ArrayList<String> OSes;
	private String favoriteLanguage;
	private ArrayList<String> favoriteOSes;
	
	public Student() {
		countryOptions = new LinkedHashMap<String, String>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("IT", "Italy");
		countryOptions.put("NL", "Netherlands");
		countryOptions.put("Other", "Other");
		favoriteLanguageOptions = new LinkedHashMap<String, String>();
		favoriteLanguageOptions.put("Java", "Java");
		favoriteLanguageOptions.put("PHP", "PHP");
		favoriteLanguageOptions.put("JavaScript", "JavaScript");
		favoriteLanguageOptions.put("C#", "C#");
		OSes = new ArrayList<String>();
		OSes.add("Windows");
		OSes.add("IOS");
		OSes.add("GNU/Linux");
		OSes.add("FreeBSD");
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

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}

	public void setFavoriteLanguageOptions(LinkedHashMap<String, String> favoriteLanguagesOptions) {
		this.favoriteLanguageOptions = favoriteLanguagesOptions;
	}

	public ArrayList<String> getOSes() {
		return OSes;
	}

	public void setOSes(ArrayList<String> OSes) {
		this.OSes = OSes;
	}

	public ArrayList<String> getFavoriteOSes() {
		return favoriteOSes;
	}

	public void setFavoriteOSes(ArrayList<String> favoriteOSes) {
		this.favoriteOSes = favoriteOSes;
	}
	
}
