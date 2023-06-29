package com.schoolinfo.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.UniqueConstraint;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.schoolinfo.entity.Student;

public interface Studentdao extends JpaRepository<Student, Integer>{

	
	public List<Student> findByName(String name);
	
    public List<Student> findBySchool(String school);
    
    @Query(value="select   MAX(percentage) as percentage, rollno,name,school,fathername from  Student group by rollno order by percentage desc", nativeQuery=true)
    public List<Student> highestpercentage( );
    
    
  @Query(value="select MAX(percentage) as percentage, rollno, name, school , fathername from Student where school=:s group by rollno order by percentage desc" , nativeQuery=true)
    public List<Student> highestpercentageinschool ( @Param("s") String school );
    	
    	
}
