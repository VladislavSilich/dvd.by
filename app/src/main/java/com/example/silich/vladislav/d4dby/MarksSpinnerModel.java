package com.example.silich.vladislav.d4dby;

/**
 * Created by Lenovo on 16.11.2017.
 */

public class MarksSpinnerModel {
	public String id;
	public String value;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public MarksSpinnerModel (String id, String value){
		this.id = id;
		this.value = value;

	}
}
