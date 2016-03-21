package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;


public class Student_Test {
	
	
	static ArrayList<Course> courseList;
	static Course firstCourse;
	static Course secondCourse;
	static Course thirdCourse;
	
	static ArrayList<Semester> semesterList;
	static Semester Fall;
	static Semester Spring;
	
	static ArrayList<Section> sectionList;
	static Section Section1Fall;
	static Section Section2Fall;
	static Section Section3Fall;
	static Section Section1Spring;
	static Section Section2Spring;
	static Section Section3Spring;
	
	static ArrayList<Student> studList;
	static Student stud1;
	static Student stud2;
	static Student stud3;
	static Student stud4;
	static Student stud5;
	static Student stud6;
	static Student stud7;
	static Student stud8;
	static Student stud9;
	static Student stud10;
	

	static ArrayList<Enrollment> enrollList = new ArrayList<Enrollment>();
	

	@BeforeClass
	public static void setup() {
		studList = new ArrayList<Student>();
		stud1 = new Student("First", "Middle", "Last", new Date(), eMajor.PHYSICS, "address", "(302)-222-2222", "email@email");
		stud2 = new Student("First", "Middle", "Last", new Date(), eMajor.PHYSICS, "address", "(302)-222-2222", "email@email");
		stud3 = new Student("First", "Middle", "Last", new Date(), eMajor.PHYSICS, "address", "(302)-222-2222", "email@email");
		stud4 = new Student("First", "Middle", "Last", new Date(), eMajor.PHYSICS, "address", "(302)-222-2222", "email@email");
		stud5 = new Student("First", "Middle", "Last", new Date(), eMajor.PHYSICS, "address", "(302)-222-2222", "email@email");
		stud6 = new Student("First", "Middle", "Last", new Date(), eMajor.PHYSICS, "address", "(302)-222-2222", "email@email");
		stud7 = new Student("First", "Middle", "Last", new Date(), eMajor.PHYSICS, "address", "(302)-222-2222", "email@email");
		stud8 = new Student("First", "Middle", "Last", new Date(), eMajor.PHYSICS, "address", "(302)-222-2222", "email@email");
		stud9 = new Student("First", "Middle", "Last", new Date(), eMajor.PHYSICS, "address", "(302)-222-2222", "email@email");
		stud10 = new Student("First", "Middle", "Last", new Date(), eMajor.PHYSICS, "address", "(302)-222-2222", "email@email");
		studList.add(stud1);
		studList.add(stud2);
		studList.add(stud3);
		studList.add(stud4);
		studList.add(stud5);
		studList.add(stud6);
		studList.add(stud7);
		studList.add(stud8);
		studList.add(stud9);
		studList.add(stud10);
		
		sectionList = new ArrayList<Section>();
		Section1Fall = new Section(new Date(), new Date(), "Physics305", 12, eMajor.PHYSICS, 232);
		Section2Fall = new Section(new Date(), new Date(), "Chemisty101", 8, eMajor.CHEM, 232);
		Section3Fall = new Section(new Date(), new Date(), "ComputerScience205", 12, eMajor.COMPSCI, 232);
		Section1Spring = new Section(new Date(), new Date(), "Nursing511", 16, eMajor.NURSING, 232);
		Section2Spring = new Section(new Date(), new Date(), "Business400", 12, eMajor.BUSINESS, 232);
		Section3Spring = new Section(new Date(), new Date(), "IntroToPhysics", 8, eMajor.PHYSICS, 232);
		
		sectionList.add(Section1Fall);
		sectionList.add(Section2Fall);
		sectionList.add(Section3Fall);
		sectionList.add(Section1Spring);
		sectionList.add(Section2Spring);
		sectionList.add(Section3Spring);
		
		
		for(Student s: studList)
			for(Section c: sectionList)
				enrollList.add(new Enrollment(s.getStudentID(),c.getSectionID()));
	}
	
	@Test
	public void EnrollTest(){
		//enrollList was performed BeforeClass so the below tests could use it.
		//There should be 60 enrollments; 10 students * 6 sections
		assertTrue(enrollList.size() == 60);
		
		
				
	}

	@Test
	public void GPAtest() {
		//You said to use "grade points" which are credit hours * 4. It works out but I know this is not
		//convention when it comes to getting grades.
		//All student 1 below, because of for:each loop above
		enrollList.get(0).setGrade(3.0);// * 12 grade points = 36
		enrollList.get(1).setGrade(4.0);// * 8 grade points = 32
		enrollList.get(2).setGrade(2.0);// * 12 grade points = 24
		enrollList.get(3).setGrade(3.0);// * 16 grade points = 48
		enrollList.get(4).setGrade(2.0);// * 12 grade points = 24
		enrollList.get(5).setGrade(4.0);// * 8 grade points = 32
		
		enrollList.get(6).setGrade(2.0); //this is a different student, it should not affect output(diff. studentID)
		// added together is 196 / (12+8+12+16+12+8) = 2.88235
		double correctGPA = (12.0*3+4*8+2*12+3*16+2*12+4*8)/(12+8+12+16+12+8);
		
		double stud1CumPoints = 0;
		int cumPointsTotal = 0;
		for(Enrollment e: enrollList)
			if(e.getStudentID() == studList.get(0).getStudentID()){
				for(Section s: sectionList)
					if(s.getSectionID() == e.getSectionID()){
						stud1CumPoints += e.getGrade() * s.getGradePoints();
						cumPointsTotal+= s.getGradePoints();
					}	
			}
		double stud1GPA = stud1CumPoints/cumPointsTotal;
		assertEquals(stud1GPA, correctGPA, .001);
		
	}
	@Test
	public void CourseAveragetest(){
		ArrayList<Double> grades = new ArrayList<Double>();
		for(double i = 0; i < enrollList.size(); i++)
			grades.add(i % 4 + 1); 			//alternates 1.0, 2.0, 3.0, 4.0, 1.0 ...
											//1.0 for enrollments: 0,4,8,12,16,20,24,28,32,... up through 60
											//2.0 for enrollments: 1,5,9,13,17,21,25,29,33,... up through 37
											//3.0 for enrollments: 2,6,10,14,18,22,26,30,34... up through 38
											//4.0 for enrollments: 3,7,11,15,19,23,27,31,35... up through 29
	// The way I set up the courses in this case each section being a different course
	}
	
	@Test
	public void changeMajorTest(){
		String oldMajor = studList.get(5).getMajor().toString();
		studList.get(5).setMajor(eMajor.BUSINESS);
		String newMajor = studList.get(5).getMajor().toString();
		assertTrue(oldMajor != newMajor);
		
	}
}
