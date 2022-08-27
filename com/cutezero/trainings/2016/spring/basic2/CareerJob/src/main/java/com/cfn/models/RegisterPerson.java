package com.cfn.models;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class RegisterPerson implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
//copied from ...	
	@Size(min=4,max=20) @NotEmpty @NotBlank
	private String uname;
	
	@NotNull @Min(18) @Max(35)	
	private int age;
	
	@NotEmpty @Email
	private String email;
	
	@NotNull
	private Gender gender;
	
	@NotNull @NotBlank
	private String country;
	
	@NotNull
	@Past 
	private Date birthday;
	
	public enum Gender{MALE, FEMALE}
	
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
}
