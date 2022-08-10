package com.springrest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.dao.CourseDao;
import com.springrest.entities.Course;

@Service
public class CourseServiceImp implements CourseService{
	
	@Autowired
	private CourseDao courseDao;

	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Optional<Course> getCourse(long courseId) {
		return courseDao.findById(courseId);
	}

	@Override
	public Course saveUpdateCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		//Course entity = courseDao.getOne(parseLong);
		courseDao.deleteById(parseLong);
	}

}