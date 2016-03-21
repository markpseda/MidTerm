/**
 * 
 */
package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

/**
 * @author Dad
 *
 */
public class Employee_Test {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(1,1);
	}

}


/*

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
	

	@BeforeClass
	public static void setup() {
		
		stud1 = new Student("First", "Middle", "Last", null, eMajor.PHYSICS, null, null, null);
		stud2 = new Student("First", "Middle", "Last", null, eMajor.PHYSICS, null, null, null);
		stud3 = new Student("First", "Middle", "Last", null, eMajor.PHYSICS, null, null, null);
		stud4 = new Student("First", "Middle", "Last", null, eMajor.PHYSICS, null, null, null);
		stud5 = new Student("First", "Middle", "Last", null, eMajor.PHYSICS, null, null, null);
		stud6 = new Student("First", "Middle", "Last", null, eMajor.PHYSICS, null, null, null);
		stud7 = new Student("First", "Middle", "Last", null, eMajor.PHYSICS, null, null, null);
		stud8 = new Student("First", "Middle", "Last", null, eMajor.PHYSICS, null, null, null);
		stud9 = new Student("First", "Middle", "Last", null, eMajor.PHYSICS, null, null, null);
		stud10 = new Student("First", "Middle", "Last", null, eMajor.PHYSICS, null, null, null);
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
		
	
		Section1Fall = new Section(new Date(), new Date(), "Physics305", 4, eMajor.PHYSICS, 232);
		Section2Fall = new Section(new Date(), new Date(), "Physics305", 4, eMajor.PHYSICS, 232);
		Section3Fall = new Section(new Date(), new Date(), "Physics305", 4, eMajor.PHYSICS, 232);
		Section1Spring = new Section(new Date(), new Date(), "Physics305", 4, eMajor.PHYSICS, 232);
		Section2Spring = new Section(new Date(), new Date(), "Physics305", 4, eMajor.PHYSICS, 232);
		Section3Spring = new Section(new Date(), new Date(), "Physics305", 4, eMajor.PHYSICS, 232);
		
		sectionList.add(Section1Fall);
		sectionList.add(Section2Fall);
		sectionList.add(Section3Fall);
		sectionList.add(Section1Spring);
		sectionList.add(Section2Spring);
		sectionList.add(Section3Spring);
		
		/*
		firstCourse = new Section("Physics308", 4, eMajor.PHYSICS);
		secondCourse = new Course("CompSci204", 3, eMajor.COMPSCI);
		thirdCourse = new Course("Chemistry101", 4, eMajor.CHEM);
		courseList.add(firstCourse);
		courseList.add(secondCourse);
		courseList.add(thirdCourse);
		
		
		
	
	}
	
	@Test
	public void EnrollTest(){
		
		ArrayList<Enrollment> enrollList = new ArrayList<Enrollment>();
		
		for(Student s: studList)
			for(Section c: sectionList)
				enrollList.add(new Enrollment(s.getStudentID(),c.getSectionID()));
				
	}

	@Test
	public void GPAtest() {
		assertEquals(1, 1);
	}
	@Test
	public void CourseAveragetest(){
		assertEquals(1,1);
	}
}
*/
