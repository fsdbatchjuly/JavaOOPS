package com.example.y4jRestAPI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/y4j")
public class APIController {
	
	@Autowired
	private CourseRepository courseRepo;
	
	public APIController(CourseRepository courseRepo) {
		this.courseRepo = courseRepo;
	}
	
	
	@GetMapping("/get_courses")
	public List<CourseModel> fetchCourseList(){
		return courseRepo.findAll();
	}
	
	
	
	
	

}
