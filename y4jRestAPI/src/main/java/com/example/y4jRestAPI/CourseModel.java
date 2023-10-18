package com.example.y4jRestAPI;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="course_details")
public class CourseModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int course_Id;
	
	private String name;
	
	private String short_form;

	public int getCourse_Id() {
		return course_Id;
	}

	public void setCourse_Id(int course_Id) {
		this.course_Id = course_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShort_form() {
		return short_form;
	}

	public void setShort_form(String short_form) {
		this.short_form = short_form;
	}
	
	
	

}
