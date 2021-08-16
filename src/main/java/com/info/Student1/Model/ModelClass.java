package com.info.Student1.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ModelClass {
	@Id
	private int id;
	private int marks;
	private float avg;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg2) {
		this.avg = avg2;
	}
}
