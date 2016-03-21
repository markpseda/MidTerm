package com.cisc181.core;

import java.util.Date;
import java.util.UUID;
import com.cisc181.eNums.eMajor;

public class Course extends Semester{
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	
	public Course(){
		super();
		this.CourseID = UUID.randomUUID();
	}
	
	public Course(Date startDate, Date endDate, String courseName, int gradePoints, eMajor major) {
		super(startDate, endDate);
		this.CourseID = UUID.randomUUID();
		CourseName = courseName;
		GradePoints = gradePoints;
		Major = major;
	}
	
	
	public Course(Date startDate, Date endDate) {
		super(startDate, endDate);
		// TODO Auto-generated constructor stub
	}

	public eMajor getMajor() {
		return Major;
	}

	public void seteMajor(eMajor Major) {
		this.Major = Major;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public int getGradePoints() {
		return GradePoints;
	}

	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}
	
}
