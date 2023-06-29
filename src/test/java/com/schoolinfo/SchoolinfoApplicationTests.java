package com.schoolinfo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.schoolinfo.dao.Studentdao;
import com.schoolinfo.entity.Student;
import com.schoolinfo.exception.ResourceNotFoundException;
import com.schoolinfo.servies.Studentimpl;

@SpringBootTest
class SchoolinfoApplicationTests {

	@Autowired
	private Studentimpl servises;
	@MockBean
	private Studentdao repo;
	
	
	@Test
	void getallstudentstest() {
		
		List<Student> studmock = new ArrayList();
		studmock.add(new Student(1,"juned","ups","jahid","60"));
		studmock.add(new Student(2,"sonu","ups","jahid","60"));
		studmock.add(new Student(3,"rinku","ups","jahid","60"));
		
		
		
		when(repo.findAll()).thenReturn(studmock);
		List<Student> serv =servises.getallstudent();
		assertEquals(studmock, serv);
		
	}

	@Test
	void getbyidstudentstest()  {
		int rollno = 1;
		Student studmock = new Student(rollno,"juned","ups","jahid","60");
	    
		//mock
		when(repo.findById(rollno)).thenReturn(Optional.of(studmock));
		//servises
		Student sserivises = servises.getbyid(1);
		//assert
	 assertEquals(studmock, sserivises);
	/*	assertEquals(studmock.getRollno(), sserivises.getRollno());
		assertEquals(studmock.getName(), sserivises.getName());
		assertEquals(studmock.getSchool(), sserivises.getSchool());
		assertEquals(studmock.getFathername(), sserivises.getFathername());
		assertEquals(studmock.getPercentage(), sserivises.getPercentage());*/
		
	}

	@Test
	void getbynametest() {
	
       
       List <Student> studmock = new ArrayList() ;
       studmock.add(new Student(1,"juned","ups","jahid","60"));
       studmock.add(new Student(2,"rinku","ups","jahid","60"));
		//List<Student> studmock = new ArrayList();
		//studmock.add(new Student(1,name,"ups","jahid","60"));
		//studmock.add(new Student(2,name,"ups","jahid","60"));
		//studmock.add(new Student(3,name,"ups","jahid","60"));
    		   String name = "rinku";
		
		
		when(repo.findByName(name)).thenReturn((List<Student>) studmock);
		//.thenReturn(Stream.of(new Student (1,"juned","ups","jahid","60"),new Student (2,"rinku","ups","jahid","60")).collect(Collectors.toList()));
		assertEquals(name ,servises.findByName(name));
	  
		
	 
		//assert
	//assertEquals(name, serv);
		/*assertEquals(studmock.getRollno(), sserivises.getRollno());
		assertEquals(studmock.getName(), sserivises.getName());
		assertEquals(studmock.getSchool(), sserivises.getSchool());
		assertEquals(studmock.getFathername(), sserivises.getFathername());
		assertEquals(studmock.getPercentage(), sserivises.getPercentage());*/
			
	}
     @Test
	 public void studenthighpercentagetest() {
		 
    		List<Student> studmock = new ArrayList();
    		studmock.add(new Student(1,"juned","ups","jahid","60"));
    		studmock.add(new Student(2,"sonu","ups","jahid","70"));
    		studmock.add(new Student(3,"rinku","ups","jahid","50"));
    		
    		
    		
    		when(repo.highestpercentage()).thenReturn(studmock);
    		List<Student> serv =servises.studenthighpercentage();
    		assertEquals(studmock,serv);
    	
    	 
    	 
	 }
	
	
	
	
}
