package com.nava.challengue.nava;

public class Column {

	private String name;
	private Integer width;
	private String dataType;
	
	public Column() {
		
	}
	
	public Column(String name, Integer width, String dataType) {
		super();
		this.name = name;
		this.width = width;
		this.dataType = dataType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	
	
}
