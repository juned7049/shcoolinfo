package com.schoolinfo.servies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoolinfo.dao.Studentdao;
import com.schoolinfo.entity.Student;
import com.schoolinfo.exception.ResourceNotFoundException;
@Service
public class Studentimpl implements Studentint {
   
	@Autowired
	private Studentdao database;
	
	@Override
	public List<Student> getallstudent() {
		// TODO Auto-generated method stub
		return database.findAll();
	}
	@Override
	public Student addallstudent(Student student) {
		// TODO Auto-generated method stub
		database.save(student);
		return student;
	}
	@Override
	public List<Student> findByName(String name) {
		// TODO Auto-generated method stub
		
		return  database.findByName(name);
		}
		
	
	@Override
public List< Student> findBySchool(String school) {
// TODO Auto-generated method stub
		return database.findBySchool(school);
		}
	
	@Override
	public List<Student> studenthighpercentage() {
		// TODO Auto-generated method stub
		return database.highestpercentage();
	}
	@Override
	public List<Student> studentschoolhighpercntage(String School) {
		//// TODO Auto-generated method stub
		return database.highestpercentageinschool(School);
	}
	@Override
	public void deletestudent(int rollno) {
		// TODO Auto-generated method stub
		database.deleteById(rollno);
	}
	@Override
	public Student updateallstudent(Student student) {
		// TODO Auto-generated method stub
		return database.save(student);
	}
	@Override
	public Student getbyid(int rollno) {
		// TODO Auto-generated method stub
		return database.findById(rollno).orElseThrow(() ->  new ResourceNotFoundException("Student", "id", rollno));
	}
	
	
	
	

}
