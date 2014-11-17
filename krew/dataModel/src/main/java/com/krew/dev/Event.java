package com.krew.dev;

import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;

import com.google.gson.Gson;

public class Event {
	public class Point {
		private float longitude;
		private float latitude;
		
		public float getLong() {
			return this.longitude;
		}
		
		public float getLat() {
			return this.latitude;
		}
		
		public void setLong(float lon) {
			this.longitude = lon;
		}
		public void setLat(float lat) {
			this.latitude = lat;
		}
	}
	private Integer id;
	private List<User> krewList;
	private DateTime startDate;
	private DateTime endDate;
	private Map<User,Map<DateTime,Point>> locations;
	private final static Gson  GSON = new Gson();
	
	public void setKrew(List<User> krew) {
		this.krewList = krew;
	}
	
	public List<User> getKrew() {
		return this.krewList;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	public void setStartDate(DateTime start) {
		this.startDate = start;
	}
	
	public DateTime getStartDate() {
		return this.startDate;
	}
	
	public void setEndDate(DateTime end) {
		this.endDate = end;
	}
	
	public DateTime getEndDate() {
		return this.endDate;
	}
	
	public Map<User,Map<DateTime,Point>> getLocations() {
		return this.locations;
	}
	
	public void setLocations(Map<User,Map<DateTime,Point>> locs) {
		this.locations = locs;
	}
	
	public  String toJson() { 
		return GSON.toJson(this);
	}
	
	public static Event fromJson(String json) {
		Event e = GSON.fromJson(json, Event.class);
		return e;
	}
	
	//look into mongo collections format..need to be able to create list of objects, if returned json array of serialized obj from db
}
