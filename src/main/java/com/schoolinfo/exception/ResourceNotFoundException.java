package com.schoolinfo.exception;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.schoolinfo.entity.Student;

public class ResourceNotFoundException extends RuntimeException implements List<Student> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String resname;
	private String fieldname;
	private String fieldvalue;

	private String fieldname2;

	private String resname2;

	private int rollno;
	public ResourceNotFoundException(String resname, String fieldname, String fieldvalue) {
		super(String.format("%s not found %s:%s", resname,fieldname,fieldvalue));
		this.resname = resname;
		this.fieldname = fieldname;
		this.fieldvalue = fieldvalue;
	}

	
	
	
	
	
	public ResourceNotFoundException(String resname2, String fieldname2, int rollno) {
		// TODO Auto-generated constructor stub
		super(String.format("%s not found %s:%s", resname2,fieldname2,rollno));
		this.resname2 = resname2;
		this.fieldname2 = fieldname2;
		this.rollno = rollno;
		
	}
	
	






	public String getFieldname2() {
		return fieldname2;
	}






	public void setFieldname2(String fieldname2) {
		this.fieldname2 = fieldname2;
	}






	public String getResname2() {
		return resname2;
	}






	public void setResname2(String resname2) {
		this.resname2 = resname2;
	}






	public int getRollno() {
		return rollno;
	}






	public void setRollno(int rollno) {
		this.rollno = rollno;
	}






	public String getResname() {
		return resname;
	}
	public void setResname(String resname) {
		this.resname = resname;
	}
	public String getFieldname() {
		return fieldname;
	}
	public void setFieldname(String fieldname) {
		this.fieldname = fieldname;
	}
	public String getFieldvalue() {
		return fieldvalue;
	}
	public void setFieldvalue(String fieldvalue) {
		this.fieldvalue = fieldvalue;
	}
	@Override
	public String toString() {
		return "ResourceNotFoundException [resname=" + resname + ", fieldname=" + fieldname + ", fieldvalue="
				+ fieldvalue + ", fieldname2=" + fieldname2 + ", resname2=" + resname2 + ", rollno=" + rollno + "]";
	}






	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}






	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}






	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}






	@Override
	public Iterator<Student> iterator() {
		// TODO Auto-generated method stub
		return null;
	}






	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}






	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}






	@Override
	public boolean add(Student e) {
		// TODO Auto-generated method stub
		return false;
	}






	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}






	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}






	@Override
	public boolean addAll(Collection<? extends Student> c) {
		// TODO Auto-generated method stub
		return false;
	}






	@Override
	public boolean addAll(int index, Collection<? extends Student> c) {
		// TODO Auto-generated method stub
		return false;
	}






	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}






	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}






	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}






	@Override
	public Student get(int index) {
		// TODO Auto-generated method stub
		return null;
	}






	@Override
	public Student set(int index, Student element) {
		// TODO Auto-generated method stub
		return null;
	}






	@Override
	public void add(int index, Student element) {
		// TODO Auto-generated method stub
		
	}






	@Override
	public Student remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}






	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}






	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}






	@Override
	public ListIterator<Student> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}






	@Override
	public ListIterator<Student> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}






	@Override
	public List<Student> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
