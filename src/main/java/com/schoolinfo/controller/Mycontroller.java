package com.schoolinfo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.schoolinfo.entity.Student;
import com.schoolinfo.other.Apiresponse;
import com.schoolinfo.servies.Studentimpl;

@RestController
public class Mycontroller {

	@Autowired
	private Studentimpl servises;
	
	
	@GetMapping("/Students")
	public ResponseEntity< List<Student>> getallstudents()
	{
		List<Student> stud= this.servises.getallstudent();
		if(stud.size()>0)
		{
			return new ResponseEntity<List<Student>>(stud, HttpStatus.ACCEPTED);
		}
		else {
		return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
	}
	
	@PostMapping("/Students")
	public ResponseEntity<Student> addallstudent(@RequestBody Student student) {
		Student stud = this.servises.addallstudent(student);
		return new ResponseEntity<Student>(stud, HttpStatus.ACCEPTED);
	}
	
	
	@GetMapping("Student/rollno/{rollno}")
	public ResponseEntity <Student>getbyid(@PathVariable int rollno) {
		Student stud =this.servises.getbyid(rollno);
	
			return new ResponseEntity<Student>(stud,HttpStatus.ACCEPTED);
	}
	
	
	
	@GetMapping("/Students/{name}")
	public ResponseEntity <List <Student>> studentfindbyname(@PathVariable String  name){
		List<Student >stud =  this.servises.findByName(name);
	if(stud.size()>0) {
		return new ResponseEntity <List <Student>>(stud, HttpStatus.OK);
	}
	else {
		return new  ResponseEntity(HttpStatus.NO_CONTENT);
	}
	}
	
	@GetMapping("/Students/school/{school}")
	public ResponseEntity<List<Student>> studentfindbyschool(@PathVariable String school){
		List <Student> stud =this.servises.findBySchool(school);
		return new ResponseEntity<List<Student>>(stud, HttpStatus.OK);
}
	
	@GetMapping("/Students/highpercentage/percentage")
	
	public ResponseEntity <List<Student>> studenthighpercentage(){
		List<Student> stud =this.servises.studenthighpercentage();
		return new ResponseEntity<List<Student>>(stud, HttpStatus.OK);
	}
	
	@GetMapping("/Students/school/percentage/{school}")
	public ResponseEntity<List<Student>> studentschoolhighpercntage( @PathVariable String school){
		List<Student> stud =this.servises.studentschoolhighpercntage(school);
		return new ResponseEntity<List<Student>>(stud, HttpStatus.OK);
	}
	
	@DeleteMapping("Student/delete/{rollno}")
	public ResponseEntity<Apiresponse> deletestudent(@PathVariable int rollno) {
		this.servises.deletestudent(rollno);
		return new ResponseEntity<Apiresponse>(new Apiresponse("user delete",true),HttpStatus.OK);
	}
	
	@PutMapping("/Students/update")
	public ResponseEntity< Student> updateallstudent(@RequestBody Student student) {
		Student stud=this.servises.updateallstudent(student);
		return new ResponseEntity<Student>(stud, HttpStatus.ACCEPTED);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
