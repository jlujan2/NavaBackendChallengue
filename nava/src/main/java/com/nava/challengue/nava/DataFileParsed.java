package com.nava.challengue.nava;

public class DataFileParsed {
	
	private String measureId;
	private Integer performanceYear;
	private boolean isRequired;
	private Integer minScore;
	
	public DataFileParsed() {
		
	}
	
	public DataFileParsed(String measureId, Integer performanceYear, boolean isRequired, Integer minScore) {
		super();
		this.measureId = measureId;
		this.performanceYear = performanceYear;
		this.isRequired = isRequired;
		this.minScore = minScore;
	}
	public String getMeasureId() {
		return measureId;
	}
	public void setMeasureId(String measureId) {
		this.measureId = measureId;
	}
	public Integer getPerformanceYear() {
		return performanceYear;
	}
	public void setPerformanceYear(Integer performanceYear) {
		this.performanceYear = performanceYear;
	}
	public boolean isRequired() {
		return isRequired;
	}
	public void setRequired(boolean isRequired) {
		this.isRequired = isRequired;
	}
	public Integer getMinScore() {
		return minScore;
	}
	public void setMinScore(Integer minScore) {
		this.minScore = minScore;
	}
	
	
	
}
