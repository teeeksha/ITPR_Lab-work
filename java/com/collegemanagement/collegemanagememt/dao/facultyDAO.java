package com.collegemanagement.collegemanagememt.dao;
import com.collegemanagement.collegemanagement.model.faculty;
import java.util.ArrayList;
public interface facultyDAO {
	
		//method for inserting new facultydata
		int save(faculty facultydata);
		
		//method to fetch all course list
		ArrayList<faculty> findAll();
		
		//method to fetch a particular course
		faculty findByCourseId(String courseId);
		
	}

