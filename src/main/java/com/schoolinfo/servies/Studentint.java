package com.schoolinfo.servies;

import java.util.List;
import java.util.Optional;

import com.schoolinfo.entity.Student;

public interface Studentint {
	
	public List<Student> getallstudent();
	
    public Student addallstudent(Student student);
    
    public List<Student> findByName(String name);
    
    public List <Student> findBySchool(String school);
   
    
    
    
    
    public List<Student> studenthighpercentage();
    
    public List<Student> studentschoolhighpercntage(String School );
    
    public void deletestudent(int rollno);
    
    public Student updateallstudent(Student student);
    
    public Student getbyid(int rollno);
    
}
