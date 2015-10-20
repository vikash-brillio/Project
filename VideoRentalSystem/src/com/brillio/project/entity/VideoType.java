package com.brillio.project.entity;

public class VideoType {

	private int typeId;
	private String videoType;
	private double chargesPerDay;
	private double penalty;
	
	public VideoType() {
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public String getVideoType() {
		return videoType;
	}

	public void setVideoType(String videoType) {
		this.videoType = videoType;
	}

	public double getChargesPerDay() {
		return chargesPerDay;
	}

	public void setChargesPerDay(double chargesPerDay) {
		this.chargesPerDay = chargesPerDay;
	}

	public double getPenalty() {
		return penalty;
	}

	public void setPenalty(double penalty) {
		this.penalty = penalty;
	}

	@Override
	public String toString() {
		return String.format("VideoType [typeId=%s, videoType=%s, chargesPerDay=%s, penalty=%s]", typeId, videoType,
				chargesPerDay, penalty);
	}
	
	
	
	
	
	
	
	
	
}
