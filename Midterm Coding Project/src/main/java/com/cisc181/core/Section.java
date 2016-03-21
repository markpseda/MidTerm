package com.cisc181.core;
import java.util.Date;
import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Section extends Course{
	private UUID SectionID;
	private int RoomID;
	
	public Section(){
		super();
		SectionID = UUID.randomUUID();
	}
	public Section(Date startDate, Date endDate, String courseName, int gradePoints, eMajor major, int RoomID){
		super(startDate, endDate, courseName, gradePoints, major);
		SectionID = UUID.randomUUID();
		this.RoomID = RoomID;
	}
	
	public int getRoomID() {
		return RoomID;
	}
	public void setRoomID(int roomID) {
		RoomID = roomID;
	}
	public UUID getSectionID(){
		return this.SectionID;
	}
	

}
