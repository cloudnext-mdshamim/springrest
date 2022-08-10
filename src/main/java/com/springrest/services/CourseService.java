package com.springrest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springrest.entities.Course;

@Service
public interface CourseService {
	
	public List<Course> getCourses();
	
	public Optional<Course> getCourse(long courseId);
	
	//public Course addCourse(Course course);
	
	public Course saveUpdateCourse(Course course);
	
	public void deleteCourse(long parseLong);

}
